/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg36;

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
   /*36- Leer un grupo de números. Considere que se desconoce la cantidad de valores que componen el
grupo pero que el último número a ser ingresado será un cero. Realice un diagrama que indique al
final, si se presenta el número 178 dentro de la serie o si está ausente.*/
    Scanner Num = new Scanner(System.in);
    int N=1,i=1,cont178=0;
    System.out.println("ingrese la cantidad de numeros que desee");
    while(N!=0){
        System.out.println(+i+" ingrese un numero");
      N = Num.nextInt();
      if(N==178){
          cont178++;
      }
    i++;
    }
  if(cont178!=0){
      System.out.println("el numero 178 se encuentra en la serie");
  }  else{
      System.out.println("el numero 178 no se encuentra en la serie");
  }
  
    }
    
}
