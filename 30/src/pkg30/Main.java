/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg30;

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
    /*30- Se ingresan 100 números, obtener la suma de los múltiplos de 3.*/
   Scanner Num = new Scanner(System.in);
   int i=1,N,Aux,Sum3=0;
   while(i<=100){
       System.out.println(+i+" ingrese un numero");
       N = Num.nextInt();
       Aux = N%3;
       if(Aux==0){
           Sum3+=N;
       }
   i++;
   }
   System.out.println("la suma de los multiplos de 3 es "+Sum3);
    
    
    
    
    
    
    
    
    
    }
    
}
