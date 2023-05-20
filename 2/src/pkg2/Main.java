/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2;

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
    /*2- Determinar e imprimir el anterior y el siguiente de un número.*/
    Scanner Num = new Scanner(System.in);
    int N,Sig,Ant;
    System.out.println("ingrese un numero entero ");
    N = Num.nextInt();
    Ant = N--;
    Sig = N++;
    System.out.println("el anterior a "+N+" es "+Ant);
    System.out.println("el siguiente a "+N+" es "+Sig);
    
    }
    
}
