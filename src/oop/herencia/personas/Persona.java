package oop.herencia.personas;

public class Persona {
    String nombre;
    String fechaDeNacimiento;

    void dormir(){
        System.out.println("soy " + nombre + " y estoy durmiendo");

    }

    void respirar(){
        System.out.println("soy " + nombre + " y estoy respirando desde " + fechaDeNacimiento);
    }
    void comer(){
        System.out.println("soy " + nombre + " y me gustar comer!");
    }
}
