package TemasAvanzados;

public class ClaseAbstracta {
    public static void main(String[] args) {
        FiguraGeometrica figuraGeometrica = new Rectangulo();
        figuraGeometrica.dibujar();
        figuraGeometrica=new Circulo();
        figuraGeometrica.dibujar();
    }
}

// Clase abstracta
abstract class FiguraGeometrica{ // No se puede instanciar
    public abstract void dibujar();
}

class Rectangulo extends FiguraGeometrica{
    @Override
    public void dibujar() {
        System.out.println("Se dibuja un Rectangulo");
    }
}

class  Circulo extends FiguraGeometrica{
    @Override
    public void dibujar() {
        System.out.println("Se dibuja un circulo");
    }
}