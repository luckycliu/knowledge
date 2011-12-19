package controllers.rsecure;

import japidviews._javatags.JapidWebUtil;
import models.users.User;
import play.Logger;
import play.libs.Codec;
import play.mvc.Scope.RenderArgs;
import play.mvc.Scope.Session;

public class Security extends Secure.Security {

	static boolean authenticate(String username, String password) {
		validation.required(username);
		validation.email(username);
		validation.required(password);
		if (!validation.hasErrors()) {
			User user = User.filter("email", username).filter("password", Codec.hexSHA1(password)).first();
			if (user == null) {
				validation.addError("form", "validation.usernameUnmatchPassword");
			}
			if (validation.hasErrors()) {
				return false;
			} else {
				session.put("username", user.email);
				return true;
			}
		} else {
			return false;
		}
	}

	static boolean check(String profile) {
		return false;
	}

	static void onDisconnected() {
	}

	static void onAuthenticated() {
	}

	public static class Helper {
		public static void fetchUser() throws Throwable {
			if (Security.isConnected()) {
				// TODO use email as username in production | use _id as username in demo
				// User user = User.filter("email", Session.current().get("username")).first();
				User user = User.filter("_id", Long.parseLong(Session.current().get("username"))).first();
				if (user == null) {
					Logger.error("Cannot find user %s", Session.current().get("username"));
					Secure.logout();
				} else {
					RenderArgs.current().put("user", user);
				}
			}
		}

		public static User user() {
			return (User) RenderArgs.current().get("user");
		}

		public static boolean check(String profile) {
			return Security.check(profile);
		}
	}
}
