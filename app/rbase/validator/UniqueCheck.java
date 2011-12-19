package rbase.validator;

import java.lang.reflect.Field;

import net.sf.oval.Validator;
import net.sf.oval.configuration.annotation.AbstractAnnotationCheck;
import net.sf.oval.context.OValContext;
import net.sf.oval.exception.OValException;
import play.modules.morphia.Model;
import play.modules.morphia.Model.MorphiaQuery;

public class UniqueCheck extends AbstractAnnotationCheck<Unique> {
	private String query;
	private Class<? extends Model> type;
	private String scopeField;

	@Override
	public void configure(Unique annotation) {
		this.query = annotation.value();
		this.type = annotation.type();
		this.scopeField = annotation.scope();
	}

	@Override
	public boolean isSatisfied(Object validatedObject, Object value, OValContext context, Validator validator) throws OValException {
		if (value == null)
			return true;
		if (value instanceof String && ((String) value).length() == 0)
			return true;
		String fieldName = query;
		if (query.equals("")) {
			fieldName = context.toString().replaceAll(".*\\.", "");
		}
		Class<? extends Model> qType = type;
		if (type == Model.class) {
			qType = (Class<? extends Model>) validatedObject.getClass();
		}
		MorphiaQuery q = new MorphiaQuery(qType);
		q.filter(fieldName, value);
		long count = q.count();
		if (count == 0) {
			return true;
		} else if (count == 1) {
			Object scope = validatedObject;
			if (scopeField.length() > 0) {
				try {
					Field f = validatedObject.getClass().getField(scopeField);
					scope = f.get(validatedObject);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			Model m = q.first();
			if (m.equals(scope)) {
				return true;
			} else {
				return false;
			}
		} else
			return false;
	}
}
