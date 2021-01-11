
package testcompra;

/**
 *
 * @author E2
 */
public class Produccto {
    private String nombre;
    private double precio;

    public Produccto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public double getPrecio() {
        return this.precio;
    }

    @Override
    public String toString() {
        return "\nnombre: " + nombre +
                " | precio:" + precio;
    }
}
