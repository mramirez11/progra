
package la.calculador.v02;


public class carro {
    //Atributo
    int arregloProductos[][]= new int[2][5]; 
    
    
    //metodos
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
    
    public int total() {
        int contador=0;
        int calculo=0;
        for (int i = 0; i < 5; i++) {
            calculo=calculo+arregloProductos[0][i]*arregloProductos[1][i];            
        }
        return calculo;
    }
    
}
