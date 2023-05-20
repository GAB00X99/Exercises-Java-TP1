/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg34;

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
    /*34- Dado un número determinar cuántas unidades, decenas y centenas tiene el mismo.*/
    Scanner Num = new Scanner(System.in);
    int N,C1,C2,C3;
    System.out.println("ingrese un numero");
    N = Num.nextInt();
   C1=N%1000/100; 
           C2=N%100/10;
           C3=N%10;
           System.out.println("Centena:"+C1+"\nDecena:"+C2+"\nUnidad"+C3);
  
    }
    
}
