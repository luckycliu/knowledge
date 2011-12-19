package japidviews._javatags;

import java.util.Date;

import models.users.User;
import play.mvc.Http.Request;
import play.mvc.Scope.Params;
import play.mvc.Scope.RenderArgs;
import controllers.SubMenu;
import controllers.rsecure.Security.Helper;

/**
 * a well-know place to add all the static method you want to use in your templates.
 * 
 * All the public static methods will be automatically "import static " to the generated Java classes by the Japid compiler.
 * 
 */
public class JapidWebUtil {
	
	public static final String CHECK_LOGGED_IN = "logged in";
	public static final String CHECK_BUSER = "buser";
	
	public static String hi() {
		return "Hi";
	}

	public static User user() {
		return (User) RenderArgs.current().get("user");
	}

	public static boolean check(String profile) {
		return Helper.check(profile);
	}

	public static User emailRecipient() {
		return (User) RenderArgs.current().get("emailRecipient");
	}

	public static String isCurrentSubMenu(SubMenu menu) {
		if (menu == RenderArgs.current().get("currentSubMenu"))
			return "selected";
		else
			return "";
	}

	public static String sinceFrom(Date date) {
		long sinceTime = (new Date().getTime() - date.getTime()) / 1000;
		if (sinceTime < 1) {
			return "just now";
		} else if (sinceTime < 60) {
			return String.format("%s seconds ago", sinceTime);
		} else if (sinceTime < 3600) {
			return String.format("%s minutes ago", sinceTime / 60);
		} else if (sinceTime < 24 * 3600) {
			return String.format("%s hours ago", sinceTime / 3600);
		} else if (sinceTime < (24 * 3600 * 30)) {
			long days = sinceTime / (24 * 3600);
			long hours = (sinceTime % (24 * 3600)) / 3600;
			if (hours == 0)
				return String.format("%s days ago", days);
			else
				return String.format("%s days, %s hours ago", days, hours);
		} else {
			long months = sinceTime / (24 * 3600 * 30);
			long days = (sinceTime % (24 * 3600 * 30)) / (24 * 3600);
			if (days == 0)
				return String.format("%s months ago", months);
			else
				return String.format("%s months, %s days ago", months, days);
		}

	}
}
