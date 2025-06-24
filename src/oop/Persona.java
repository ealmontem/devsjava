package oop;

//Definicion de la clase
public class Persona {
    //atributos
    String nombre;
    int edad;
    char genero;

    void jugarVideosJuegos(Persona persona){
        System.out.println(nombre + " juega videos juegos con " + persona.nombre);

    }

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
       //
        Persona p1 = new Persona();
        p1.nombre = "Juan";
        p1.edad = 89;
        p1.genero = 'M';
        p1.imprimirInformacion();
        p.jugarVideosJuegos(p1);
    }


}
