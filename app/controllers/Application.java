package controllers;

import play.mvc.Before;
import play.mvc.Scope;
import play.mvc.With;
import rbase.controllers.BaseController;
import controllers.rsecure.Secure;
import controllers.rsecure.Security;

public class Application extends BaseController {

	@Before
	public static void fetchUser() throws Throwable {
		Security.Helper.fetchUser();
	}

	public static void index() {
		renderJapid();
	}

}