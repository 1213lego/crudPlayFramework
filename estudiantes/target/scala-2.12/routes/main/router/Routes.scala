// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/ss/Desktop/Estructura de datos/sbt/estudiantes/conf/routes
// @DATE:Sat May 26 21:25:28 COT 2018

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_0: controllers.HomeController,
  // @LINE:16
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_0: controllers.HomeController,
    // @LINE:16
    Assets_1: controllers.Assets
  ) = this(errorHandler, HomeController_0, Assets_1, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_0, Assets_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """home""", """controllers.HomeController.mainPage()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """listado""", """controllers.HomeController.indexList()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """crear""", """controllers.HomeController.indexCrear()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """crear""", """controllers.HomeController.crear()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """search""", """controllers.HomeController.search()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """buscar/""" + "$" + """identificacion<[^/]+>""", """controllers.HomeController.buscar(identificacion:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """eliminar/""" + "$" + """identificacion<[^/]+>""", """controllers.HomeController.eliminar(identificacion:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_mainPage0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("home")))
  )
  private[this] lazy val controllers_HomeController_mainPage0_invoker = createInvoker(
    HomeController_0.mainPage(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "mainPage",
      Nil,
      "GET",
      this.prefix + """home""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:7
  private[this] lazy val controllers_HomeController_indexList1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("listado")))
  )
  private[this] lazy val controllers_HomeController_indexList1_invoker = createInvoker(
    HomeController_0.indexList(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "indexList",
      Nil,
      "GET",
      this.prefix + """listado""",
      """""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_HomeController_indexCrear2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("crear")))
  )
  private[this] lazy val controllers_HomeController_indexCrear2_invoker = createInvoker(
    HomeController_0.indexCrear(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "indexCrear",
      Nil,
      "GET",
      this.prefix + """crear""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_HomeController_crear3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("crear")))
  )
  private[this] lazy val controllers_HomeController_crear3_invoker = createInvoker(
    HomeController_0.crear(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "crear",
      Nil,
      "POST",
      this.prefix + """crear""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_HomeController_search4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("search")))
  )
  private[this] lazy val controllers_HomeController_search4_invoker = createInvoker(
    HomeController_0.search(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "search",
      Nil,
      "POST",
      this.prefix + """search""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_HomeController_buscar5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("buscar/"), DynamicPart("identificacion", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_buscar5_invoker = createInvoker(
    HomeController_0.buscar(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "buscar",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """buscar/""" + "$" + """identificacion<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_HomeController_eliminar6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("eliminar/"), DynamicPart("identificacion", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_eliminar6_invoker = createInvoker(
    HomeController_0.eliminar(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "eliminar",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """eliminar/""" + "$" + """identificacion<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_Assets_versioned7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned7_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
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
    case controllers_HomeController_mainPage0_route(params@_) =>
      call { 
        controllers_HomeController_mainPage0_invoker.call(HomeController_0.mainPage())
      }
  
    // @LINE:7
    case controllers_HomeController_indexList1_route(params@_) =>
      call { 
        controllers_HomeController_indexList1_invoker.call(HomeController_0.indexList())
      }
  
    // @LINE:8
    case controllers_HomeController_indexCrear2_route(params@_) =>
      call { 
        controllers_HomeController_indexCrear2_invoker.call(HomeController_0.indexCrear())
      }
  
    // @LINE:9
    case controllers_HomeController_crear3_route(params@_) =>
      call { 
        controllers_HomeController_crear3_invoker.call(HomeController_0.crear())
      }
  
    // @LINE:10
    case controllers_HomeController_search4_route(params@_) =>
      call { 
        controllers_HomeController_search4_invoker.call(HomeController_0.search())
      }
  
    // @LINE:11
    case controllers_HomeController_buscar5_route(params@_) =>
      call(params.fromPath[Long]("identificacion", None)) { (identificacion) =>
        controllers_HomeController_buscar5_invoker.call(HomeController_0.buscar(identificacion))
      }
  
    // @LINE:12
    case controllers_HomeController_eliminar6_route(params@_) =>
      call(params.fromPath[Long]("identificacion", None)) { (identificacion) =>
        controllers_HomeController_eliminar6_invoker.call(HomeController_0.eliminar(identificacion))
      }
  
    // @LINE:16
    case controllers_Assets_versioned7_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned7_invoker.call(Assets_1.versioned(path, file))
      }
  }
}
