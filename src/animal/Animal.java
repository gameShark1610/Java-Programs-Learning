package animal;

public class Animal {
    protected void hacerSonido(){
        System.out.println("El animal hace un sonido");
    }

}

class Perro extends Animal{
    @Override
    public void hacerSonido(){
        System.out.println("El perro hace wauf");
    }
}

class Gato extends Animal{
    @Override
    public void hacerSonido(){
        System.out.println("El gato hace miau");
    }
}

class pruebaAnimal{

    //Metodo polimorfico
    static void imprimirSonido(Animal animal){
        animal.hacerSonido();
    }

    public static void main(String[] args) {
        //Objeto de la clase Padre (Animal)
        var animal=new Animal();
        var perro = new Perro();
        var gato= new Gato();
        imprimirSonido(animal);
        imprimirSonido(perro);
        imprimirSonido(gato);
    }
}