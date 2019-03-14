
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object registerUser extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.users.UserPassword2],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(loginForm: Form[models.users.UserPassword2],user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Login",user)/*4.20*/ {_display_(Seq[Any](format.raw/*4.22*/("""
    """),format.raw/*5.5*/("""<h3>Sign in</h3>
    <!-- Display login errors if there are any-->
    """),_display_(/*7.6*/if(loginForm.hasGlobalErrors)/*7.35*/ {_display_(Seq[Any](format.raw/*7.37*/("""
        """),format.raw/*8.9*/("""<p class="alert alert-warning">
            """),_display_(/*9.14*/for(e <- loginForm.globalErrors) yield /*9.46*/ {_display_(Seq[Any](format.raw/*9.48*/("""
                """),_display_(/*10.18*/e/*10.19*/.message),format.raw/*10.27*/("""<br/>
            """)))}),format.raw/*11.14*/("""
        """),format.raw/*12.9*/("""</p>
    """)))}),format.raw/*13.6*/("""
	"""),format.raw/*14.54*/("""
	"""),_display_(/*15.3*/if(flash.containsKey("error"))/*15.33*/ {_display_(Seq[Any](format.raw/*15.35*/("""
		"""),format.raw/*16.3*/("""<div class="alert alert-success">
			"""),_display_(/*17.5*/flash/*17.10*/.get("error")),format.raw/*17.23*/("""
		"""),format.raw/*18.3*/("""</div>
	""")))}),format.raw/*19.3*/("""
    """),format.raw/*20.5*/("""<!-- The login form-->
    """),_display_(/*21.6*/helper/*21.12*/.form(action = controllers.routes.LoginController.loginSubmit())/*21.76*/ {_display_(Seq[Any](format.raw/*21.78*/("""
        """),format.raw/*22.37*/("""
        """),format.raw/*24.84*/("""
        """),_display_(/*25.10*/CSRF/*25.14*/.formField),format.raw/*25.24*/("""
        
        """),format.raw/*27.9*/("""<div class="form-group">
            """),_display_(/*28.14*/inputText(loginForm("email"), '_label -> "", 
            'class -> "form-control input-xs", 'placeholder -> "Email")),format.raw/*29.72*/("""
        """),format.raw/*30.9*/("""</div>
        <div class="form-group">
            """),_display_(/*32.14*/inputPassword(loginForm("password"), '_label -> "", 
            'class -> "form-control input-xs", 'placeholder -> "Password")),format.raw/*33.75*/("""
        
        """),format.raw/*35.9*/("""</div>
        <div class="form-group">
            <input type="submit" value="Sign In" class="btn btn-primary">
        </div>
    """)))}),format.raw/*39.6*/(""" """),format.raw/*39.24*/("""
""")))}))
      }
    }
  }

  def render(loginForm:Form[models.users.UserPassword2],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(loginForm,user)

  def f:((Form[models.users.UserPassword2],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (loginForm,user) => apply(loginForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Mar 14 19:12:15 GMT 2019
                  SOURCE: /home/wdd/Software-CA1/Software-CA1/Employee System - Latest Copy/app/views/registerUser.scala.html
                  HASH: 8433d19f677b5d2f523781c74f173608b66bd607
                  MATRIX: 999->1|1141->72|1185->88|1212->90|1238->108|1277->110|1308->115|1405->187|1442->216|1481->218|1516->227|1587->272|1634->304|1673->306|1718->324|1728->325|1757->333|1807->352|1843->361|1883->371|1913->425|1942->428|1981->458|2021->460|2051->463|2115->501|2129->506|2163->519|2193->522|2232->531|2264->536|2318->564|2333->570|2406->634|2446->636|2483->673|2520->834|2557->844|2570->848|2601->858|2646->876|2711->914|2849->1031|2885->1040|2965->1093|3113->1220|3158->1238|3322->1372|3351->1390
                  LINES: 28->1|31->2|34->3|35->4|35->4|35->4|36->5|38->7|38->7|38->7|39->8|40->9|40->9|40->9|41->10|41->10|41->10|42->11|43->12|44->13|45->14|46->15|46->15|46->15|47->16|48->17|48->17|48->17|49->18|50->19|51->20|52->21|52->21|52->21|52->21|53->22|54->24|55->25|55->25|55->25|57->27|58->28|59->29|60->30|62->32|63->33|65->35|69->39|69->39
                  -- GENERATED --
              */
          