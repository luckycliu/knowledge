package rbase.models;

import java.util.Date;

import play.modules.morphia.Model;
import play.modules.morphia.MorphiaPlugin;

public abstract class BaseModel extends Model {
	public Date created;
	public Date modified;

	public String getKind() {
		return MorphiaPlugin.morphia().getMapper().getCollectionName(this);
	}

	@OnAdd
	protected void fillInCreatedTimestamp() {
		if (created == null)
			created = new Date();
	}

	@OnAdd
	@OnUpdate
	protected void fillInUpdatedTimestamp() {
		modified = new Date();
	}

}
