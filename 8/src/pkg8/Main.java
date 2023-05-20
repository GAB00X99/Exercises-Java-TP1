/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg8;

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
    /*8- Dados 100 números, determinar la cantidad de positivos, negativos y nulos.*/
   Scanner Num = new Scanner(System.in);
   int c=1,N,cpos=0,cneg=0,cnul=0;
   while(c<=100){
        System.out.println(+c+" ingrese un numero");
        N = Num.nextInt();
        if(N>0){
            cpos++;
            }
        else if(N<0){
            cneg++;
        }
        else{
            cnul++;
        }
        c++;
      }
   System.out.println("la cantidad de numeros positivos es "+cpos);
   System.out.println("la cantidad de numeros negativos es "+cneg);
   System.out.println("la cantidad de numeros nulos es "+cnul);
   
   
   
  
   
   
    
    
    
    
    
    }
    
}
