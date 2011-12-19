package rbase.models;

import play.modules.morphia.Model;
import play.modules.morphia.MorphiaPlugin;

import com.google.code.morphia.annotations.Entity;
import com.google.code.morphia.annotations.Id;
import com.google.code.morphia.query.Query;
import com.google.code.morphia.query.UpdateOperations;

public class IdTools {
	public static <T extends Model> Long generateLongId(Class c) {
		String idName = c.getCanonicalName();
		Query q = MorphiaPlugin.ds().find(LongIdEntity.class, "_id", idName);
		UpdateOperations uOps = MorphiaPlugin.ds().createUpdateOperations(LongIdEntity.class).inc("value");
		LongIdEntity newId = (LongIdEntity) MorphiaPlugin.ds().findAndModify(q, uOps);
		if (newId == null) {
			newId = new LongIdEntity(idName);
			MorphiaPlugin.ds().save(newId);
		}
		return newId.getValue();
	}

	public static void resetAllIds() {
		MorphiaPlugin.ds().delete(MorphiaPlugin.ds().createQuery(LongIdEntity.class));
	}

	@Entity(value = "ids", noClassnameStored = true)
	public static class LongIdEntity {
		@Id
		final String idName;
		protected Long value = Long.valueOf(1L);

		public LongIdEntity(String idName) {
			this.idName = idName;
		}

		public Long getValue() {
			return this.value;
		}
	}
}
