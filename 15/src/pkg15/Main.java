/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg15;

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
    /*15- Sumar 20 números. Inicializar la variable que lleva la cuenta en 20.*/
    int N,n=1,Sum=0,c=20;
    Scanner Num = new Scanner(System.in);
    while(c!=0){
        System.out.println(+n+" ingrese un numero");
        N = Num.nextInt();
        Sum+=N;
        c--;
        n++;
    }
    System.out.println("la suma de los 20 numeros es "+Sum);
    
    
    
    
    
    
    }
    
}
