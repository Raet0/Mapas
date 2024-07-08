import controllers.Ejercicios;
import controllers.EmpleadoController;
import controllers.Mapa;
import models.Empleado;

public class App {
    public static void main(String[] args) {
                // Ejecuta el ejemplo de uso de HashMap con ejemplos sencillos
                runMapExamlpe();

                // Ejecuta el ejemplo de gestión de empleados usando HashMap
                runEmpleadoExample();
        
                // Ejecuta los ejercicios de sumatoria y anagramas
                //runEjerccios();
            }
        
            private static void runEmpleadoExample() {
                EmpleadoController empCtrl  = new EmpleadoController();
                empCtrl.addEmpleado(new Empleado(1, "Pepe", "El mago"));
                empCtrl.addEmpleado(new Empleado(2, "Ayala", "Cerda"));
                empCtrl.addEmpleado(new Empleado(3, "Alexis", "Soporte"));
                empCtrl.addEmpleado(new Empleado(4, "Pangust", "Fraguer"));
                
                empCtrl.imprimirEmpleados();
            }
        
            private static void runMapExamlpe() {
                new Mapa();
            }
        
            private static void runEjerccios() {
                Ejercicios ejercicios = new Ejercicios();
                // Test para sumatoriaDeDos
                int[] nums = { 11, 2, 7, -2 };
                int objetivo = 5;
                int[] resultado = ejercicios.sumatoriaDeDos(nums, objetivo);
                if (resultado != null) {
                    System.out.println(
                            "Suma de dos para objetivo " + objetivo + ": [" + resultado[0] + ", " + resultado[1] + "]");
                } else {
                    System.out.println("No se encontraron dos números que sumen " + objetivo);
                }
        
                objetivo = 10;
                resultado = ejercicios.sumatoriaDeDos(nums, objetivo);
                if (resultado != null) {
                    System.out.println(
                            "Suma de dos para objetivo " + objetivo + ": [" + resultado[0] + ", " + resultado[1] + "]");
                } else {
                    System.out.println("No se encontraron dos números que sumen " + objetivo);
                }
        
                //// EJERCICIO 2
                // Test para areAnagrams
                String str1 = "listen";
                String str2 = "silent";
                boolean sonAnagramas = Ejercicios.areAnagrams(str1, str2);
                System.out.println("¿Son anagramas '" + str1 + "' y '" + str2 + "'? " + sonAnagramas);
        
                str1 = "hello";
                str2 = "bello";
                sonAnagramas = Ejercicios.areAnagrams(str1, str2);
                System.out.println("¿Son anagramas '" + str1 + "' y '" + str2 + "'? " + sonAnagramas);

    }
}
