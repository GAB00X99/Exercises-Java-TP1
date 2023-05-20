/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg10;

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
    /*10- Dados 75 números, imprimir los números negativos, el promedio de los positivos y la cantidad de
nulos.*/
    int c=1,N,PosiProm,CantP=0,SumP=0,Cnul=0;
    Scanner Num = new Scanner(System.in);
    while(c<75){
        System.out.println(+c+" ingrese un numero");
        N = Num.nextInt();
        if(N>0){
            SumP+=N;
           CantP++;
        }
        
        else if(N==0){
            Cnul++;
           }
        else if(N<0){
            System.out.println(+N+" es negativo");
            
        }
        c++;
    }
    PosiProm=SumP/CantP;
    System.out.println("el promedio de los numeros positivos es "+PosiProm+" ,la cantidad de numeros nulos es "+Cnul);
    
    
    
    
    
    
    }
    
}
