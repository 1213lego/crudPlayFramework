// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/ss/Desktop/Estructura de datos/sbt/estudiantes/conf/routes
// @DATE:Sat May 26 09:52:24 COT 2018

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def indexCrear: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.indexCrear",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "crear"})
        }
      """
    )
  
    // @LINE:10
    def buscar: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.buscar",
      """
        function(identificacion0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "buscar/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("identificacion", identificacion0))})
        }
      """
    )
  
    // @LINE:8
    def crear: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.crear",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "crear"})
        }
      """
    )
  
    // @LINE:11
    def eliminar: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.eliminar",
      """
        function(identificacion0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "eliminar/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("identificacion", identificacion0))})
        }
      """
    )
  
    // @LINE:9
    def search: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.search",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "search"})
        }
      """
    )
  
    // @LINE:6
    def indexList: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.indexList",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "listado"})
        }
      """
    )
  
  }

  // @LINE:15
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:15
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
