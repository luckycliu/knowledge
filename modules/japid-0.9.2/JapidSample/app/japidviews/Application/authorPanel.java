package japidviews.Application;
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
import play.data.validation.Error;
import play.i18n.Lang;
import japidviews._tags.*;
import play.mvc.Http.*;
import controllers.*;
import japidviews._javatags.*;
//
// NOTE: This file was generated from: japidviews/Application/authorPanel.html
// Change to this file will be lost next time the template file is compiled.
//
@cn.bran.play.NoEnhance
public class authorPanel extends cn.bran.play.JapidTemplateBase
{	public static final String sourceTemplate = "japidviews/Application/authorPanel.html";
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


	public authorPanel() {
		super(null);
	}
	public authorPanel(StringBuilder out) {
		super(out);
	}
/* based on https://github.com/branaway/Japid/issues/12
 */
public static final String[] argNames = new String[] {/* args of the template*/"a",  };
public static final String[] argTypes = new String[] {/* arg types of the template*/"models.japidsample.Author",  };
public static final Object[] argDefaults= new Object[] {null, };
public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews.Application.authorPanel.class);

{
	setRenderMethod(renderMethod);
	setArgNames(argNames);
	setArgTypes(argTypes);
	setArgDefaults(argDefaults);
	setSourceTemplate(sourceTemplate);

}
////// end of named args stuff

	private models.japidsample.Author a;
	public cn.bran.japid.template.RenderResult render(models.japidsample.Author a) {
		this.a = a;
		long t = -1;
		try {super.layout();} catch (RuntimeException e) { super.handleException(e);}
		return new cn.bran.japid.template.RenderResultPartial(getHeaders(), getOut(), t, actionRunners);
	}
	@Override protected void doLayout() {

// -- set up the tag objects
final SampleTag _SampleTag0 = new SampleTag(getOut());
{ _SampleTag0.setActionRunners(getActionRunners()); }

// -- end of the tag objects

//------
;// line 1
		p("\n" + 
"<p>author name: ");// line 1
		p(a.name);// line 3
		p("</p>\n" + 
"<p>his birthdate: ");// line 3
		p(a.birthDate);// line 4
		p("</p>\n" + 
"<p>and his is a '");// line 4
		p(a.getGender());// line 5
		p("'</p>\n" + 
"    ");// line 5
		_SampleTag0.setOut(getOut()); _SampleTag0.render("end");// line 6
		p("    ");// line 6
		
	}

}