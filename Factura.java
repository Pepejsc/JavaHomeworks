
package testcompra;

import java.util.Arrays;

/**
 *
 * @author E2
 */
public class Factura {
    private Cliente cliente;
    private DetalleDeFactura[] detalleDeFacturas;
    private double totalIVA;
    private double total;

    public Factura(Cliente cliente, DetalleDeFactura ... detalleDeFacturas){
        this.cliente = cliente;
        this.detalleDeFacturas = detalleDeFacturas;
        sumarSubtotal();
        calcularIva();
    }

    private void calcularIva() {
        this.totalIVA = total * 0.12;
    }

    private void sumarSubtotal() {
        for (DetalleDeFactura detalleDeFactura: this.detalleDeFacturas){
            this.total += detalleDeFactura.getSubtotal();
        }
    }

    public double imprimirFactura(){
        return (this.totalIVA + this.total);
    }

    @Override
    public String toString() {
        return  cliente + Arrays.toString(detalleDeFacturas) +
                "\n/////////////////////////////////" +
                "\ntotalIVA: " + totalIVA +
                "\ntotal: " + total;
    }
}
