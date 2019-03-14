
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

object addManager extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Form[models.users.Manager],Form[models.users.Address],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(userForm: Form[models.users.Manager], addressForm: Form[models.users.Address], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import models.users.User
/*4.2*/import helper._


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*5.1*/("""
"""),_display_(/*6.2*/main("Add Manager",user)/*6.26*/{_display_(Seq[Any](format.raw/*6.27*/("""
    """),format.raw/*7.5*/("""<p class="lead">Add a new manager</p>

    <!-- Use a views.html.helpers package method to create the form (instead of html)-->
    <!-- Note the arguments that are being passed to the scala function form (they are
         essentially instructions for constructing an HTML form element)-->
    """),_display_(/*12.6*/form(action=routes.HomeController.addManagerSubmit(), 'class -> "form-horizontal", 'role -> "form")/*12.105*/ {_display_(Seq[Any](format.raw/*12.107*/("""
        """),format.raw/*13.37*/("""
        """),format.raw/*14.99*/("""
        """),_display_(/*15.10*/CSRF/*15.14*/.formField),format.raw/*15.24*/("""

            """),_display_(/*17.14*/inputText(userForm("email"), '_label -> "Email", 'class -> "form-control")),format.raw/*17.88*/("""
            """),_display_(/*18.14*/inputText(userForm("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*18.86*/("""
            """),_display_(/*19.14*/inputDate(userForm("dateOfBirth"), args = 'size -> 10, '_label -> "Date Of Birth", 'class -> "form-control")),format.raw/*19.122*/("""
            """),_display_(/*20.14*/inputText(userForm("password"), '_label -> "Password", 'class -> "form-control")),format.raw/*20.94*/("""
            """),_display_(/*21.14*/inputText(userForm("dept"), '_label -> "Department", 'class -> "form-control")),format.raw/*21.92*/("""
            """),_display_(/*22.14*/inputText(userForm("jobRole"), '_label -> "Position", 'class -> "form-control")),format.raw/*22.93*/("""
            """),_display_(/*23.14*/inputText(addressForm("street1"), '_label -> "Street 1 Address", 'class -> "form-control")),format.raw/*23.104*/("""
            """),_display_(/*24.14*/inputText(addressForm("street2"), '_label -> "Street 2 Address", 'class -> "form-control")),format.raw/*24.104*/("""
            """),_display_(/*25.14*/inputText(addressForm("town"), '_label -> "Town", 'class -> "form-control")),format.raw/*25.89*/("""
            """),_display_(/*26.14*/inputText(addressForm("postCode"), '_label -> "PostCode", 'class -> "form-control")),format.raw/*26.97*/("""
            
            """),_display_(/*28.14*/inputText(userForm("role").copy(value=Some("admin")), '_label -> "",'hidden -> "hidden")),format.raw/*28.102*/("""
            
            """),_display_(/*30.14*/inputText(userForm("email"), '_label -> "", 'hidden -> "hidden")),format.raw/*30.78*/("""
            
            
            """),format.raw/*33.13*/("""<!-- We use the bootstrap actions class for the buttons at the bottom:
                1. The submit button for the form
                2. A button that allows the user to cancel without adding an item
            -->
            <div class="actions">
                <input type="submit" value="Add/Update Manager" class="btn btn-primary">
                <a href=""""),_display_(/*39.27*/routes/*39.33*/.HomeController.usersManagers()),format.raw/*39.64*/("""">
                    <button type="button" class="btn btn-warning">Cancel</button>
                </a>
            </div>
    """)))}),format.raw/*43.6*/(""" """),format.raw/*43.24*/("""
""")))}),format.raw/*44.2*/(""" """))
      }
    }
  }

  def render(userForm:Form[models.users.Manager],addressForm:Form[models.users.Address],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(userForm,addressForm,user)

  def f:((Form[models.users.Manager],Form[models.users.Address],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (userForm,addressForm,user) => apply(userForm,addressForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Mar 14 19:12:15 GMT 2019
                  SOURCE: /home/wdd/Software-CA1/Software-CA1/Employee System - Latest Copy/app/views/addManager.scala.html
                  HASH: 0c01c66b1e4451b61de1957a36bddb8ce575294a
                  MATRIX: 1018->1|1195->108|1227->134|1271->106|1298->150|1325->152|1357->176|1395->177|1426->182|1748->478|1857->577|1898->579|1935->616|1972->715|2009->725|2022->729|2053->739|2095->754|2190->828|2231->842|2324->914|2365->928|2495->1036|2536->1050|2637->1130|2678->1144|2777->1222|2818->1236|2918->1315|2959->1329|3071->1419|3112->1433|3224->1523|3265->1537|3361->1612|3402->1626|3506->1709|3560->1736|3670->1824|3724->1851|3809->1915|3876->1954|4271->2322|4286->2328|4338->2359|4498->2489|4527->2507|4559->2509
                  LINES: 28->1|31->3|32->4|35->2|36->5|37->6|37->6|37->6|38->7|43->12|43->12|43->12|44->13|45->14|46->15|46->15|46->15|48->17|48->17|49->18|49->18|50->19|50->19|51->20|51->20|52->21|52->21|53->22|53->22|54->23|54->23|55->24|55->24|56->25|56->25|57->26|57->26|59->28|59->28|61->30|61->30|64->33|70->39|70->39|70->39|74->43|74->43|75->44
                  -- GENERATED --
              */
          