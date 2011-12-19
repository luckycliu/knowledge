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
// NOTE: This file was generated from: japidviews/_layouts/main_layout.html
// Change to this file will be lost next time the template file is compiled.
//
@cn.bran.play.NoEnhance
public class main_layout extends base_layout
{	public static final String sourceTemplate = "japidviews/_layouts/main_layout.html";
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


	public main_layout() {
		super(null);
	}
	public main_layout(StringBuilder out) {
		super(out);
	}
/* based on https://github.com/branaway/Japid/issues/12
 */
public static final String[] argNames = new String[] {/* args of the template*/ };
public static final String[] argTypes = new String[] {/* arg types of the template*/ };
public static final Object[] argDefaults= new Object[] { };
public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews._layouts.main_layout.class);

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
// line 5
		
	}

	@Override protected void body() {
final userstatus _userstatus3 = new userstatus(getOut());
{ _userstatus3.setActionRunners(getActionRunners()); }

final topMenu _topMenu4 = new topMenu(getOut());
{ _topMenu4.setActionRunners(getActionRunners()); }

final searchBar _searchBar5 = new searchBar(getOut());
{ _searchBar5.setActionRunners(getActionRunners()); }

final main_menu _main_menu6 = new main_menu(getOut());
{ _main_menu6.setActionRunners(getActionRunners()); }

		// line 5
		p("<body>\n" + 
"	<div id=\"wrapper\">\n" + 
"		<div id=\"wrapper2\">\n" + 
"			<div id=\"top-menu\">\n" + 
"				");// line 5
		_userstatus3.setOut(getOut()); _userstatus3.render();// line 10
		p("				");// line 10
		_topMenu4.setOut(getOut()); _topMenu4.render();// line 11
		p("			</div>\n" + 
"			<div id=\"header\">\n" + 
"				");// line 11
		_searchBar5.setOut(getOut()); _searchBar5.render();// line 14
		p("\n" + 
"				<h1><a style=\"text-decoration: none;\" href=\"");// line 14
		p(lookup("Application.index", new Object[]{}));// line 16
		p("\">Cojeel - Demo</a></h1>\n" + 
"\n" + 
"				");// line 16
		_main_menu6.setOut(getOut()); _main_menu6.render();// line 18
		p("\n" + 
"			</div>\n" + 
"\n" + 
"			");// line 18
		p(main_content());// line 22
		p("\n" + 
"\n" + 
"			<div id=\"ajax-indicator\" style=\"display: none;\">\n" + 
"				<span>Loading...</span>\n" + 
"			</div>\n" + 
"\n" + 
"			<div id=\"footer\">\n" + 
"				<div class=\"bgl\">\n" + 
"					<div class=\"bgr\">2011 by KBase</div>\n" + 
"				</div>\n" + 
"			</div>\n" + 
"		</div>\n" + 
"	</div>\n" + 
"\n" + 
"</body>\n");// line 22
		;
	}
	@Override protected void title() {
		p("Cojeel - Demo");;
	}
public String main_content() {
StringBuilder sb = new StringBuilder();
StringBuilder ori = getOut();
this.setOut(sb);
// line 3

this.setOut(ori);
return sb.toString();
}
}