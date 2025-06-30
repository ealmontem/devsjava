package oop.herencia.manejopagos;

public class PagoConTransferencia extends MetodoPago{
    @Override
    public void realizarPago(double monto) {
        System.out.println("Pago de $ " + monto + " procesado con Transferencia.");
    }
}
