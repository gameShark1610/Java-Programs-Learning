package temasAvanzados;

public interface InterfacesTraductor {
    // public y abstract
    void traducir();

    // Metodos con implementacion por default
    default void iniciarTraductor(){
        System.out.println("Iniciando traductor...");
    }
}

class Ingles implements InterfacesTraductor{
    @Override
    public void traducir(){
        System.out.println("Traduzco a Ingles");
    }
}

class Frances implements InterfacesTraductor{
    public void traducir(){
        System.out.println("Traduzco a Frances");
    }

    @Override
    public void iniciarTraductor(){
        System.out.println("Iniciando traductor en Frances...");
    }
}

class PruebaTraductor{
    public static void main(String[] args) {
        InterfacesTraductor ingles = new Ingles();
        ingles.iniciarTraductor();
        ingles.traducir();
        // Traductor en Frances
        InterfacesTraductor frances = new Frances();
        frances.iniciarTraductor();
        frances.traducir();
    }
}
