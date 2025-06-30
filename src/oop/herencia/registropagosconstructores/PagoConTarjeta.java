package oop.herencia.registropagosconstructores;



public class PagoConTarjeta extends MetodoPago {
    public PagoConTarjeta(String cliente){
        super(cliente);
    }

    @Override
    public void realizarPago(double monto) {
       super.validaPago(monto);
    }
}
