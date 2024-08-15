public class Programas {
    public static void main(String[] args) {
        System.out.println("***Generador de Gmail***");
        var nombre="Ubaldo Acosta Soto";
        var empresa="global Mentoring";
        var dominio=".com.mx";

        System.out.println("Nombre usuario = " + nombre);
        nombre=nombre.toLowerCase().replace(" ",".");
        System.out.println("Nombre usuario normalizado = " + nombre + "\n");

        System.out.println("Nombre empresa = " + empresa);
        System.out.println("Extension del dominio = " + dominio);
        dominio=empresa.toLowerCase().replace(" ","").concat(dominio);
        System.out.println("Dominio de email normalizado = " + dominio + "\n");

        var correo=nombre.concat("@").concat(dominio);
        System.out.println("Email final generado = " + correo);
    }
}
