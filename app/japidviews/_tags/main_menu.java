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
// NOTE: This file was generated from: japidviews/_tags/main_menu.html
// Change to this file will be lost next time the template file is compiled.
//
@cn.bran.play.NoEnhance
public class main_menu extends cn.bran.play.JapidTemplateBase
{	public static final String sourceTemplate = "japidviews/_tags/main_menu.html";
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


	public main_menu() {
		super(null);
	}
	public main_menu(StringBuilder out) {
		super(out);
	}
/* based on https://github.com/branaway/Japid/issues/12
 */
public static final String[] argNames = new String[] {/* args of the template*/ };
public static final String[] argTypes = new String[] {/* arg types of the template*/ };
public static final Object[] argDefaults= new Object[] { };
public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews._tags.main_menu.class);

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
p("<div id=\"main-menu\">\n" + 
"	<ul>\n" + 
"		<li><a href=\"");// line 1
		p(lookup("Application.index", new Object[]{}));// line 3
		p("\" class=\"new-issue\">Home</a></li>\n" + 
"		<!-- \n" + 
"		<li><a href=\"/projects/resume/activity\" class=\"activity\">Areas</a></li>\n" + 
"		<li><a href=\"/projects/resume/issues\" class=\"issues selected\">Agents</a></li>\n" + 
"		<li><a href=\"/projects/resume/issues/gantt\" class=\"gantt\">Gantt</a></li>\n" + 
"		<li><a href=\"/projects/resume/issues/calendar\"\n" + 
"			class=\"calendar\">Calendar</a></li>\n" + 
"		<li><a href=\"/projects/resume/news\" class=\"news\">News</a></li>\n" + 
"		<li><a href=\"/projects/resume/documents\" class=\"documents\">Documents</a></li>\n" + 
"		<li><a href=\"/projects/resume/wiki\" class=\"wiki\">Wiki</a></li>\n" + 
"		<li><a href=\"/projects/resume/files\" class=\"files\">Files</a></li>\n" + 
"		<li><a href=\"\" class=\"settings\">Settings</a></li>\n" + 
"		 -->\n" + 
"	</ul>\n" + 
"</div>");// line 3
		
	}

}