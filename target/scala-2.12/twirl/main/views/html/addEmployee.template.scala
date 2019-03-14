
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

object addEmployee extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Form[models.users.Employee],Form[models.users.Address],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(empForm: Form[models.users.Employee], addressForm: Form[models.users.Address],user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*4.2*/import helper._


Seq[Any](format.raw/*2.1*/("""

"""),format.raw/*5.1*/("""
"""),_display_(/*6.2*/main("Add Employee",user)/*6.27*/{_display_(Seq[Any](format.raw/*6.28*/("""
    """),format.raw/*7.5*/("""<p class="lead">Add a new Employee</p>

    <!-- Use a views.html.helpers package method to create the form (instead of html)-->
    <!-- Note the arguments that are being passed to the scala function form (they are
         essentially instructions for constructing an HTML form element)-->
    """),_display_(/*12.6*/form(action=routes.HomeController.addEmployeeSubmit, 'class -> "form-horizontal", 'role -> "form")/*12.104*/ {_display_(Seq[Any](format.raw/*12.106*/("""
        """),format.raw/*13.37*/("""
        """),format.raw/*14.99*/("""
        """),_display_(/*15.10*/CSRF/*15.14*/.formField),format.raw/*15.24*/("""
             """),_display_(/*16.15*/inputText(empForm("email"), '_label -> "Email", 'class -> "form-control")),format.raw/*16.88*/("""
             """),_display_(/*17.15*/inputText(empForm("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*17.86*/("""
             """),_display_(/*18.15*/inputDate(empForm("dateOfBirth"), args = 'size -> 10, '_label -> "Date Of Birth", 'class -> "form-control")),format.raw/*18.122*/("""
             """),_display_(/*19.15*/inputText(empForm("password"), '_label -> "Password", 'class -> "form-control")),format.raw/*19.94*/("""
             """),_display_(/*20.15*/inputText(empForm("dept"), '_label -> "Department", 'class -> "form-control")),format.raw/*20.92*/("""         
             """),_display_(/*21.15*/inputText(empForm("jobRole"), '_label -> "Position", 'class -> "form-control")),format.raw/*21.93*/("""
             """),_display_(/*22.15*/inputText(addressForm("street1"), '_label -> "Street 1 Address", 'class -> "form-control")),format.raw/*22.105*/("""
             """),_display_(/*23.15*/inputText(addressForm("street2"), '_label -> "Street 2 Address", 'class -> "form-control")),format.raw/*23.105*/("""
             """),_display_(/*24.15*/inputText(addressForm("town"), '_label -> "Town", 'class -> "form-control")),format.raw/*24.90*/("""
             """),_display_(/*25.15*/inputText(addressForm("postCode"), '_label -> "PostCode", 'class -> "form-control")),format.raw/*25.98*/("""

             """),_display_(/*27.15*/inputText(empForm("role").copy(value=Some("employee")), '_label -> "",'hidden -> "hidden")),format.raw/*27.105*/("""
             """),_display_(/*28.15*/inputText(addressForm("email"), '_label -> "", 'hidden -> "hidden")),format.raw/*28.82*/("""




            
            """),format.raw/*34.13*/("""<!-- We use the bootstrap actions class for the buttons at the bottom:
                1. The submit button for the form
                2. A button that allows the user to cancel without adding an item
            -->
            <div class="actions">
                <input type="submit" value="Add/Update Employee" class="btn btn-primary">
                <a href=""""),_display_(/*40.27*/routes/*40.33*/.HomeController.usersEmployees()),format.raw/*40.65*/("""">
                    <button type="button" class="btn btn-warning">Cancel</button>
                </a>
            </div>
    """)))}),format.raw/*44.6*/(""" """),format.raw/*44.24*/("""
""")))}),format.raw/*45.2*/(""" """))
      }
    }
  }

  def render(empForm:Form[models.users.Employee],addressForm:Form[models.users.Address],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(empForm,addressForm,user)

  def f:((Form[models.users.Employee],Form[models.users.Address],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (empForm,addressForm,user) => apply(empForm,addressForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Mar 14 19:12:15 GMT 2019
                  SOURCE: /home/wdd/Software-CA1/Software-CA1/Employee System - Latest Copy/app/views/addEmployee.scala.html
                  HASH: 0d6dcdd829f8cd9e802a4d635725cb6a4ffc6dc3
                  MATRIX: 1020->1|1196->108|1240->105|1268->124|1295->126|1328->151|1366->152|1397->157|1720->454|1828->552|1869->554|1906->591|1943->690|1980->700|1993->704|2024->714|2066->729|2160->802|2202->817|2294->888|2336->903|2465->1010|2507->1025|2607->1104|2649->1119|2747->1196|2798->1220|2897->1298|2939->1313|3051->1403|3093->1418|3205->1508|3247->1523|3343->1598|3385->1613|3489->1696|3532->1712|3644->1802|3686->1817|3774->1884|3832->1914|4228->2283|4243->2289|4296->2321|4456->2451|4485->2469|4517->2471
                  LINES: 28->1|31->4|34->2|36->5|37->6|37->6|37->6|38->7|43->12|43->12|43->12|44->13|45->14|46->15|46->15|46->15|47->16|47->16|48->17|48->17|49->18|49->18|50->19|50->19|51->20|51->20|52->21|52->21|53->22|53->22|54->23|54->23|55->24|55->24|56->25|56->25|58->27|58->27|59->28|59->28|65->34|71->40|71->40|71->40|75->44|75->44|76->45
                  -- GENERATED --
              */
          