package japidviews.Demo;
import java.util.*;
import java.io.*;
import cn.bran.japid.tags.Each;
import models.users.*;
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
// NOTE: This file was generated from: japidviews/Demo/index.html
// Change to this file will be lost next time the template file is compiled.
//
@cn.bran.play.NoEnhance
public class index extends noneSideBar_layout
{	public static final String sourceTemplate = "japidviews/Demo/index.html";
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


	public index() {
		super(null);
	}
	public index(StringBuilder out) {
		super(out);
	}
/* based on https://github.com/branaway/Japid/issues/12
 */
public static final String[] argNames = new String[] {/* args of the template*/ };
public static final String[] argTypes = new String[] {/* arg types of the template*/ };
public static final Object[] argDefaults= new Object[] { };
public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews.Demo.index.class);

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
;// line 1
// line 3
		;// line 41
		
	}

public String content() {
StringBuilder sb = new StringBuilder();
StringBuilder ori = getOut();
this.setOut(sb);
// line 3
		p("<h3>Demo Management</h3>\n" + 
"\n" + 
"<div>\n" + 
"	<ul>\n" + 
"		<li><a href=\"");// line 3
		p(lookup("Demo.reloadData", new Object[]{}));// line 8
		p("\">Reload Default Data</a> - will reset all data</li>\n" + 
"	</ul>\n" + 
"</div>\n" + 
"\n" + 
"<div>\n" + 
"	<h4>Users</h4>\n" + 
"	<table class=\"list\">\n" + 
"		<thead>\n" + 
"		<tr>\n" + 
"			<th>user id</th>\n" + 
"			<th>email</th>\n" + 
"			<th>first name</th>\n" + 
"			<th>last name</th>\n" + 
"			<th>state</th>\n" + 
"			<th>actions</th>\n" + 
"		</tr>\n" + 
"		</thead>\n" + 
"		<tbody>\n" + 
"	");// line 8
		List<User> users = User.all().order("_id").asList();// line 26
		p("	");// line 26
		for(User user : users){// line 27
		p("		<tr>\n" + 
"			<td>");// line 27
		p(user.getId());// line 29
		p("</td>\n" + 
"			<td>");// line 29
		p(user.email);// line 30
		p("</td>\n" + 
"			<td>");// line 30
		p(user.firstName);// line 31
		p("</td>\n" + 
"			<td>");// line 31
		p(user.lastName);// line 32
		p("</td>\n" + 
"			<td>");// line 32
		p(user.state);// line 33
		p("</td>\n" + 
"			<td><a href=\"");// line 33
		p(lookup("Demo.loginAs", user.getId()));// line 34
		p("\" >Log in as this user</a></td>\n" + 
"		</tr>\n" + 
"	");// line 34
		}// line 36
		p("		</tbody>\n" + 
"	</table>\n" + 
"</div>\n" + 
"\n");// line 36
		
this.setOut(ori);
return sb.toString();
}
}