package BasicoJava;

import java.util.Random;
import java.util.Scanner;

public class GeneradorID {
    public static void main(String[] args) {

        var escaner = new Scanner(System.in);
        var random = new Random();

        System.out.println("*** Sistema Generador de ID unico ***");
        System.out.println("Cual es tu nombre?");
        var nombre= escaner.nextLine();
        System.out.println("Cual es tu apellido?");
        var apellido= escaner.nextLine();
        System.out.println("Cual es tu año de nacimiento (YYYY)?");
        var nacimiento= escaner.nextLine();


        var inicialesNombre=nombre.trim().toUpperCase().substring(0,2);
        var inicialesApellido=apellido.trim().toUpperCase().substring(0,2);
        var inicialesNacimiento=nacimiento.trim().toUpperCase().substring(2);
        var iniciales=inicialesNombre.concat(inicialesApellido).concat(inicialesNacimiento);
        var numeroAleatorio= random.nextInt(9999)+1;
        var numeroString=String.format("%04d",numeroAleatorio);
        var id= iniciales.concat(numeroString);

        System.out.printf("""
                %nDetalle Persona:
                \tTu nuevo numero de identificacion (ID) generado por el sistema es:
                \t%s
                \tFelicidades!
                """,id);
    }
}
