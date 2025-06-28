package oop.herencia.personas;

public class Main {
    public static void main(String[] args) {
        Estudiante e = new Estudiante();
        e.nombre = "Elvis";
        e.fechaDeNacimiento = "12/01/1987";
        e.numeroDeCuenta = 3344;

        e.aprobar();
        e.respirar();

        Empleado empleado = new Empleado();
        empleado.nombre = "Juan";
        empleado.sueldo = 100.3f;
        empleado.trabajar();
        empleado.cobrar();





    }
}
