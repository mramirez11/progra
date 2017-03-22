
package ejercicio1;



public class testCalculadora {

   
    public static void main(String[] args) {
        int numero1, numero2;
       Calculadora cal =new Calculadora();
        System.out.println("Ingrese el 1er numero");
       numero1=cal.leer();
       System.out.println("Ingrese el 2do numero");
       numero2=cal.leer();
              
        System.out.println(cal.sumar());
        System.out.println(cal.restar());
        System.out.println(cal.multiplicar());
        System.out.println(cal.dividir());
       
       
        
        
    }

}

