/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg7;

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
    /*Dados 100 números, realizar la suma de los positivos y de los negativos.*/
    int c = 1;
    int N,Pos=0,Neg=0;
    while(c<=100){
        Scanner Num= new Scanner(System.in);
        System.out.println(+c+" ingrese un numero");
        N = Num.nextInt();
        
        if(N>0){
         Pos+=N;      
         }
        else{
            Neg-=N;
        }
        c++;
       }
      System.out.println("la suma de los positivos es "+Pos);
    System.out.println("la suma de los negativos es -"+Neg);
    
    
    
    }
    
}
