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

public class EjemploHerencia{
    public static void main(String[] args) {
        Perro perro = new Perro();
        perro.nombre = "Tobty";
        perro.respirar();
        perro.comer();
    }
}



