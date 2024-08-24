package archivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class LeerArchivo {
    public static void main(String[] args) {
        // Leer archivo
        var nombreArchivo= "mi_archivo.txt";
        var archivo = new File(nombreArchivo);
        try {
            System.out.println("Contenido del archivo: ");
            // Abrir el archivo para lectura
            var entrada = new BufferedReader(new FileReader(archivo));
            // Leemos linea a linea el archivo
            var linea = entrada.readLine();
            //Leemos todas las lineas
            while (linea != null){
                System.out.println(linea);
                // antes de terminar el ciclo nos movemos de linea
                linea = entrada.readLine();
            }
            // Cerrar archivo
            entrada.close();
        } catch (Exception e){
            System.out.println("Error al leer archivo");
        }
    }
}
