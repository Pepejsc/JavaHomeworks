
package testcompra;

/**
 *
 * @author E2
 */
public class DetalleDeFactura {
    private Produccto produccto;
    private int cantidad;
    private double subtotal;

    public DetalleDeFactura(Produccto produccto, int cantidad){
        this.produccto = produccto;
        this.cantidad = cantidad;
        this.subtotal = this.cantidad * this.produccto.getPrecio();
    }

    public double getSubtotal() {
        return this.subtotal;
    }

    @Override
    public String toString() {
        return produccto +
                " | cantidad: " + cantidad +
                " | subtotal: " + subtotal;
    }
}
