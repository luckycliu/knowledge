package japidviews.more.MyController;
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
// NOTE: This file was generated from: japidviews/more/MyController/scriptline.html
// Change to this file will be lost next time the template file is compiled.
//
@cn.bran.play.NoEnhance
public class scriptline extends scriptlineLayout
{	public static final String sourceTemplate = "japidviews/more/MyController/scriptline.html";
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


	public scriptline() {
		super(null);
	}
	public scriptline(StringBuilder out) {
		super(out);
	}
/* based on https://github.com/branaway/Japid/issues/12
 */
public static final String[] argNames = new String[] {/* args of the template*/ };
public static final String[] argTypes = new String[] {/* arg types of the template*/ };
public static final Object[] argDefaults= new Object[] { };
public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews.more.MyController.scriptline.class);

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
final Tag2 _Tag21 = new Tag2(getOut());
{ _Tag21.setActionRunners(getActionRunners()); }

final Tag2 _Tag22 = new Tag2(getOut());
{ _Tag22.setActionRunners(getActionRunners()); }

// -- end of the tag objects

//------
;// line 1
p("\n" + 
"hello ");// line 2
		_Tag21.setOut(getOut()); _Tag21.render(named("msg", "123"));// line 4
		p(" a  ");// line 4
		_Tag22.setOut(getOut()); _Tag22.render(named("msg", "456"));// line 4
		p("!\n" + 
"this is how to print a single back quote: ");// line 4
		p('`');// line 5
		p(" or `");// line 5
		
	}

	@Override protected void meta() {
		p("holy meta");;
	}
}