package controllers;

import java.io.IOException;

import models.DemoData;

import org.apache.solr.client.solrj.SolrServerException;

import play.Play;
import play.libs.Codec;
import play.mvc.Before;
import play.mvc.Http;
import rbase.controllers.BaseController;

public class Demo extends BaseController {
	@Before
	protected static void check() {
		Http.Header auth = request.headers.get("authorization");
		if (auth != null) {
			String encodedPassword = auth.value().substring("Basic ".length());
			String password = new String(Codec.decodeBASE64(encodedPassword));
			String user = password.substring(0, password.indexOf(':'));
			String pwd = password.substring((user + ":").length());
			if (!pwd.equals(Play.configuration.getProperty("coverq.demo", "demo")))
				unauthorized("You are not authorized");
		} else {
			unauthorized("You are not authorized");
		}
	}

	public static void index() {
		renderJapid();
	}

	public static void reloadData() throws SolrServerException, IOException {
		DemoData.reloadDemoData();
		index();
	}

	public static void loginAs(String email) {
		session.put("username", email);
		Application.index();
	}

}
