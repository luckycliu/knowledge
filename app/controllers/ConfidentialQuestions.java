package controllers;

import rbase.controllers.BaseController;

public class ConfidentialQuestions extends BaseController {
	public static void publicQuesions() {
		renderArgs.put("currentSubMenu", SubMenu.MY_CONFIDENTIAL_QUESTIONS);
		renderJapid();
	}
}
