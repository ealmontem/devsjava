package oop.herencia.manejopagos;

public class PagoEfectivo extends MetodoPago{
    @Override
    public void realizarPago(double monto) {
        System.out.println("Pago de $ " + monto + " procesado en Efectivo.");
    }
}
