// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/Software-CA1/Software-CA1/Employee System - Latest Copy/conf/routes
// @DATE:Thu Mar 14 19:12:15 GMT 2019


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
