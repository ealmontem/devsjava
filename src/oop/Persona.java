package oop;

//Definicion de la clase
public class Persona {
    //atributos
    String nombre;
    int edad;
    char genero;

    //metodos
    void imprimirInformacion(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Genero: " + genero);
    }

    public static void main(String[] args) {
       Persona p = new Persona();
       p.nombre = "Alex";
       p.edad = 33;
       p.genero = 'M';
       p.imprimirInformacion();
    }


}
