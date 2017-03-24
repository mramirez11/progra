
package la.calculador.v02;

import java.util.Scanner;








public class LaCalculadorV02 {

    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        int cantidad;
        String resp;
        carro carrito= new carro();
        carrito.llenarPrecio();
        for (int j = 0; j < 5; j++) {
            System.out.println("Desea agregar el producto " +(j+1)+ " si/no");
            resp=leer.next();
            
            if (resp.equals("si")){
                System.out.println("Ingrese cantidad del producto "+ (j+1));
                cantidad= leer.nextInt();
                carrito.llenarCantidad(cantidad, j);
            }       
        }
       
       
    System.out.println("El monto de su compra es $ "+carrito.total());   
        
    }
    
    
    //falta agregar lectura y seguir avanzando en el codigo
}
