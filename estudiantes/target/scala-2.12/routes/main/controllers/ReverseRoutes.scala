// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/ss/Desktop/Estructura de datos/sbt/estudiantes/conf/routes
// @DATE:Sat May 26 09:52:24 COT 2018

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def indexCrear(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "crear")
    }
  
    // @LINE:10
    def buscar(identificacion:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "buscar/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("identificacion", identificacion)))
    }
  
    // @LINE:8
    def crear(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "crear")
    }
  
    // @LINE:11
    def eliminar(identificacion:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "eliminar/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("identificacion", identificacion)))
    }
  
    // @LINE:9
    def search(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "search")
    }
  
    // @LINE:6
    def indexList(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "listado")
    }
  
  }

  // @LINE:15
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:15
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
