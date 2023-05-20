/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg33;

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
    /*33- Dado un número determinar si es primo.*/
    Scanner Num = new Scanner(System.in);
    int a=0,N,c,i;
    System.out.println("ingrese un numero");
    N = Num.nextInt();
    for(i=1; i<=N;i++){
        if(N%i==0){
            a++;
        }
    }
    if(a != 2){
        System.out.println("no es primo");
    }else{
        System.out.println("si es primo");
    }
    }
    
}
