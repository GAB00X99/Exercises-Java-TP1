/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg27;

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
    /*27- Se ingresan N cuartetos de números de un dígito A, B, C y D. Deberá generar el entero positivo
resultante de la unión de esos 4 dígitos. Ejemplo: A=1; B=2; C=6; D=5. Nº resultante: 1265.*/
    Scanner Num = new Scanner(System.in);
    int i=1,A,B,C,D,N,Sum=0,Asum,Bsum,Csum;
    System.out.println("ingrese la cantidad de cuartetos");
    N = Num.nextInt();
    while(i<=N){
      System.out.println("ingrese A");
      A = Num.nextInt();
      System.out.println("ingrese B");
      B = Num.nextInt();
      System.out.println("ingrese C");
      C = Num.nextInt();
      System.out.println("ingrese D");
      D = Num.nextInt();
      Asum = A*1000;
      Bsum = B*100;
      Csum = C*10;
      Sum = Asum+Bsum+Csum+D;
      
    i++;
    System.out.println("el numero formado es: "+Sum);
    }
   
    
    
    
    
    }
     
}
