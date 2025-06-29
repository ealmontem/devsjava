package oop.herencia.personas;

public class Estudiante extends Persona{
    int numeroDeCuenta;

    Estudiante(int numeroDeCuenta, String nombre, String fechaDeNacimiento){
        super(nombre, fechaDeNacimiento);
        this.numeroDeCuenta = numeroDeCuenta;
    }

    void aprobar(){
        System.out.println("Soy " + nombre + " y mi numero de cuenta es " + numeroDeCuenta + " y aprobe mi examen");
    }

    void reprobar(){
        System.out.println("Soy " + nombre + "y reprobe mi examen");
    }

    @Override
    void dormir() {
        System.out.println("Soy el Estudiante " + nombre + " y duermo poco");
        super.dormir();
    }
}
