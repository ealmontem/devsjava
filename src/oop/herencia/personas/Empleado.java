package oop.herencia.personas;

public class Empleado extends Persona{
    float sueldo;

    void trabajar(){
        System.out.println("Soy " + nombre + " y trabajo");
    }

    void cobrar(){
        System.out.println("Soy " + nombre + " y cobro " + sueldo);
    }
}
