// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/Software-CA1/Software-CA1/Employee System - Latest Copy/conf/routes
// @DATE:Thu Mar 14 19:12:15 GMT 2019

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_1: controllers.HomeController,
  // @LINE:32
  LoginController_4: controllers.LoginController,
  // @LINE:43
  CountController_0: controllers.CountController,
  // @LINE:45
  AsyncController_2: controllers.AsyncController,
  // @LINE:48
  Assets_3: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_1: controllers.HomeController,
    // @LINE:32
    LoginController_4: controllers.LoginController,
    // @LINE:43
    CountController_0: controllers.CountController,
    // @LINE:45
    AsyncController_2: controllers.AsyncController,
    // @LINE:48
    Assets_3: controllers.Assets
  ) = this(errorHandler, HomeController_1, LoginController_4, CountController_0, AsyncController_2, Assets_3, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_1, LoginController_4, CountController_0, AsyncController_2, Assets_3, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """projects""", """controllers.HomeController.projects(proj:Long ?= 0L)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """about""", """controllers.HomeController.about"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addEmployee""", """controllers.HomeController.addEmployee"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addEmployeeSubmit""", """controllers.HomeController.addEmployeeSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deleteEmployee/""" + "$" + """id<[^/]+>""", """controllers.HomeController.deleteEmployee(id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deleteManager/""" + "$" + """id<[^/]+>""", """controllers.HomeController.deleteManager(id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateEmployee/""" + "$" + """id<[^/]+>""", """controllers.HomeController.updateEmployee(id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateManager/""" + "$" + """id<[^/]+>""", """controllers.HomeController.updateManager(id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """manager""", """controllers.HomeController.usersManagers"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """employees""", """controllers.HomeController.usersEmployees"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addManager""", """controllers.HomeController.addManager"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addManagerSubmit""", """controllers.HomeController.addManagerSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """registerUser""", """controllers.LoginController.registerUser"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """registerUserSubmit""", """controllers.LoginController.registerUserSubmit()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.LoginController.login"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """loginSubmit""", """controllers.LoginController.loginSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """controllers.LoginController.logout"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """count""", """controllers.CountController.count"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """message""", """controllers.AsyncController.message"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_1.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_HomeController_projects1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("projects")))
  )
  private[this] lazy val controllers_HomeController_projects1_invoker = createInvoker(
    HomeController_1.projects(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "projects",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """projects""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_HomeController_about2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("about")))
  )
  private[this] lazy val controllers_HomeController_about2_invoker = createInvoker(
    HomeController_1.about,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "about",
      Nil,
      "GET",
      this.prefix + """about""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_HomeController_addEmployee3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addEmployee")))
  )
  private[this] lazy val controllers_HomeController_addEmployee3_invoker = createInvoker(
    HomeController_1.addEmployee,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addEmployee",
      Nil,
      "GET",
      this.prefix + """addEmployee""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_HomeController_addEmployeeSubmit4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addEmployeeSubmit")))
  )
  private[this] lazy val controllers_HomeController_addEmployeeSubmit4_invoker = createInvoker(
    HomeController_1.addEmployeeSubmit,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addEmployeeSubmit",
      Nil,
      "POST",
      this.prefix + """addEmployeeSubmit""",
      """""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_HomeController_deleteEmployee5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deleteEmployee/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_deleteEmployee5_invoker = createInvoker(
    HomeController_1.deleteEmployee(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "deleteEmployee",
      Seq(classOf[String]),
      "GET",
      this.prefix + """deleteEmployee/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:19
  private[this] lazy val controllers_HomeController_deleteManager6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deleteManager/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_deleteManager6_invoker = createInvoker(
    HomeController_1.deleteManager(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "deleteManager",
      Seq(classOf[String]),
      "GET",
      this.prefix + """deleteManager/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:21
  private[this] lazy val controllers_HomeController_updateEmployee7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateEmployee/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_updateEmployee7_invoker = createInvoker(
    HomeController_1.updateEmployee(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "updateEmployee",
      Seq(classOf[String]),
      "GET",
      this.prefix + """updateEmployee/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:22
  private[this] lazy val controllers_HomeController_updateManager8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateManager/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_updateManager8_invoker = createInvoker(
    HomeController_1.updateManager(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "updateManager",
      Seq(classOf[String]),
      "GET",
      this.prefix + """updateManager/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:24
  private[this] lazy val controllers_HomeController_usersManagers9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("manager")))
  )
  private[this] lazy val controllers_HomeController_usersManagers9_invoker = createInvoker(
    HomeController_1.usersManagers,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "usersManagers",
      Nil,
      "GET",
      this.prefix + """manager""",
      """""",
      Seq()
    )
  )

  // @LINE:25
  private[this] lazy val controllers_HomeController_usersEmployees10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("employees")))
  )
  private[this] lazy val controllers_HomeController_usersEmployees10_invoker = createInvoker(
    HomeController_1.usersEmployees,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "usersEmployees",
      Nil,
      "GET",
      this.prefix + """employees""",
      """""",
      Seq()
    )
  )

  // @LINE:28
  private[this] lazy val controllers_HomeController_addManager11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addManager")))
  )
  private[this] lazy val controllers_HomeController_addManager11_invoker = createInvoker(
    HomeController_1.addManager,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addManager",
      Nil,
      "GET",
      this.prefix + """addManager""",
      """""",
      Seq()
    )
  )

  // @LINE:29
  private[this] lazy val controllers_HomeController_addManagerSubmit12_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addManagerSubmit")))
  )
  private[this] lazy val controllers_HomeController_addManagerSubmit12_invoker = createInvoker(
    HomeController_1.addManagerSubmit,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addManagerSubmit",
      Nil,
      "POST",
      this.prefix + """addManagerSubmit""",
      """""",
      Seq()
    )
  )

  // @LINE:32
  private[this] lazy val controllers_LoginController_registerUser13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("registerUser")))
  )
  private[this] lazy val controllers_LoginController_registerUser13_invoker = createInvoker(
    LoginController_4.registerUser,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "registerUser",
      Nil,
      "GET",
      this.prefix + """registerUser""",
      """""",
      Seq()
    )
  )

  // @LINE:33
  private[this] lazy val controllers_LoginController_registerUserSubmit14_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("registerUserSubmit")))
  )
  private[this] lazy val controllers_LoginController_registerUserSubmit14_invoker = createInvoker(
    LoginController_4.registerUserSubmit(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "registerUserSubmit",
      Nil,
      "POST",
      this.prefix + """registerUserSubmit""",
      """""",
      Seq()
    )
  )

  // @LINE:37
  private[this] lazy val controllers_LoginController_login15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_LoginController_login15_invoker = createInvoker(
    LoginController_4.login,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "login",
      Nil,
      "GET",
      this.prefix + """login""",
      """""",
      Seq()
    )
  )

  // @LINE:38
  private[this] lazy val controllers_LoginController_loginSubmit16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("loginSubmit")))
  )
  private[this] lazy val controllers_LoginController_loginSubmit16_invoker = createInvoker(
    LoginController_4.loginSubmit,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "loginSubmit",
      Nil,
      "GET",
      this.prefix + """loginSubmit""",
      """""",
      Seq()
    )
  )

  // @LINE:41
  private[this] lazy val controllers_LoginController_logout17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_LoginController_logout17_invoker = createInvoker(
    LoginController_4.logout,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "logout",
      Nil,
      "GET",
      this.prefix + """logout""",
      """""",
      Seq()
    )
  )

  // @LINE:43
  private[this] lazy val controllers_CountController_count18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("count")))
  )
  private[this] lazy val controllers_CountController_count18_invoker = createInvoker(
    CountController_0.count,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CountController",
      "count",
      Nil,
      "GET",
      this.prefix + """count""",
      """ An example controller showing how to use dependency injection""",
      Seq()
    )
  )

  // @LINE:45
  private[this] lazy val controllers_AsyncController_message19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("message")))
  )
  private[this] lazy val controllers_AsyncController_message19_invoker = createInvoker(
    AsyncController_2.message,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AsyncController",
      "message",
      Nil,
      "GET",
      this.prefix + """message""",
      """ An example controller showing how to write asynchronous code""",
      Seq()
    )
  )

  // @LINE:48
  private[this] lazy val controllers_Assets_versioned20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned20_invoker = createInvoker(
    Assets_3.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_1.index)
      }
  
    // @LINE:8
    case controllers_HomeController_projects1_route(params@_) =>
      call(params.fromQuery[Long]("proj", Some(0L))) { (proj) =>
        controllers_HomeController_projects1_invoker.call(HomeController_1.projects(proj))
      }
  
    // @LINE:9
    case controllers_HomeController_about2_route(params@_) =>
      call { 
        controllers_HomeController_about2_invoker.call(HomeController_1.about)
      }
  
    // @LINE:12
    case controllers_HomeController_addEmployee3_route(params@_) =>
      call { 
        controllers_HomeController_addEmployee3_invoker.call(HomeController_1.addEmployee)
      }
  
    // @LINE:16
    case controllers_HomeController_addEmployeeSubmit4_route(params@_) =>
      call { 
        controllers_HomeController_addEmployeeSubmit4_invoker.call(HomeController_1.addEmployeeSubmit)
      }
  
    // @LINE:18
    case controllers_HomeController_deleteEmployee5_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_HomeController_deleteEmployee5_invoker.call(HomeController_1.deleteEmployee(id))
      }
  
    // @LINE:19
    case controllers_HomeController_deleteManager6_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_HomeController_deleteManager6_invoker.call(HomeController_1.deleteManager(id))
      }
  
    // @LINE:21
    case controllers_HomeController_updateEmployee7_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_HomeController_updateEmployee7_invoker.call(HomeController_1.updateEmployee(id))
      }
  
    // @LINE:22
    case controllers_HomeController_updateManager8_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_HomeController_updateManager8_invoker.call(HomeController_1.updateManager(id))
      }
  
    // @LINE:24
    case controllers_HomeController_usersManagers9_route(params@_) =>
      call { 
        controllers_HomeController_usersManagers9_invoker.call(HomeController_1.usersManagers)
      }
  
    // @LINE:25
    case controllers_HomeController_usersEmployees10_route(params@_) =>
      call { 
        controllers_HomeController_usersEmployees10_invoker.call(HomeController_1.usersEmployees)
      }
  
    // @LINE:28
    case controllers_HomeController_addManager11_route(params@_) =>
      call { 
        controllers_HomeController_addManager11_invoker.call(HomeController_1.addManager)
      }
  
    // @LINE:29
    case controllers_HomeController_addManagerSubmit12_route(params@_) =>
      call { 
        controllers_HomeController_addManagerSubmit12_invoker.call(HomeController_1.addManagerSubmit)
      }
  
    // @LINE:32
    case controllers_LoginController_registerUser13_route(params@_) =>
      call { 
        controllers_LoginController_registerUser13_invoker.call(LoginController_4.registerUser)
      }
  
    // @LINE:33
    case controllers_LoginController_registerUserSubmit14_route(params@_) =>
      call { 
        controllers_LoginController_registerUserSubmit14_invoker.call(LoginController_4.registerUserSubmit())
      }
  
    // @LINE:37
    case controllers_LoginController_login15_route(params@_) =>
      call { 
        controllers_LoginController_login15_invoker.call(LoginController_4.login)
      }
  
    // @LINE:38
    case controllers_LoginController_loginSubmit16_route(params@_) =>
      call { 
        controllers_LoginController_loginSubmit16_invoker.call(LoginController_4.loginSubmit)
      }
  
    // @LINE:41
    case controllers_LoginController_logout17_route(params@_) =>
      call { 
        controllers_LoginController_logout17_invoker.call(LoginController_4.logout)
      }
  
    // @LINE:43
    case controllers_CountController_count18_route(params@_) =>
      call { 
        controllers_CountController_count18_invoker.call(CountController_0.count)
      }
  
    // @LINE:45
    case controllers_AsyncController_message19_route(params@_) =>
      call { 
        controllers_AsyncController_message19_invoker.call(AsyncController_2.message)
      }
  
    // @LINE:48
    case controllers_Assets_versioned20_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned20_invoker.call(Assets_3.versioned(path, file))
      }
  }
}
