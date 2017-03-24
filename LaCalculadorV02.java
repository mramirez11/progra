
package la.calculador.v02;

import java.util.Scanner;








public class LaCalculadorV02 {

    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        int cantidad;
        carro carrito= new carro();
        carrito.llenarPrecio();
        for (int i = 0; i < 5; i++) {
        System.out.println("Ingrese cantidad del producto "+ (i+1));
        cantidad= leer.nextInt();
        
        carrito.llenarCantidad(cantidad, i);
            
        
        
        }
       
    System.out.println("El monto de su compra es $ "+carrito.total());   
        
    }
    
    
    //falta agregar lectura y seguir avanzando en el codigo
}
