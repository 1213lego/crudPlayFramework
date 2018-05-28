// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/ss/Desktop/Estructura de datos/sbt/estudiantes/conf/routes
// @DATE:Sun May 27 23:26:57 COT 2018

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {

  // @LINE:15
  class ReverseControladorPropietario(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:16
    def indexCrear: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ControladorPropietario.indexCrear",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "crearpropietario"})
        }
      """
    )
  
    // @LINE:19
    def buscar: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ControladorPropietario.buscar",
      """
        function(cedula0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "buscarPropietario/cc" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[Long]].javascriptUnbind + """)("cedula", cedula0)])})
        }
      """
    )
  
    // @LINE:17
    def crearPropietario: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ControladorPropietario.crearPropietario",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "crearpropietario"})
        }
      """
    )
  
    // @LINE:21
    def buscarRedireccionar: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ControladorPropietario.buscarRedireccionar",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "buscarPropietario"})
        }
      """
    )
  
    // @LINE:18
    def listaPropietarios: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ControladorPropietario.listaPropietarios",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "listaPropietarios"})
        }
      """
    )
  
    // @LINE:20
    def buscarProp: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ControladorPropietario.buscarProp",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "buscarPropietario"})
        }
      """
    )
  
    // @LINE:15
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ControladorPropietario.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "principal"})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def indexCrear: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.indexCrear",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "crearEstudiante"})
        }
      """
    )
  
    // @LINE:11
    def buscar: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.buscar",
      """
        function(identificacion0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "buscarEstudiante/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("identificacion", identificacion0))})
        }
      """
    )
  
    // @LINE:9
    def crear: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.crear",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "crearEstudiante"})
        }
      """
    )
  
    // @LINE:12
    def eliminar: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.eliminar",
      """
        function(identificacion0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "eliminarEstudiante/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("identificacion", identificacion0))})
        }
      """
    )
  
    // @LINE:10
    def search: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.search",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "searchEstudiante"})
        }
      """
    )
  
    // @LINE:7
    def indexList: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.indexList",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "listadoEstudiante"})
        }
      """
    )
  
    // @LINE:6
    def mainPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.mainPage",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "homeEstudiante"})
        }
      """
    )
  
  }

  // @LINE:23
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:23
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }


}
