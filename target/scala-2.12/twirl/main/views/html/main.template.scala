
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,models.users.User,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(pagename:String,user: models.users.User)(content:Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<!DOCTYPE html>
<html>
    <head>
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta charset="UTF-8"/>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	<style>
	    .footer """),format.raw/*9.14*/("""{"""),format.raw/*9.15*/(""" """),format.raw/*9.16*/("""font-weight: bold; color: white; background-color: black; """),format.raw/*9.74*/("""}"""),format.raw/*9.75*/("""
	    """),format.raw/*10.6*/(""".sidecol """),format.raw/*10.15*/("""{"""),format.raw/*10.16*/(""" """),format.raw/*10.17*/("""font-weight: bold; background-color: steelblue; """),format.raw/*10.65*/("""}"""),format.raw/*10.66*/("""
	    """),format.raw/*11.6*/(""".sidecol h2 """),format.raw/*11.18*/("""{"""),format.raw/*11.19*/(""" """),format.raw/*11.20*/("""font-weight: bold; """),format.raw/*11.39*/("""}"""),format.raw/*11.40*/("""
	    """),format.raw/*12.6*/(""".midcol h1 """),format.raw/*12.17*/("""{"""),format.raw/*12.18*/(""" """),format.raw/*12.19*/("""text-align: center; font-weight: bold; """),format.raw/*12.58*/("""}"""),format.raw/*12.59*/("""
	    """),format.raw/*13.6*/(""".midcol h3 """),format.raw/*13.17*/("""{"""),format.raw/*13.18*/(""" """),format.raw/*13.19*/("""text-align: center; color: steelblue; """),format.raw/*13.57*/("""}"""),format.raw/*13.58*/("""
	    """),format.raw/*14.6*/(""".redtext """),format.raw/*14.15*/("""{"""),format.raw/*14.16*/(""" """),format.raw/*14.17*/("""color: red; """),format.raw/*14.29*/("""}"""),format.raw/*14.30*/("""
	"""),format.raw/*15.2*/("""</style>
	<title>OFM """),_display_(/*16.14*/pagename),format.raw/*16.22*/("""</title>
    </head>
    <body>
	<nav class="navbar navbar-inverse">
	    <div class="container-fluid">
		<div class="navbar-header">
		    <a class="navbar-brand" href="#">WebSiteName</a>
		</div>
		<ul class="nav navbar-nav">
            <li """),_display_(/*25.18*/if(pagename == "Home")/*25.40*/ {_display_(Seq[Any](format.raw/*25.42*/("""class="active"""")))}),format.raw/*25.57*/("""><a href=""""),_display_(/*25.68*/routes/*25.74*/.HomeController.index()),format.raw/*25.97*/("""">Home</a></li>
			<li """),_display_(/*26.9*/if(pagename == "Projects")/*26.35*/ {_display_(Seq[Any](format.raw/*26.37*/("""class="active"""")))}),format.raw/*26.52*/("""><a href=""""),_display_(/*26.63*/routes/*26.69*/.HomeController.projects()),format.raw/*26.95*/("""">Projects</a></li>
			<li """),_display_(/*27.9*/if(pagename == "Employees")/*27.36*/ {_display_(Seq[Any](format.raw/*27.38*/("""class="active"""")))}),format.raw/*27.53*/("""><a href=""""),_display_(/*27.64*/routes/*27.70*/.HomeController.usersEmployees()),format.raw/*27.102*/("""">Employees</a></li>
			
			<li """),_display_(/*29.9*/if(pagename == "Register")/*29.35*/ {_display_(Seq[Any](format.raw/*29.37*/("""class="active"""")))}),format.raw/*29.52*/("""><a href=""""),_display_(/*29.63*/routes/*29.69*/.LoginController.registerUser()),format.raw/*29.100*/("""">Register user</a></li>
			"""),_display_(/*30.5*/if((user != null) && ("manager".equals(user.getRole())))/*30.61*/ {_display_(Seq[Any](format.raw/*30.63*/("""
				"""),format.raw/*31.5*/("""<li """),_display_(/*31.10*/if(pagename == "Managers")/*31.36*/ {_display_(Seq[Any](format.raw/*31.38*/("""class="active"""")))}),format.raw/*31.53*/("""><a href=""""),_display_(/*31.64*/routes/*31.70*/.HomeController.usersManagers),format.raw/*31.99*/(""")">View Managers</a></li>
				<li """),_display_(/*32.10*/if(pagename == "Employees")/*32.37*/ {_display_(Seq[Any](format.raw/*32.39*/("""class="active"""")))}),format.raw/*32.54*/("""><a href=""""),_display_(/*32.65*/routes/*32.71*/.HomeController.usersEmployees()),format.raw/*32.103*/("""">View Employees</a></li>

			""")))}),format.raw/*34.5*/("""
			
			
			"""),format.raw/*37.4*/("""<li """),_display_(/*37.9*/if(pagename == "Log In")/*37.33*/ {_display_(Seq[Any](format.raw/*37.35*/("""class="active"""")))}),format.raw/*37.50*/(""">
				"""),_display_(/*38.6*/if(user != null)/*38.22*/ {_display_(Seq[Any](format.raw/*38.24*/("""
					"""),format.raw/*39.6*/("""<a href=""""),_display_(/*39.16*/routes/*39.22*/.LoginController.logout()),format.raw/*39.47*/("""">Log Out</a>
				""")))}/*40.7*/else/*40.12*/{_display_(Seq[Any](format.raw/*40.13*/("""
					"""),format.raw/*41.6*/("""<a href=""""),_display_(/*41.16*/routes/*41.22*/.LoginController.login()),format.raw/*41.46*/("""">Log In</a>
			</li>
