/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package la.calculador.v02;

import java.util.Scanner;

/**
 *
 * @author Misael
 */
class Calculadora {
    int num1=1;
    int num2=2;
      public int sumar(){
        int resultado=num1+num2;
        return resultado;
    }
      public int restar( int num1, int num2){
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
