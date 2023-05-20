/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg11;

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
        /*11- Dados 100 números, realizar la suma de los números pares e impares. Imprimir sumas.*/
        Scanner num = new Scanner(System.in);
        int c=1,N,SumI=0,SumP=0,aux1,aux2=0;
        while(c<=5){
            System.out.println(+c+" ingrese un numero");
            N = num.nextInt();
            aux1 = N%2;
            if(aux1==0){
              SumP+=N;    
            }
            else{
                SumI+=N;
            } 
            c++;
        }
    System.out.println("la suma de los pares es "+SumP+" y de los impares es "+SumI);  
    
    
    
    }
    
}