""")))}),format.raw/*43.2*/(""" 
		"""),format.raw/*44.3*/("""</ul>
	    </div>
	</nav>


	<div class="container-fluid">
	    <div class="row">
		<div class="col-sm-2">
		    <div class="well sidecol">
			<h2>News</h2>
			<h3>New product sub-category</h3>
			<p>Following the sudden and unprecedented volumes of trade in fashion paper bags, our <span class="redtext">bags</span> category has been extended to include a seventh subcategory, <span class="redtext">paper handbags</span>.
		    </div>
		</div>
		<div class="col-sm-8">
		    <div class="midcol">
			"""),_display_(/*60.5*/content),format.raw/*60.12*/("""
		    """),format.raw/*61.7*/("""</div>
		</div>
		<div class="col-sm-2">
		    <div class="well sidecol">
			<h2>Events</h2>
			<h3>The 153rd Meet for Real event</h3>
			<p>The popular <span class="redtext">Meet for Real</span> event takes place this Sunday at the Square Park, from 7am until 1pm. It will yet again give flea-market enthusiasts a chance to engage in a bit of live bartering and banter with their fellow sitesters.</p>
		    </div>
		</div>
	    </div>
	    <div class="row">
		<div class="col-sm-12">
		    <div class="well footer">
			Website created by ABC Sights
		    </div>
		</div>
	    </div>
	</div>
	<script src =""""),_display_(/*79.17*/routes/*79.23*/.Assets.versioned("javascripts/main.js")),format.raw/*79.63*/(""""></script>
    </body>
</html>

"""))
      }
    }
  }

  def render(pagename:String,user:models.users.User,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(pagename,user)(content)

  def f:((String,models.users.User) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (pagename,user) => (content) => apply(pagename,user)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Mar 14 19:12:15 GMT 2019
                  SOURCE: /home/wdd/Software-CA1/Software-CA1/Employee System - Latest Copy/app/views/main.scala.html
                  HASH: 7a4edba696b997344953cbceca26747e31309e92
                  MATRIX: 970->1|1119->57|1401->312|1429->313|1457->314|1542->372|1570->373|1603->379|1640->388|1669->389|1698->390|1774->438|1803->439|1836->445|1876->457|1905->458|1934->459|1981->478|2010->479|2043->485|2082->496|2111->497|2140->498|2207->537|2236->538|2269->544|2308->555|2337->556|2366->557|2432->595|2461->596|2494->602|2531->611|2560->612|2589->613|2629->625|2658->626|2687->628|2736->650|2765->658|3037->903|3068->925|3108->927|3154->942|3192->953|3207->959|3251->982|3301->1006|3336->1032|3376->1034|3422->1049|3460->1060|3475->1066|3522->1092|3576->1120|3612->1147|3652->1149|3698->1164|3736->1175|3751->1181|3805->1213|3864->1246|3899->1272|3939->1274|3985->1289|4023->1300|4038->1306|4091->1337|4146->1366|4211->1422|4251->1424|4283->1429|4315->1434|4350->1460|4390->1462|4436->1477|4474->1488|4489->1494|4539->1523|4601->1558|4637->1585|4677->1587|4723->1602|4761->1613|4776->1619|4830->1651|4891->1682|4930->1694|4961->1699|4994->1723|5034->1725|5080->1740|5113->1747|5138->1763|5178->1765|5211->1771|5248->1781|5263->1787|5309->1812|5346->1832|5359->1837|5398->1838|5431->1844|5468->1854|5483->1860|5528->1884|5581->1907|5612->1911|6139->2412|6167->2419|6201->2426|6837->3035|6852->3041|6913->3081
                  LINES: 28->1|33->2|40->9|40->9|40->9|40->9|40->9|41->10|41->10|41->10|41->10|41->10|41->10|42->11|42->11|42->11|42->11|42->11|42->11|43->12|43->12|43->12|43->12|43->12|43->12|44->13|44->13|44->13|44->13|44->13|44->13|45->14|45->14|45->14|45->14|45->14|45->14|46->15|47->16|47->16|56->25|56->25|56->25|56->25|56->25|56->25|56->25|57->26|57->26|57->26|57->26|57->26|57->26|57->26|58->27|58->27|58->27|58->27|58->27|58->27|58->27|60->29|60->29|60->29|60->29|60->29|60->29|60->29|61->30|61->30|61->30|62->31|62->31|62->31|62->31|62->31|62->31|62->31|62->31|63->32|63->32|63->32|63->32|63->32|63->32|63->32|65->34|68->37|68->37|68->37|68->37|68->37|69->38|69->38|69->38|70->39|70->39|70->39|70->39|71->40|71->40|71->40|72->41|72->41|72->41|72->41|74->43|75->44|91->60|91->60|92->61|110->79|110->79|110->79
                  -- GENERATED --
              */
          