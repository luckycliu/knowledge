package models;

import java.util.Date;
import java.util.List;
import java.util.Random;

import models.users.User;
import play.Logger;
import play.Play;
import play.modules.rsolr.RSolr;
import play.test.MorphiaFixtures;
import rbase.models.IdTools;

public class DemoData {
	public static Random random = new Random();

	public static void reloadDemoData() {
		String mail_stmp = "";
		if (!Play.configuration.getProperty("mail.smtp", "").equals("mock")) {
			mail_stmp = Play.configuration.getProperty("mail.smtp", "");
			Play.configuration.put("mail.smtp", "mock");
		}
		try {
			IdTools.resetAllIds();
			MorphiaFixtures.deleteAllModels();
			RSolr.i.solrServer.deleteByQuery("*:*");
			MorphiaFixtures.loadModels(Play.configuration.getProperty("demo.data", "demo-data-v2.yml"));

		} catch (Exception e) {
			Logger.error(e, "Fail to reload demo data.");
		}
		Play.configuration.put("mail.smtp", mail_stmp);
	}

	public static User getRandomUser(List<User> users) {
		return users.get(random.nextInt(users.size()));
	}

	private static Date getRandomDate() {
		return new Date(new Date().getTime() - (random.nextInt(23) + 1) * 60 * 60 * 1000);
	}
}
