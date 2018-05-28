// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/ss/Desktop/Estructura de datos/sbt/estudiantes/conf/routes
// @DATE:Mon May 28 14:40:35 COT 2018

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseControladorPropietario ControladorPropietario = new controllers.ReverseControladorPropietario(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseHomeController HomeController = new controllers.ReverseHomeController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseControladorVehiculo ControladorVehiculo = new controllers.ReverseControladorVehiculo(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseControladorPropietario ControladorPropietario = new controllers.javascript.ReverseControladorPropietario(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseHomeController HomeController = new controllers.javascript.ReverseHomeController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseControladorVehiculo ControladorVehiculo = new controllers.javascript.ReverseControladorVehiculo(RoutesPrefix.byNamePrefix());
  }

}
