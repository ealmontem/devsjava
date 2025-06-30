package oop.herencia.registropagosconstructores;

public class MetodoPago {
    protected String cliente;

    public MetodoPago(String cliente){
        this.cliente = cliente;
    }

    public void realizarPago(double monto){
        validaPago(monto);
    }

    public void validaPago(double monto){
        if (monto <= 0){
            System.out.println("Monto Invalido.");
        }else {
            System.out.println("Procesando pago de $ " + monto + " para " + cliente);
        }
    }
}
