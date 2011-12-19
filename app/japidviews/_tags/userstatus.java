package japidviews._tags;
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
// NOTE: This file was generated from: japidviews/_tags/userstatus.html
// Change to this file will be lost next time the template file is compiled.
//
@cn.bran.play.NoEnhance
public class userstatus extends cn.bran.play.JapidTemplateBase
{	public static final String sourceTemplate = "japidviews/_tags/userstatus.html";
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


	public userstatus() {
		super(null);
	}
	public userstatus(StringBuilder out) {
		super(out);
	}
/* based on https://github.com/branaway/Japid/issues/12
 */
public static final String[] argNames = new String[] {/* args of the template*/ };
public static final String[] argTypes = new String[] {/* arg types of the template*/ };
public static final Object[] argDefaults= new Object[] { };
public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews._tags.userstatus.class);

{
	setRenderMethod(renderMethod);
	setArgNames(argNames);
	setArgTypes(argTypes);
	setArgDefaults(argDefaults);
	setSourceTemplate(sourceTemplate);

}
////// end of named args stuff

	public cn.bran.japid.template.RenderResult render() {
		long t = -1;
		try {super.layout();} catch (RuntimeException e) { super.handleException(e);}
		return new cn.bran.japid.template.RenderResultPartial(getHeaders(), getOut(), t, actionRunners);
	}
	@Override protected void doLayout() {
//------
p("<div id=\"account\">\n" + 
"<ul>\n");// line 1
		if(user() == null){// line 3
		p("	<li><a class=\"login\" href=\"");// line 3
		p(lookup("rsecure.Secure.login", new Object[]{}));// line 4
		p("\">Log in</a></li>\n");// line 4
		}else{// line 5
		p("	<li><a href=\"");// line 5
		p(lookup("rsecure.Secure.logout", new Object[]{}));// line 6
		p("\">Log out</a></li>\n");// line 6
		}// line 7
		p("</ul>\n" + 
"</div>\n");// line 7
		if(user() != null){// line 10
		p("<div id=\"loggedas\">\n" + 
"	welcome: ");// line 10
		p(user().fullName());// line 12
		p("\n" + 
"</div>\n");// line 12
		}// line 14
		
	}

}