package oop.herencia.manejopagos;

public class PagoConTarjeta extends MetodoPago{
    @Override
    public void realizarPago(double monto) {
        System.out.println("Pago de $ " + monto + " procesado con tarjeta de credito.");
    }
}
