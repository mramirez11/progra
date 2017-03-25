package la.calculador.v02;
import java.util.Scanner;

public class carro {
    //Atributo
    int arregloProductos[][]= new int[2][5]; 
    
   
   public Calculadora cal = new Calculadora();
   

    
    //metodos
    public static int leerEntero(){
        int resp;
        Scanner leer= new Scanner(System.in);
        resp=leer.nextInt();
        return resp;
    }
    
     public static String leerStr(){
        String resp;
        Scanner leer= new Scanner(System.in);
        resp=leer.next();
        return resp;
    }
    
    public void llenarPrecio() {
       arregloProductos[1][0]= 2500;
       arregloProductos[1][1]= 2000;
       arregloProductos[1][2]= 500;
       arregloProductos[1][3]= 200;
       arregloProductos[1][4]= 1000;
    }
    public void llenarCantidad(int cant, int pos){
        for (int i = 0; i < 5; i++) {
            arregloProductos[0][pos]=cant;
        }
    }    
    
    public void compra(){
        String resp;
        int cantidad;
         for (int j = 0; j < 5; j++) {
            System.out.println("Desea agregar el producto " +(j+1)+ " si/no");
            resp=leerStr();
            if (resp.equals("si")) {                       //Validacion entrada
                System.out.println("Ingrese cantidad del producto "+ (j+1));
                cantidad= carro.leerEntero();
                llenarCantidad(cantidad, j);
                }
            }  
    }
    
    public void modificarCarro(){
        String resp;
        int resp2;
        System.out.println("Desea modificar su carrito? (si/no)");
            resp=leerStr();
            while(resp.equals("si")){
                if (resp.equals("si")){
                System.out.println("Desea agregar(0) o quitar producto(1)");
                resp2=leerEntero();
                if(resp2==0){
                    agregarProducto();
                }if (resp2==1){
                    quitarProducto();
                }
            }System.out.println("Desea seguir modificando su carrito? (si/no)");
            resp=leerStr();
            if (resp.equals("no")) {
            break;
             
        } 
            }
           
    }
    
    public void agregarProducto(){
        int resp,resp2;
        System.out.println("Ingrese numero del producto que desea agregar?");
        resp=leerEntero();
        for (int i = 0; i < 5; i++) {
            if (resp==(i+1)) {
                System.out.println("Cuanto productos desea llevar?");
                resp2=leerEntero();
                arregloProductos[0][i]=resp2;
                System.out.println("Su costo seria de $ "+total());
            }
        }
    }
    public void quitarProducto(){
         int resp,resp2;
        System.out.println("Ingrese numero del producto que desea quitar?");
        resp=leerEntero();
        for (int i = 0; i < 5; i++) {
            if (resp==(i+1)) {
                System.out.println("Cuantos productos desea llevar?");
                resp2=leerEntero();
                arregloProductos[0][i]=resp2;
                System.out.println("Su costo seria de $ "+total());
            }
        }
    }
    public int total() {
        int contador=0;
        int calculo=0;
        for (int i = 0; i < 5; i++) {
            calculo=calculo+arregloProductos[0][i]*arregloProductos[1][i];            
        }
        return calculo;
    }
   
    public int pago(){
        int efectivo, compra,tot;
        tot=total();
        System.out.println("Con cuanto efectivo cancelará?");
        efectivo=leerEntero();
        compra=cal.restar(efectivo, tot);
        if (compra<0) {
            System.out.println("El total de su pedido es de $"+ tot);
            return tot;
        }else{
            if(compra!=0){
            System.out.println("Su vuelto es de $"+compra);
            return compra;
            }else {
                System.out.println("Su compra fue de $"+ tot);
                return tot;
            }
        }
    
    }
    }
    

