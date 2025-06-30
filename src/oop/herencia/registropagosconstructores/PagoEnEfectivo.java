package oop.herencia.registropagosconstructores;

public class PagoEnEfectivo extends MetodoPago{
    public PagoEnEfectivo(String cliente){
        super(cliente);
    }

    @Override
    public void realizarPago(double monto) {
        super.validaPago(monto);
    }
}
