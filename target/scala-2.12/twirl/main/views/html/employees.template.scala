
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

object employees extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[List[models.users.Employee],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(employees: List[models.users.Employee],user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main("Employees",user)/*2.24*/{_display_(Seq[Any](format.raw/*2.25*/("""
    """),format.raw/*3.5*/("""<h1>Current managers / administrators</h1>


    """),format.raw/*6.71*/("""
	"""),_display_(/*7.3*/if(flash.containsKey("success"))/*7.35*/ {_display_(Seq[Any](format.raw/*7.37*/("""
		"""),format.raw/*8.3*/("""<div class="alert alert-success">
			"""),_display_(/*9.5*/flash/*9.10*/.get("success")),format.raw/*9.25*/("""
		"""),format.raw/*10.3*/("""</div>
""")))}),format.raw/*11.2*/("""

    """),format.raw/*13.5*/("""<div class="col-sm-9">
        <h4>Here are all the current managers / administrators on the system.</h4>
        <table class="table table-bordered table-hover table-condensed">
            <thead>
        <!-- The header row-->
        <tr>
                <th>Image</th>
                <th>ID</th>
                <th>Name</th>
                <th>Job Role</th>
                <th>Address</th>
                <th>Department</th>
                <th>Email</th>
                <th>DOB</th>

            <!-- DO we also need to output their address here?  -->
        </tr>
        </thead>
        <tbody>
        <!-- Managers data -->
       
            """),format.raw/*34.62*/("""
            """),_display_(/*35.14*/for(e<-employees) yield /*35.31*/ {_display_(Seq[Any](format.raw/*35.33*/("""
               """),format.raw/*36.16*/("""<tr>
                    <td>"""),_display_(/*37.26*/e/*37.27*/.getEmpId),format.raw/*37.36*/("""</td>
                    <td>"""),_display_(/*38.26*/e/*38.27*/.getName),format.raw/*38.35*/("""</td>
                    <td>"""),_display_(/*39.26*/e/*39.27*/.getJobRole),format.raw/*39.38*/("""</td>
                    <td>"""),_display_(/*40.26*/e/*40.27*/.getAddress),format.raw/*40.38*/("""</td>
                    <td>"""),_display_(/*41.26*/e/*41.27*/.getDepartment),format.raw/*41.41*/("""</td>
                    <td>"""),_display_(/*42.26*/e/*42.27*/.getEmail),format.raw/*42.36*/("""</td>
                    <td>"""),_display_(/*43.26*/e/*43.27*/.getDateOfBirth),format.raw/*43.42*/("""</td>
                  <!-- Update button -->
						<td>
							<a href=""""),_display_(/*46.18*/routes/*46.24*/.HomeController.updateEmployee(e.getEmail)),format.raw/*46.66*/("""" class="button-xs btn-danger">
								<span class="glyphicon glyphicon-pencil"></span>
							</a>
                        </td>
                  <!-- Delete button -->
						<td>
							<a href=""""),_display_(/*52.18*/routes/*52.24*/.HomeController.deleteEmployee(e.getEmail)),format.raw/*52.66*/("""" class="button-xs btn-danger" onclick="return confirmDel();">
								<span class="glyphicon glyphicon-trash"></span>
							</a>
                        </td>
               </tr>
            """)))}),format.raw/*57.14*/("""
        
        """),format.raw/*59.9*/("""</tbody>
    </table>

    <p>
        <a href=""""),_display_(/*63.19*/routes/*63.25*/.HomeController.addEmployee()),format.raw/*63.54*/("""">
            <button class="btn btn-primary">Add a new Employee</button>
        </a>
    </p>
</div>
 """)))}))
      }
    }
  }

  def render(employees:List[models.users.Employee],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(employees,user)

  def f:((List[models.users.Employee],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (employees,user) => apply(employees,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Mar 14 19:12:15 GMT 2019
                  SOURCE: /home/wdd/Software-CA1/Software-CA1/Employee System - Latest Copy/app/views/employees.scala.html
                  HASH: cc7a7297505eb82e5d62e8a3b38a5159e81d66c4
                  MATRIX: 991->1|1149->67|1179->89|1217->90|1248->95|1324->210|1352->213|1392->245|1431->247|1460->250|1523->288|1536->293|1571->308|1601->311|1639->319|1672->325|2362->1036|2403->1050|2436->1067|2476->1069|2520->1085|2577->1115|2587->1116|2617->1125|2675->1156|2685->1157|2714->1165|2772->1196|2782->1197|2814->1208|2872->1239|2882->1240|2914->1251|2972->1282|2982->1283|3017->1297|3075->1328|3085->1329|3115->1338|3173->1369|3183->1370|3219->1385|3321->1460|3336->1466|3399->1508|3626->1708|3641->1714|3704->1756|3930->1951|3975->1969|4051->2018|4066->2024|4116->2053
                  LINES: 28->1|33->2|33->2|33->2|34->3|37->6|38->7|38->7|38->7|39->8|40->9|40->9|40->9|41->10|42->11|44->13|65->34|66->35|66->35|66->35|67->36|68->37|68->37|68->37|69->38|69->38|69->38|70->39|70->39|70->39|71->40|71->40|71->40|72->41|72->41|72->41|73->42|73->42|73->42|74->43|74->43|74->43|77->46|77->46|77->46|83->52|83->52|83->52|88->57|90->59|94->63|94->63|94->63
                  -- GENERATED --
              */
          