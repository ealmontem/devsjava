package oop.herencia.personas;

public class Main {
    public static void main(String[] args) {

        Estudiante e = new Estudiante(3221,"Juan","22/02/1989");
        e.nombre = "Elvis";
        e.fechaDeNacimiento = "12/01/1987";

        Empleado empleado = new Empleado(23.2f, "Robert", "23/09/2000");
        empleado.nombre = "Juan";
        empleado.sueldo = 100.3f;
        empleado.trabajar();
        empleado.cobrar();
        empleado.dormir();
        System.out.println("Imprimir dormir");
        imprimeMensaje(e);
        imprimeMensaje(empleado);

    }

    public static void imprimeMensaje(Persona persona){
        persona.dormir();
    }
}
