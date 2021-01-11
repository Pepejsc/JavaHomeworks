
package testcompra;

/**
 *
 * @author E2
 */
public class TestCompra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cliente c1 = new Cliente("Pepe Jose", "1105557993", "Quito");
        Produccto p1 = new Produccto("Micro SD 32 Ggs", 14.0);
        Produccto p2 = new Produccto("Flash memory 8 Ggs", 12.0);
        Produccto p3 = new Produccto("Teclado", 8.0);
        Produccto p4 = new Produccto("Mause", 4.80);
        Produccto p5 = new Produccto("Parlantes 48 wks", 13.50);
        Produccto p6 = new Produccto("Luces led", 18.0);

        Factura factura1 = new Factura(c1, new DetalleDeFactura(p1,5), new DetalleDeFactura(p5,8));

        System.out.println(factura1);
    }
    
}
