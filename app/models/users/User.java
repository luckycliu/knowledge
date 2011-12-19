package models.users;

import play.data.validation.MaxSize;
import play.data.validation.Required;

import com.google.code.morphia.annotations.Entity;

@Entity
public class User extends RUser {
	@Required
	@MaxSize(20)
	public String state;

	public Statistic statistic = new Statistic();

	public String getPhotoUrl() {
		return String.format("/public/images/photos/%s.jpg", this.getId());
	}

	public String fullName() {
		return firstName + " " + lastName;
	}

}
