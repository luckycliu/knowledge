package rbase.validator;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import net.sf.oval.configuration.annotation.Constraint;
import play.modules.morphia.Model;

@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.FIELD, ElementType.PARAMETER })
@Constraint(checkWith = UniqueCheck.class)
public @interface Unique {
	public abstract String value() default "";

	public abstract Class<? extends Model> type() default Model.class;

	public abstract String scope() default "";
}
