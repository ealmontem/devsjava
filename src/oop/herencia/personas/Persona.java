package oop.herencia.personas;

public class Persona {
    String nombre;
    String fechaDeNacimiento;

    public Persona(String nombre, String fechaDeNacimiento){
        this.nombre = nombre;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public Persona dormir(){
        System.out.println("Soy la persona " + nombre + " y estoy durmiendo");
        return null;
    }

    void respirar(){
        System.out.println("Soy " + nombre + " y estoy respirando desde " + fechaDeNacimiento);
    }
    void comer(){
        System.out.println("soy " + nombre + " y me gustar comer!");
    }
}
