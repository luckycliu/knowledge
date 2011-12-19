package japidviews._layouts;
import java.util.*;
import java.io.*;
import cn.bran.japid.tags.Each;
import static press.Plugin.*;
import static play.templates.JavaExtensions.*;
import static cn.bran.play.JapidPlayAdapter.*;
import static play.data.validation.Validation.*;
import japidviews._layouts.*;
import play.i18n.Messages;
import play.data.validation.Validation;
import play.mvc.Scope.*;
import models.*;
import static japidviews._javatags.JapidWebUtil.*;
import play.data.validation.Error;
import play.i18n.Lang;
import japidviews._tags.*;
import play.mvc.Http.*;
import controllers.*;
import japidviews._javatags.*;
//
// NOTE: This file was generated from: japidviews/_layouts/base_layout.html
// Change to this file will be lost next time the template file is compiled.
//
@cn.bran.play.NoEnhance
public abstract class base_layout extends cn.bran.play.JapidTemplateBase
{	public static final String sourceTemplate = "japidviews/_layouts/base_layout.html";
{
putHeader("Content-Type", "text/html; charset=utf-8");
}

// - add implicit fields with Play

	final Request request = Request.current(); 
	final Response response = Response.current(); 
	final Session session = Session.current();
	final RenderArgs renderArgs = RenderArgs.current();
	final Params params = Params.current();
	final Validation validation = Validation.current();
	final cn.bran.play.FieldErrors errors = new cn.bran.play.FieldErrors(validation);
	final play.Play _play = new play.Play(); 

// - end of implicit fields with Play 


	public base_layout() {
		super(null);
	}
	public base_layout(StringBuilder out) {
		super(out);
	}
	@Override public void layout() {
		;// line 1
		p("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01//EN\" \"http://www.w3.org/TR/html4/strict.dtd\">\n" + 
"<html xml:lang=\"en\">\n" + 
"<head>\n" + 
"<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n" + 
"<link href=\"/public/images/favicon.png\" type=\"image/png\" rel=\"shortcut icon\" />\n");// line 1
		p(addJS("libs/jquery-1.5.2.min.js", false));// line 7
		;// line 7
		p(addJS("business/common.js", true));// line 8
		;// line 8
		js();;// line 9
		p(compressedJSTag());// line 10
		;// line 10
		p(addCSS("main.css", true));// line 11
		;// line 11
		p(addCSS("theme.css", true));// line 12
		;// line 12
		p(addCSS("additional.css", true));// line 13
		;// line 13
		p(addCSS("font.css", true));// line 14
		;// line 14
		css();;// line 15
		p(compressedCSSTag());// line 16
		;// line 16
		inlinejs();p("<title>");// line 17
		title();p("</title>\n" + 
"</head>\n");// line 18
		body();p("\n");// line 20
		doLayout();// line 22
		p("</html>\n");// line 22
			}
	 protected void body() {};
	 protected void title() {};
	 protected void inlinejs() {};
	 protected void js() {};
	 protected void css() {};

	protected abstract void doLayout();
}