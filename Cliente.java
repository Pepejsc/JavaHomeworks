
package testcompra;

/**
 *
 * @author E2
 */
public class Cliente {
    private String nombre;
    private String cedula;
    private String direccion;

    public Cliente(String nombre, String cedula, String direccion) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "--------------------------------\n" +
                " COMERCIAL R&R                 Ruc: 1756515625001"+
                "\nnombre: " + nombre +
                "\ncedula: " + cedula  +
                "\ndireccion: " + direccion+
                "\n*******************************";
    }
}
