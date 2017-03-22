package ejercicio1;

import java.util.Scanner;


public class Calculadora {
    int num1=1;
    int num2=2;
      public int sumar(){
        int resultado=num1+num2;
        return resultado;
    }
      public int restar(){
        int resultado=num1-num2;
        return resultado;
    }
      public int multiplicar(){
        int resultado=num1*num2;
        return resultado;
    }
      public int dividir(){
        int resultado=num1/num2;
        return resultado;
    }
      public int leer(){
          Scanner leer= new Scanner(System.in);
          int lectura=leer.nextInt();
          return lectura;
          
      }
     
      
}
