package oop.herencia.personas;

public class Empleado extends Persona{
    float sueldo;

    Empleado(float sueldo, String nombre, String fechaDeNacimiento){
        super(nombre, fechaDeNacimiento);
        this.sueldo = sueldo;
    }
    void trabajar(){
        System.out.println("Soy " + nombre + " y trabajo");
    }

    void cobrar(){
        System.out.println("Soy " + nombre + " y cobro " + sueldo);
    }

    @Override
    void dormir() {
        System.out.println("Soy " + nombre + " y duermo muchisimo");
    }
}
