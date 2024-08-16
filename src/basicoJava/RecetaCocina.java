package basicoJava;

import java.util.Scanner;

public class RecetaCocina {
    public static void main(String[] args) {
        var consola= new Scanner(System.in);
        System.out.println("***Recetas de Cocina");

        System.out.print("Ingresa el nombre: ");
        var nombre= consola.nextLine();

        System.out.print("Ingresa los ingredientes: ");
        var ingredientes= consola.nextLine();

        System.out.print("Ingresa el tiempo de preparacion (min): ");
        var tiempo= consola.nextInt();

        System.out.print("Ingresa la dificultad: " + consola.nextLine());
        var dificultad= consola.nextLine();

        System.out.println("Nombre receta: " + nombre);
        System.out.println("Ingredientes: " + ingredientes);
        System.out.println("Tiempo de preparacion: " + tiempo);
        System.out.println("Dificultad: " + dificultad);



    }
}
