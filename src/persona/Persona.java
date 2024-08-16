package persona;

public class Persona{
    static int contadorPersonas = 0;
    private String nombre;
    private String apellido;

    public Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
        // Incrementar el atributo static
        Persona.contadorPersonas++;
    }

    @Override
    public String toString(){
        return "Nombre: " + this.nombre + ", Apellido: " + this.apellido
                + ", Dir. Mem. " + super.toString();
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}








