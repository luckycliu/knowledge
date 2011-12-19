package japidviews.rsecure.Secure;
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
// NOTE: This file was generated from: japidviews/rsecure/Secure/login.html
// Change to this file will be lost next time the template file is compiled.
//
@cn.bran.play.NoEnhance
public class login extends cn.bran.play.JapidTemplateBase
{	public static final String sourceTemplate = "japidviews/rsecure/Secure/login.html";
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


	public login() {
		super(null);
	}
	public login(StringBuilder out) {
		super(out);
	}
/* based on https://github.com/branaway/Japid/issues/12
 */
public static final String[] argNames = new String[] {/* args of the template*/ };
public static final String[] argTypes = new String[] {/* arg types of the template*/ };
public static final Object[] argDefaults= new Object[] { };
public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews.rsecure.Secure.login.class);

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

// -- set up the tag objects
final v_msg _v_msg0 = new v_msg(getOut());
{ _v_msg0.setActionRunners(getActionRunners()); }

final authenticityToken _authenticityToken1 = new authenticityToken(getOut());
{ _authenticityToken1.setActionRunners(getActionRunners()); }

final v_msg _v_msg2 = new v_msg(getOut());
{ _v_msg2.setActionRunners(getActionRunners()); }

final v_msg _v_msg3 = new v_msg(getOut());
{ _v_msg3.setActionRunners(getActionRunners()); }

// -- end of the tag objects

//------
p("<form method=\"post\" action=\"");// line 1
		p(lookup("authenticate", new Object[]{}));// line 1
		p("\">\n" + 
"	");// line 1
		_v_msg0.setOut(getOut()); _v_msg0.render("form");// line 2
		p("\n" + 
"	");// line 2
		_authenticityToken1.setOut(getOut()); _authenticityToken1.render();// line 3
		p("	Email:\n" + 
"	<input type=\"email\" name=\"username\" />");// line 3
		_v_msg2.setOut(getOut()); _v_msg2.render("username");// line 5
		p("<br/>\n" + 
"	Password:\n" + 
"	<input name=\"password\" type=\"password\" />");// line 5
		_v_msg3.setOut(getOut()); _v_msg3.render("password");// line 7
		p("<br/>\n" + 
"	Remember me\n" + 
"	<input type=\"checkbox\" name=\"remember\" id=\"remember\" value=\"true\"/><br/>\n" + 
"	<input type=\"submit\" value=\"login\" /><br/>\n" + 
"</form>");// line 7
		
	}

}