package oop.herencia;

class Animal {
    String nombre;
    void respirar(){
        System.out.println("El Animal respirar!");
    }
    void comer(){
        System.out.println("El Animal Come Mucho!");
    }
}

class Perro extends Animal{


}


class Gato extends Animal{


}

class Puerco extends Animal{

}

class Carro{

}



public class EjemploHerencia{
    public static void main(String[] args) {
        Carro carro = new Carro();
        Animal animal = new Animal();
        Perro perro = new Perro();
        perro.nombre = "Tobty";
        perro.respirar();
        perro.comer();
        Puerco puerco = new Puerco();
        puerco.nombre = "Choin";
        puerco.respirar();
        System.out.println(perro instanceof Animal);
        System.out.println(perro instanceof Perro);
        System.out.println(puerco instanceof Puerco);
        System.out.println(animal instanceof Puerco);

    }
}



