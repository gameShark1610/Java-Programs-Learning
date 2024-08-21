package temasAvanzados;

import java.security.Key;
import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {
        Map<String,String> persona = new HashMap<>();
        persona.put("nombre","Diego");
        persona.put("Apellido", "Flores");
        persona.put("Edad", "31");
        persona.put("Edad", "31"); // No se permiten duplicados
        System.out.println("Valores del mapa: ");
        persona.entrySet().forEach(System.out::println);

        persona.put("Edad", "35"); //Modificar el valor existente
        persona.remove("Apellido");
        System.out.println("\nNuevos valores del mapa:");
        persona.entrySet().forEach(System.out::println);

        //Iterar sobre los elementos del mapa por separado
        System.out.println("\nIterando los elementos (llave,valor)");
        persona.forEach((llave, valor)-> System.out.println("llave = " + llave + ", Valor = "+ valor)
        );



    }
}
