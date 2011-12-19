package japidviews._tags;
import java.util.*;
import java.io.*;
import cn.bran.japid.tags.Each;
import models.users.*;
import models.knowledge.*;
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
// NOTE: This file was generated from: japidviews/_tags/kfragment_item.html
// Change to this file will be lost next time the template file is compiled.
//
@cn.bran.play.NoEnhance
public class kfragment_item extends cn.bran.play.JapidTemplateBase
{	public static final String sourceTemplate = "japidviews/_tags/kfragment_item.html";
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


	public kfragment_item() {
		super(null);
	}
	public kfragment_item(StringBuilder out) {
		super(out);
	}
/* based on https://github.com/branaway/Japid/issues/12
 */
public static final String[] argNames = new String[] {/* args of the template*/"item",  };
public static final String[] argTypes = new String[] {/* arg types of the template*/"KFragment",  };
public static final Object[] argDefaults= new Object[] {null, };
public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews._tags.kfragment_item.class);

{
	setRenderMethod(renderMethod);
	setArgNames(argNames);
	setArgTypes(argTypes);
	setArgDefaults(argDefaults);
	setSourceTemplate(sourceTemplate);

}
////// end of named args stuff

	private KFragment item;
	public cn.bran.japid.template.RenderResult render(KFragment item) {
		this.item = item;
		long t = -1;
		try {super.layout();} catch (RuntimeException e) { super.handleException(e);}
		return new cn.bran.japid.template.RenderResultPartial(getHeaders(), getOut(), t, actionRunners);
	}
	@Override protected void doLayout() {
//------
;// line 1
p("\n" + 
"<div class=\"user\">\n" + 
"	<ul class=\"vertical\">\n" + 
"		<li><a href=\"#\"><img class=\"photo\" src=\"");// line 3
		p(item.author.getPhotoUrl());// line 7
		p("\"/></a></li>\n" + 
"		<li style=\"widht: 180px;\">\n" + 
"			<a href=\"#\" style=\"display:block;\" class=\"user-name\">");// line 7
		p(item.author.firstName);// line 9
		p(" ");// line 9
		p(item.author.lastName);// line 9
		p("</a>\n" + 
"			<p>Based in ");// line 9
		p(item.author.state);// line 10
		p("</p>\n" + 
"		</li>\n" + 
"		<li>		\n" + 
"			<div style=\"font-size:14px;width: 600px;\">I am learning <span style=\"color:#E06D1B;\">");// line 10
		p(item.title);// line 13
		p("</span></div>\n" + 
"			<div style=\"font-size:9px;color:#909090;width: 600px;\">from <a href=\"http://");// line 13
		p(item.url);// line 14
		p("\" target=\"_blank\">");// line 14
		p(item.url);// line 14
		p("</a></div>\n" + 
"		</li>\n" + 
"	</ul>\n" + 
"</div>");// line 14
		
	}

}