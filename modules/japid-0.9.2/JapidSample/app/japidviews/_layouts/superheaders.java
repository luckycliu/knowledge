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
import play.data.validation.Error;
import play.i18n.Lang;
import japidviews._tags.*;
import play.mvc.Http.*;
import controllers.*;
import japidviews._javatags.*;
//
// NOTE: This file was generated from: japidviews/_layouts/superheaders.html
// Change to this file will be lost next time the template file is compiled.
//
@cn.bran.play.NoEnhance
public abstract class superheaders extends cn.bran.play.JapidTemplateBase
{	public static final String sourceTemplate = "japidviews/_layouts/superheaders.html";
{
putHeader("Content-Type", "text/html; charset=utf-8");
putHeader("Cache-Control", "max-age=300");
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


	public superheaders() {
		super(null);
	}
	public superheaders(StringBuilder out) {
		super(out);
	}
	@Override public void layout() {
		;// line 1
		p("\n" + 
"\n");// line 1
		p("\n" + 
"<p> there is a special directive for the content-type header</p>\n");// line 4
		p("\n" + 
"    `contentType    text/html; charset=utf-8\n");// line 7
		p("\n");// line 9
		doLayout();// line 11
		;// line 11
			}

	protected abstract void doLayout();
}