/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg31;

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
    /*31- Se ingresan 150 valores, calcular el promedio de los múltiplos de 3 y no de 5.*/
    Scanner Num = new Scanner(System.in);
    int c3=0,N,c=1,Aux3,Aux5,Sum35=0,Sum3=0,SumFIN=0;
    while(c<=5){
        System.out.println(+c+" ingrese un numero");
        N = Num.nextInt();
        Aux3 = N%3;
        Aux5 = N%5;
        if((Aux3==0)&(Aux5==0)){
            Sum35+=N;
        }
        else if(Aux3==0){
            Sum3+=N;
        }
        c++;
    }
    SumFIN = Sum3-Sum35; 
    float Prom = Sum3/5;
   System.out.println("el promedio de los multiplos de 3 y no de 5 es "+Prom);
    
    
    
    
    
    
    
    }
    
}
