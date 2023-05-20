/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg32;

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
    /*32- Calcular el factorial de un número N.*/
    Scanner Num = new Scanner(System.in);
    int i=1,N,Aux=1;
    System.out.println("ingrese un numero para sacar factorial");
    N = Num.nextInt();
    while(N!=0){
        Aux*=N;
         N--;
    }
    System.out.println("el resultado del factorial es "+Aux);
    }
}
