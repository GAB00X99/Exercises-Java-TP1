/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg14.pkg1;

import java.util.Scanner;

/**
 *
 * @author GAB00X
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     /*14- Se conocen dos números A y B de cuatro dígitos cada uno. Imprimir un número C que está
formado por los dos primeros dígitos de A y los últimos dígitos de B.
Ejemplo: A = 1234 B=5678 -> C=1278*/
Scanner Num = new Scanner(System.in);

System.out.println("ingrese 2 nuemros");
  int Num1 = Num.nextInt();
  int Num2 = Num.nextInt();
  if(Num1<0){
      Num1=Num1*-1;
  }
  if(Num2<0){
      Num2=Num2*-1;
  }
  int Aux1=Num1/100;
  int Aux2=Num2%100;
  int Res= Aux1*100+Aux2;
  System.out.println("el resultado es "+Res);
    }
}
