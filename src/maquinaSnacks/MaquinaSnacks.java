package maquinaSnacks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaquinaSnacks {
    public static void main(String[] args) {
        maquinaSnacks();
    }

    public static void maquinaSnacks(){
        var salir=false;
        var consola = new Scanner(System.in);
        // Creamos la lista de productos tipo snack
        List<Snack> productos = new ArrayList<>();
        System.out.println("*** Maquina de Snacks ***");
        Snacks.mostrarSnack();
        while (!salir){
            try {
                var opcion = mostrarMenu(consola);
                //salir = ejecutarOpciones(opcion,consola,productos);

            } catch (Exception e){
                System.out.println("Ocurrio un error: " + e);
            }
            finally {
                System.out.println();//Imprime un salto de linea con cada Iteracion
            }
        }
    }

    private  static  int mostrarMenu(Scanner consola){
        System.out.println("""
                Menu:
                1. Comprar snack
                2. Mostrar ticket
                3. Agregar Nuevo Snack
                4. Salir
                Elige una opcion:\s""");
        // Leemos y retornamos la opcion seleccionada por el usuario
        return  Integer.parseInt(consola.nextLine());
    }


}
