
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

object manager extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[List[models.users.Manager],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(managers: List[models.users.Manager],user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main("Managers",user)/*2.23*/{_display_(Seq[Any](format.raw/*2.24*/("""
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
            <th>ID</th>
            <th>Email</th>
            <th>Name</th>
            <th>DOB</th>
            <th>Password</th>
            <th>Head of Department</th>
            <th>Job Role</th>
            <th>Password</th>

            <!-- DO we also need to output their address here?  -->
        </tr>
        </thead>
        <tbody>
        <!-- Managers data -->
       
            """),format.raw/*34.62*/("""
            """),_display_(/*35.14*/for(m<-managers) yield /*35.30*/ {_display_(Seq[Any](format.raw/*35.32*/("""
               """),format.raw/*36.16*/("""<tr>
                  <td>"""),_display_(/*37.24*/m/*37.25*/.getEmail),format.raw/*37.34*/("""</td>
                  <td>"""),_display_(/*38.24*/m/*38.25*/.getName),format.raw/*38.33*/("""</td>
                  <td>"""),_display_(/*39.24*/m/*39.25*/.getDateOfBirthString),format.raw/*39.46*/("""</td>
                  <td>"""),_display_(/*40.24*/m/*40.25*/.getPassword),format.raw/*40.37*/("""</td>
                  <td>"""),_display_(/*41.24*/m/*41.25*/.getDepartment),format.raw/*41.39*/("""</td>
                  <th>"""),_display_(/*42.24*/m/*42.25*/.getJobRole),format.raw/*42.36*/("""</th>
                  <th>"""),_display_(/*43.24*/m/*43.25*/.getPassword),format.raw/*43.37*/("""</th>
                  <!-- Update button -->
						<td>
							<a href=""""),_display_(/*46.18*/routes/*46.24*/.HomeController.updateManager(m.getEmail)),format.raw/*46.65*/("""" class="button-xs btn-danger">
								<span class="glyphicon glyphicon-pencil"></span>
							</a>
                        </td>
                  <!-- Delete button -->
						<td>
							<a href=""""),_display_(/*52.18*/routes/*52.24*/.HomeController.deleteManager(m.getEmail)),format.raw/*52.65*/("""" class="button-xs btn-danger" onclick="return confirmDel();">
								<span class="glyphicon glyphicon-trash"></span>
							</a>
                        </td>
               </tr>
            """)))}),format.raw/*57.14*/("""
        
        """),format.raw/*59.9*/("""</tbody>
    </table>

    <p>
        <a href=""""),_display_(/*63.19*/routes/*63.25*/.HomeController.addManager()),format.raw/*63.53*/("""">
            <button class="btn btn-primary">Add a new Administrator</button>
        </a>
    </p>
</div>
 """)))}))
      }
    }
  }

  def render(managers:List[models.users.Manager],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(managers,user)

  def f:((List[models.users.Manager],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (managers,user) => apply(managers,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Mar 14 19:12:15 GMT 2019
                  SOURCE: /home/wdd/Software-CA1/Software-CA1/Employee System - Latest Copy/app/views/manager.scala.html
                  HASH: ede57af20992896f73e51cddbea546acf9fbaaf2
                  MATRIX: 988->1|1144->65|1173->86|1211->87|1242->92|1318->207|1346->210|1386->242|1425->244|1454->247|1517->285|1530->290|1565->305|1595->308|1633->316|1666->322|2336->1013|2377->1027|2409->1043|2449->1045|2493->1061|2548->1089|2558->1090|2588->1099|2644->1128|2654->1129|2683->1137|2739->1166|2749->1167|2791->1188|2847->1217|2857->1218|2890->1230|2946->1259|2956->1260|2991->1274|3047->1303|3057->1304|3089->1315|3145->1344|3155->1345|3188->1357|3290->1432|3305->1438|3367->1479|3594->1679|3609->1685|3671->1726|3897->1921|3942->1939|4018->1988|4033->1994|4082->2022
                  LINES: 28->1|33->2|33->2|33->2|34->3|37->6|38->7|38->7|38->7|39->8|40->9|40->9|40->9|41->10|42->11|44->13|65->34|66->35|66->35|66->35|67->36|68->37|68->37|68->37|69->38|69->38|69->38|70->39|70->39|70->39|71->40|71->40|71->40|72->41|72->41|72->41|73->42|73->42|73->42|74->43|74->43|74->43|77->46|77->46|77->46|83->52|83->52|83->52|88->57|90->59|94->63|94->63|94->63
                  -- GENERATED --
              */
          