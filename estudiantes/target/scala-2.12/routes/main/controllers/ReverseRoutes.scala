// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/ss/Desktop/Estructura de datos/sbt/estudiantes/conf/routes
// @DATE:Sun May 27 23:26:57 COT 2018

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:15
  class ReverseControladorPropietario(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:16
    def indexCrear(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "crearpropietario")
    }
  
    // @LINE:19
    def buscar(cedula:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "buscarPropietario/cc" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Long]].unbind("cedula", cedula)))))
    }
  
    // @LINE:17
    def crearPropietario(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "crearpropietario")
    }
  
    // @LINE:21
    def buscarRedireccionar(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "buscarPropietario")
    }
  
    // @LINE:18
    def listaPropietarios(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "listaPropietarios")
    }
  
    // @LINE:20
    def buscarProp(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "buscarPropietario")
    }
  
    // @LINE:15
    def index(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "principal")
    }
  
  }

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def indexCrear(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "crearEstudiante")
    }
  
    // @LINE:11
    def buscar(identificacion:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "buscarEstudiante/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("identificacion", identificacion)))
    }
  
    // @LINE:9
    def crear(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "crearEstudiante")
    }
  
    // @LINE:12
    def eliminar(identificacion:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "eliminarEstudiante/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("identificacion", identificacion)))
    }
  
    // @LINE:10
    def search(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "searchEstudiante")
    }
  
    // @LINE:7
    def indexList(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "listadoEstudiante")
    }
  
    // @LINE:6
    def mainPage(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "homeEstudiante")
    }
  
  }

  // @LINE:23
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:23
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
