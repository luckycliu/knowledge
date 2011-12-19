package japidviews.templates;
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
// NOTE: This file was generated from: japidviews/templates/tagBody.html
// Change to this file will be lost next time the template file is compiled.
//
@cn.bran.play.NoEnhance
public class tagBody extends cn.bran.play.JapidTemplateBase
{	public static final String sourceTemplate = "japidviews/templates/tagBody.html";
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


	public tagBody() {
		super(null);
	}
	public tagBody(StringBuilder out) {
		super(out);
	}
/* based on https://github.com/branaway/Japid/issues/12
 */
public static final String[] argNames = new String[] {/* args of the template*/ };
public static final String[] argTypes = new String[] {/* arg types of the template*/ };
public static final Object[] argDefaults= new Object[] { };
public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews.templates.tagBody.class);

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
final moreTag _moreTag2 = new moreTag(getOut());
{ _moreTag2.setActionRunners(getActionRunners()); }

final anotherTag _anotherTag1 = new anotherTag(getOut());
{ _anotherTag1.setActionRunners(getActionRunners()); }

final fooTag _fooTag0 = new fooTag(getOut());
{ _fooTag0.setActionRunners(getActionRunners()); }

// -- end of the tag objects

//------
p("\n" + 
"Note: the last | is the separator for the tag arguments and the call back parameters. \n" + 
"It must present even if the parameters are empty.\n" + 
"<p/>\n" + 
"before\n" + 
"\n" + 
"<p/>\n");// line 1
		_fooTag0.setOut(getOut()); _fooTag0.render("hi", new fooTag.DoBody(){
public void render() {
// line 8
    final String echo = "secret";// line 9
		p("\n" + 
"    well ");// line 9
		p(echo);// line 11
		p("\n" + 
"\n" + 
"	");// line 11
		_anotherTag1.setOut(getOut()); _anotherTag1.render(echo, new anotherTag.DoBody<String>(){
public void render(final String what) {
// line 13
		p("	    got ");// line 13
		p(what);// line 14
		p(" and ");// line 14
		p(echo);// line 14
		p("\n" + 
"		");// line 14
		_moreTag2.setOut(getOut()); _moreTag2.render(echo, new moreTag.DoBody<String>(){
public void render(final String more) {
// line 15
		p("		   got ");// line 15
		p(what);// line 16
		p(" and ");// line 16
		p(echo);// line 16
		p(" and ");// line 16
		p(more);// line 16
		p("\n" + 
"		");// line 16
		
}

StringBuilder oriBuffer;
@Override
public void setBuffer(StringBuilder sb) {
	oriBuffer = getOut();
	setOut(sb);
}

@Override
public void resetBuffer() {
	setOut(oriBuffer);
}

}
);// line 15
		p("	");// line 17
		
}

StringBuilder oriBuffer;
@Override
public void setBuffer(StringBuilder sb) {
	oriBuffer = getOut();
	setOut(sb);
}

@Override
public void resetBuffer() {
	setOut(oriBuffer);
}

}
);// line 13

}

StringBuilder oriBuffer;
@Override
public void setBuffer(StringBuilder sb) {
	oriBuffer = getOut();
	setOut(sb);
}

@Override
public void resetBuffer() {
	setOut(oriBuffer);
}

}
);// line 8
		p("<p/>\n" + 
"after");// line 19
		
	}

}