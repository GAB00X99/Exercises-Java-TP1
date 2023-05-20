/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg29;

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
    /*29- Ingresar N pares de números, imprimir el mayor de cada par.*/
    Scanner Num = new Scanner(System.in);
    int c=1,N,A,B;
    System.out.println("ingrese la cantidad de pares");
    N = Num.nextInt();
    while(c<=N){
        System.out.println("ingrese dos numeros");
        A = Num.nextInt();
        B = Num.nextInt();
        if(A>B){
            System.out.println(A);
        }
        else if(B>A){
            System.out.println(B);
        }
        c++;
    }
    
    
    
    
    
    
    
    
    
    
    }
    
}
