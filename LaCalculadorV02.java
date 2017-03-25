
package la.calculador.v02;
import java.util.Scanner;

public class LaCalculadorV02 {

    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        int cantidad,resp2;
        String resp;
        carro carrito= new carro();
        carrito.llenarPrecio();
        carrito.compra();
        carrito.modificarCarro();
        System.out.println("El monto de su compra es $ "+carrito.total());
        carrito.pago();
    }
}
