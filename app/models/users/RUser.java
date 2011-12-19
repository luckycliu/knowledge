package models.users;

import play.data.validation.Email;
import play.data.validation.MaxSize;
import play.data.validation.MinSize;
import play.data.validation.Required;
import play.libs.Codec;
import play.modules.morphia.Model.OnAdd;
import play.modules.morphia.Model.OnUpdate;
import rbase.models.SolrModel;
import rbase.validator.Unique;

import com.google.code.morphia.annotations.Indexed;

public abstract class RUser extends SolrModel {
	//TODO email should be unique, but now for test reason, I removed the limit
	@Indexed
	@Email
	@Required
	@MaxSize(128)
	@Unique
	public String email;

	@Required
	@MaxSize(16)
	@MinSize(6)
	public String password;

	@Required
	@MaxSize(64)
	public String firstName;

	@Required
	@MaxSize(64)
	public String lastName;

	@OnAdd
	@OnUpdate
	protected void encryptPassword() {
		password = Codec.hexSHA1(password);
	}
}
