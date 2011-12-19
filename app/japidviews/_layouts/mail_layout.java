package japidviews._layouts;
import java.util.*;
import java.io.*;
import cn.bran.japid.tags.Each;
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
// NOTE: This file was generated from: japidviews/_layouts/mail_layout.html
// Change to this file will be lost next time the template file is compiled.
//
@cn.bran.play.NoEnhance
public abstract class mail_layout extends cn.bran.play.JapidTemplateBase
{	public static final String sourceTemplate = "japidviews/_layouts/mail_layout.html";
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


	public mail_layout() {
		super(null);
	}
	public mail_layout(StringBuilder out) {
		super(out);
	}
	@Override public void layout() {
		;// line 1
		doLayout();// line 1
		p("\n" + 
"<p style=\"color: #777;\">\n" + 
"This email was intended for ");// line 1
		p(emailRecipient().firstName);// line 3
		p(" ");// line 3
		p(emailRecipient().lastName);// line 3
		p(" Not you? Disable all email from Quora by visiting: \n" + 
"<a href=\"");// line 3
		p(lookupAbs("Emails.unsubscribe", new Object[]{}));// line 4
		p("\">unsubscribe</a>\n");// line 4
		p("</p>");// line 5
			}

	protected abstract void doLayout();
}