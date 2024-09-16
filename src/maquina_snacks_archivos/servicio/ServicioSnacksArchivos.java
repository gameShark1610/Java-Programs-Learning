package maquina_snacks_archivos.servicio;

import maquina_snacks_archivos.dominio.Snack;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class ServicioSnacksArchivos implements IServicioSnacks{
    private final String NOMBRE_ARCHIVO = "snacks.txt";
    // Crear la lista de snacks
    private List<Snack> snacks = new ArrayList<>();

    // Contructor clase
    public  ServicioSnacksArchivos(){
        //Creamos el archivo si no existe
        var archivo = new File(NOMBRE_ARCHIVO);
        var existe = false;
        try {
            existe = archivo.exists();
            if (existe){
                this.snacks =obtenerSnacks();
            }
            else {
                var salida = new PrintWriter(new FileWriter(archivo));
                salida.close();
                System.out.println("Se ha creado el archivo");
            }

        } catch (Exception e) {
            System.out.println("Error al crear el archivo: "+ e.getMessage());
        }

        if (!existe) cargarSnacksIniciales();
    }

    public  void cargarSnacksIniciales(){
        this.agregarSnack(new Snack("Papas",70));
        this.agregarSnack(new Snack("Refresco",50));
        this.agregarSnack(new Snack("Sandwich",120));

    }

    private void agregarSnackArchivo(Snack snack){
        boolean anexar = false;
        var archivo = new File(NOMBRE_ARCHIVO);
        try {
            anexar = archivo.exists();
            var salida= new PrintWriter(new FileWriter(archivo,anexar));
            salida.println(snack.escribirSnack());
            salida.close(); //Se escribe la informacion en el archivo
        } catch (Exception e) {
            System.out.println("Error al agregar snack: "+ e.getMessage());
        }
    }

    private List<Snack> obtenerSnacks(){
        var snacks = new ArrayList<Snack>();
        try {
            List<String> lineas = Files.readAllLines(Paths.get(NOMBRE_ARCHIVO));
            for (String linea: lineas){
                String[] lineaSnack = linea.split(",");
                var idSnack = lineaSnack[0];
                var nombre = lineaSnack[1];
                var precio = Double.parseDouble(lineaSnack[2]);
                var snack = new Snack(nombre,precio);
                snacks.add(snack);
            }
        } catch (IOException e) {
            System.out.printf("Error al leer archivo: " + e.getMessage());

        }


        return snacks;
    }

    @Override
    public void agregarSnack(Snack snack) {
        // Agregamos el nuevo snack, 1. a la lista en memorio
        this.snacks.add(snack);
        // 2. Guardamos el snack en el archivo
        this.agregarSnackArchivo(snack);

    }

    @Override
    public void mostrarSnacks() {
        System.out.println("--- Snacks en el inventario ---");
        //Mostramos la lista de snacks en el archivo
        var inventarioSnacks= "";
        for (var snack: this.snacks){
            inventarioSnacks += snack.toString() + "\n";
        }
        System.out.println(inventarioSnacks);

    }

    @Override
    public List<Snack> getSnacks() {
        return List.of();
    }
}
