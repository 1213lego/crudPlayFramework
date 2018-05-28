// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/ss/Desktop/Estructura de datos/sbt/estudiantes/conf/routes
// @DATE:Sun May 27 23:26:57 COT 2018

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
  // @LINE:15
  ControladorPropietario_2: controllers.ControladorPropietario,
  // @LINE:23
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_0: controllers.HomeController,
    // @LINE:15
    ControladorPropietario_2: controllers.ControladorPropietario,
    // @LINE:23
    Assets_1: controllers.Assets
  ) = this(errorHandler, HomeController_0, ControladorPropietario_2, Assets_1, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_0, ControladorPropietario_2, Assets_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """homeEstudiante""", """controllers.HomeController.mainPage()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """listadoEstudiante""", """controllers.HomeController.indexList()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """crearEstudiante""", """controllers.HomeController.indexCrear()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """crearEstudiante""", """controllers.HomeController.crear()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """searchEstudiante""", """controllers.HomeController.search()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """buscarEstudiante/""" + "$" + """identificacion<[^/]+>""", """controllers.HomeController.buscar(identificacion:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """eliminarEstudiante/""" + "$" + """identificacion<[^/]+>""", """controllers.HomeController.eliminar(identificacion:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """principal""", """controllers.ControladorPropietario.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """crearpropietario""", """controllers.ControladorPropietario.indexCrear()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """crearpropietario""", """controllers.ControladorPropietario.crearPropietario()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """listaPropietarios""", """controllers.ControladorPropietario.listaPropietarios()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """buscarPropietario/cc""", """controllers.ControladorPropietario.buscar(cedula:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """buscarPropietario""", """controllers.ControladorPropietario.buscarProp()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """buscarPropietario""", """controllers.ControladorPropietario.buscarRedireccionar()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_mainPage0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("homeEstudiante")))
  )
  private[this] lazy val controllers_HomeController_mainPage0_invoker = createInvoker(
    HomeController_0.mainPage(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "mainPage",
      Nil,
      "GET",
      this.prefix + """homeEstudiante""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:7
  private[this] lazy val controllers_HomeController_indexList1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("listadoEstudiante")))
  )
  private[this] lazy val controllers_HomeController_indexList1_invoker = createInvoker(
    HomeController_0.indexList(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "indexList",
      Nil,
      "GET",
      this.prefix + """listadoEstudiante""",
      """""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_HomeController_indexCrear2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("crearEstudiante")))
  )
  private[this] lazy val controllers_HomeController_indexCrear2_invoker = createInvoker(
    HomeController_0.indexCrear(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "indexCrear",
      Nil,
      "GET",
      this.prefix + """crearEstudiante""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_HomeController_crear3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("crearEstudiante")))
  )
  private[this] lazy val controllers_HomeController_crear3_invoker = createInvoker(
    HomeController_0.crear(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "crear",
      Nil,
      "POST",
      this.prefix + """crearEstudiante""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_HomeController_search4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("searchEstudiante")))
  )
  private[this] lazy val controllers_HomeController_search4_invoker = createInvoker(
    HomeController_0.search(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "search",
      Nil,
      "POST",
      this.prefix + """searchEstudiante""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_HomeController_buscar5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("buscarEstudiante/"), DynamicPart("identificacion", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_buscar5_invoker = createInvoker(
    HomeController_0.buscar(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "buscar",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """buscarEstudiante/""" + "$" + """identificacion<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_HomeController_eliminar6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("eliminarEstudiante/"), DynamicPart("identificacion", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_eliminar6_invoker = createInvoker(
    HomeController_0.eliminar(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "eliminar",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """eliminarEstudiante/""" + "$" + """identificacion<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_ControladorPropietario_index7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("principal")))
  )
  private[this] lazy val controllers_ControladorPropietario_index7_invoker = createInvoker(
    ControladorPropietario_2.index(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ControladorPropietario",
      "index",
      Nil,
      "GET",
      this.prefix + """principal""",
      """Propietarios""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_ControladorPropietario_indexCrear8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("crearpropietario")))
  )
  private[this] lazy val controllers_ControladorPropietario_indexCrear8_invoker = createInvoker(
    ControladorPropietario_2.indexCrear(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ControladorPropietario",
      "indexCrear",
      Nil,
      "GET",
      this.prefix + """crearpropietario""",
      """""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_ControladorPropietario_crearPropietario9_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("crearpropietario")))
  )
  private[this] lazy val controllers_ControladorPropietario_crearPropietario9_invoker = createInvoker(
    ControladorPropietario_2.crearPropietario(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ControladorPropietario",
      "crearPropietario",
      Nil,
      "POST",
      this.prefix + """crearpropietario""",
      """""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_ControladorPropietario_listaPropietarios10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("listaPropietarios")))
  )
  private[this] lazy val controllers_ControladorPropietario_listaPropietarios10_invoker = createInvoker(
    ControladorPropietario_2.listaPropietarios(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ControladorPropietario",
      "listaPropietarios",
      Nil,
      "GET",
      this.prefix + """listaPropietarios""",
      """""",
      Seq()
    )
  )

  // @LINE:19
  private[this] lazy val controllers_ControladorPropietario_buscar11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("buscarPropietario/cc")))
  )
  private[this] lazy val controllers_ControladorPropietario_buscar11_invoker = createInvoker(
    ControladorPropietario_2.buscar(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ControladorPropietario",
      "buscar",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """buscarPropietario/cc""",
      """""",
      Seq()
    )
  )

  // @LINE:20
  private[this] lazy val controllers_ControladorPropietario_buscarProp12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("buscarPropietario")))
  )
  private[this] lazy val controllers_ControladorPropietario_buscarProp12_invoker = createInvoker(
    ControladorPropietario_2.buscarProp(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ControladorPropietario",
      "buscarProp",
      Nil,
      "GET",
      this.prefix + """buscarPropietario""",
      """""",
      Seq()
    )
  )

  // @LINE:21
  private[this] lazy val controllers_ControladorPropietario_buscarRedireccionar13_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("buscarPropietario")))
  )
  private[this] lazy val controllers_ControladorPropietario_buscarRedireccionar13_invoker = createInvoker(
    ControladorPropietario_2.buscarRedireccionar(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ControladorPropietario",
      "buscarRedireccionar",
      Nil,
      "POST",
      this.prefix + """buscarPropietario""",
      """""",
      Seq()
    )
  )

  // @LINE:23
  private[this] lazy val controllers_Assets_versioned14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned14_invoker = createInvoker(
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
  
    // @LINE:15
    case controllers_ControladorPropietario_index7_route(params@_) =>
      call { 
        controllers_ControladorPropietario_index7_invoker.call(ControladorPropietario_2.index())
      }
  
    // @LINE:16
    case controllers_ControladorPropietario_indexCrear8_route(params@_) =>
      call { 
        controllers_ControladorPropietario_indexCrear8_invoker.call(ControladorPropietario_2.indexCrear())
      }
  
    // @LINE:17
    case controllers_ControladorPropietario_crearPropietario9_route(params@_) =>
      call { 
        controllers_ControladorPropietario_crearPropietario9_invoker.call(ControladorPropietario_2.crearPropietario())
      }
  
    // @LINE:18
    case controllers_ControladorPropietario_listaPropietarios10_route(params@_) =>
      call { 
        controllers_ControladorPropietario_listaPropietarios10_invoker.call(ControladorPropietario_2.listaPropietarios())
      }
  
    // @LINE:19
    case controllers_ControladorPropietario_buscar11_route(params@_) =>
      call(params.fromQuery[Long]("cedula", None)) { (cedula) =>
        controllers_ControladorPropietario_buscar11_invoker.call(ControladorPropietario_2.buscar(cedula))
      }
  
    // @LINE:20
    case controllers_ControladorPropietario_buscarProp12_route(params@_) =>
      call { 
        controllers_ControladorPropietario_buscarProp12_invoker.call(ControladorPropietario_2.buscarProp())
      }
  
    // @LINE:21
    case controllers_ControladorPropietario_buscarRedireccionar13_route(params@_) =>
      call { 
        controllers_ControladorPropietario_buscarRedireccionar13_invoker.call(ControladorPropietario_2.buscarRedireccionar())
      }
  
    // @LINE:23
    case controllers_Assets_versioned14_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned14_invoker.call(Assets_1.versioned(path, file))
      }
  }
}
