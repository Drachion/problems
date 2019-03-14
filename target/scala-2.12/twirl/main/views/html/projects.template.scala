
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

object projects extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[List[models.users.Employee],List[models.project.Project],models.users.User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(employees: List[models.users.Employee], projects: List[models.project.Project],
user: models.users.User,env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*3.2*/main("Projects",user)/*3.23*/{_display_(Seq[Any](format.raw/*3.24*/("""
    """),format.raw/*4.5*/("""<h1>Current Projects</h1>


    """),format.raw/*7.74*/("""
	"""),_display_(/*8.3*/if(flash.containsKey("success"))/*8.35*/ {_display_(Seq[Any](format.raw/*8.37*/("""
		"""),format.raw/*9.3*/("""<div class="alert alert-success">
			"""),_display_(/*10.5*/flash/*10.10*/.get("success")),format.raw/*10.25*/("""
		"""),format.raw/*11.3*/("""</div>
""")))}),format.raw/*12.2*/("""
    """),format.raw/*13.5*/("""<div class="col-sm-3">
		<h4>Project List</h4>
	        <ul class="list-group">
                    <a href = """"),_display_(/*16.33*/routes/*16.39*/.HomeController.projects(0)),format.raw/*16.66*/("""" class="list-group-item">All Projects</a>
		        """),_display_(/*17.12*/for(p<-projects) yield /*17.28*/ {_display_(Seq[Any](format.raw/*17.30*/("""
			        """),format.raw/*18.12*/("""<a href = """"),_display_(/*18.24*/routes/*18.30*/.HomeController.projects(p.getId())),format.raw/*18.65*/("""" class="list-group-item catheight">"""),_display_(/*18.102*/p/*18.103*/.getName),format.raw/*18.111*/("""
                        """),format.raw/*19.25*/("""<span class="badge">"""),_display_(/*19.46*/p/*19.47*/.getEmployees.size),format.raw/*19.65*/("""</span> 
                    </a>
			    """)))}),format.raw/*21.9*/("""
            """),format.raw/*22.13*/("""</ul>
    </div>

    <div class="col-sm-9">
        <h4>Note that all products are second hand, unless otherwise stated.</h4>
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
        </tr>
        </thead>
        <tbody>
        <!-- Product row(s) -->
       
            """),format.raw/*44.66*/("""
            """),_display_(/*45.14*/for(e<-employees) yield /*45.31*/ {_display_(Seq[Any](format.raw/*45.33*/("""
               """),format.raw/*46.16*/("""<tr>
                    """),_display_(/*47.22*/if(env.resource("public/images/productImages/" + e.getEmpId + "thumb.jpg").isDefined)/*47.107*/ {_display_(Seq[Any](format.raw/*47.109*/("""
                        """),format.raw/*48.25*/("""<td><img src="/assets/images/productImages/"""),_display_(/*48.69*/(e.getEmpId + "thumb.jpg")),format.raw/*48.95*/(""""/></td>
                    """)))}/*49.23*/else/*49.28*/{_display_(Seq[Any](format.raw/*49.29*/("""
                        """),format.raw/*50.25*/("""<td><img src="/assets/images/productImages/noImage.jpg"/></td>
                    """)))}),format.raw/*51.22*/("""
                  """),format.raw/*52.19*/("""<td>"""),_display_(/*52.24*/e/*52.25*/.getEmpId),format.raw/*52.34*/("""</td>
                  <td>"""),_display_(/*53.24*/e/*53.25*/.getName),format.raw/*53.33*/("""</td>
                  <td>"""),_display_(/*54.24*/e/*54.25*/.getJobRole),format.raw/*54.36*/("""</td>
                  <td>"""),_display_(/*55.24*/e/*55.25*/.getAddress),format.raw/*55.36*/("""</td>
                  <td>"""),_display_(/*56.24*/e/*56.25*/.getDepartment),format.raw/*56.39*/("""</td>
                  <td>"""),_display_(/*57.24*/e/*57.25*/.getEmail),format.raw/*57.34*/("""</td>
                  <td>"""),_display_(/*58.24*/e/*58.25*/.getDateOfBirth),format.raw/*58.40*/("""</td>

                  """),_display_(/*60.20*/if((user != null) && ("manager".equals(user.getRole())))/*60.76*/ {_display_(Seq[Any](format.raw/*60.78*/("""
                  """),format.raw/*61.19*/("""<!-- Update button -->

			    <td>
					<a href=""""),_display_(/*64.16*/routes/*64.22*/.HomeController.updateEmployee(e.getEmail)),format.raw/*64.64*/("""" class="button-xs btn-danger">
						<span class="glyphicon glyphicon-pencil"></span>
					</a>
                        </td> 
                  <!-- Delete button -->

				<td>
					<a href=""""),_display_(/*71.16*/routes/*71.22*/.HomeController.deleteEmployee(e.getEmail)),format.raw/*71.64*/("""" class="button-xs btn-danger" onclick="return confirmDel();">
						<span class="glyphicon glyphicon-trash"></span>
					</a>
                </td>
                  """)))}),format.raw/*75.20*/(""" 

                """)))}),format.raw/*77.18*/("""
               """),format.raw/*78.16*/("""</tr>
            """)))}),format.raw/*79.14*/("""
        
        """),format.raw/*81.9*/("""</tbody>
    </table>
    """),_display_(/*83.6*/if((user != null) && ("manager".equals(user.getRole())))/*83.62*/ {_display_(Seq[Any](format.raw/*83.64*/("""
    """),format.raw/*84.5*/("""<p>
        NEED TO ADD THE ADD EMPLOYEE METHOD
        <a href=""""),_display_(/*86.19*/routes/*86.25*/.HomeController.addEmployee()),format.raw/*86.54*/("""">
            <button class="btn btn-primary">Add an employee</button>
        </a>
    </p>
    """)))}),format.raw/*90.6*/("""
"""),format.raw/*91.1*/("""</div>
 """))
      }
    }
  }

  def render(employees:List[models.users.Employee],projects:List[models.project.Project],user:models.users.User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(employees,projects,user,env)

  def f:((List[models.users.Employee],List[models.project.Project],models.users.User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (employees,projects,user,env) => apply(employees,projects,user,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Mar 14 19:12:15 GMT 2019
                  SOURCE: /home/wdd/Software-CA1/Software-CA1/Employee System - Latest Copy/app/views/projects.scala.html
                  HASH: bba70ab87992fc310cda2a692dfbcf77ca3e7f37
                  MATRIX: 1040->1|1265->134|1294->155|1332->156|1363->161|1422->262|1450->265|1490->297|1529->299|1558->302|1622->340|1636->345|1672->360|1702->363|1740->371|1772->376|1911->488|1926->494|1974->521|2055->575|2087->591|2127->593|2167->605|2206->617|2221->623|2277->658|2342->695|2353->696|2383->704|2436->729|2484->750|2494->751|2533->769|2605->811|2646->824|3257->1460|3298->1474|3331->1491|3371->1493|3415->1509|3468->1535|3563->1620|3604->1622|3657->1647|3728->1691|3775->1717|3824->1748|3837->1753|3876->1754|3929->1779|4044->1863|4091->1882|4123->1887|4133->1888|4163->1897|4219->1926|4229->1927|4258->1935|4314->1964|4324->1965|4356->1976|4412->2005|4422->2006|4454->2017|4510->2046|4520->2047|4555->2061|4611->2090|4621->2091|4651->2100|4707->2129|4717->2130|4753->2145|4806->2171|4871->2227|4911->2229|4958->2248|5036->2299|5051->2305|5114->2347|5335->2541|5350->2547|5413->2589|5612->2757|5663->2777|5707->2793|5757->2812|5802->2830|5855->2857|5920->2913|5960->2915|5992->2920|6085->2986|6100->2992|6150->3021|6279->3120|6307->3121
                  LINES: 28->1|34->3|34->3|34->3|35->4|38->7|39->8|39->8|39->8|40->9|41->10|41->10|41->10|42->11|43->12|44->13|47->16|47->16|47->16|48->17|48->17|48->17|49->18|49->18|49->18|49->18|49->18|49->18|49->18|50->19|50->19|50->19|50->19|52->21|53->22|75->44|76->45|76->45|76->45|77->46|78->47|78->47|78->47|79->48|79->48|79->48|80->49|80->49|80->49|81->50|82->51|83->52|83->52|83->52|83->52|84->53|84->53|84->53|85->54|85->54|85->54|86->55|86->55|86->55|87->56|87->56|87->56|88->57|88->57|88->57|89->58|89->58|89->58|91->60|91->60|91->60|92->61|95->64|95->64|95->64|102->71|102->71|102->71|106->75|108->77|109->78|110->79|112->81|114->83|114->83|114->83|115->84|117->86|117->86|117->86|121->90|122->91
                  -- GENERATED --
              */
          