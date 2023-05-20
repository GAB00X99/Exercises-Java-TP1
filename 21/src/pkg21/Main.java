/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg21;

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
   /*21- Dados 100 números determinar cuál es el mayor y el menor de ellos.*/
    Scanner Num = new Scanner(System.in);
    int c=1,N=0;
    int May,Men=N;
    May = N;
   while(c<=10){
        System.out.println(+c+" ingrese un numero");
    N = Num.nextInt();
    if(May<N){
        May = N;
    }
    if(N<=Men){
        Men=N;
    }
   c++;
   }
    System.out.println("la mayor edad es "+May+" y la menor es "+Men); 
    }  
    }
    

