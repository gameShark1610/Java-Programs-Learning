package ventas;

public class PruebaVentas {
    public static void main(String[] args) {
        System.out.println("*** Sistema de ventas ***");
        var producto1= new Producto("Blusa",30.00);
//        System.out.println(producto1);
        var producto2= new Producto("Zapatos",50.00);
//        System.out.println(producto2);
        // Primer Orden
        var orden1= new Orden();
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        System.out.println(orden1);
    }
}
