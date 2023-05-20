/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg23;

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
    /*23- Generar la serie de Fibonacci hasta el número 100. Imprimir:
a- Términos generados.
b- Cantidad de términos pares.
c- La palabra “Si”, si el término 50 pertenece a la serie.*/
    Scanner Num = new Scanner(System.in);
 int A=0,B=1,Suc,N,cv=1;
 
 System.out.println("ingrese un numero del cual quiere hacer la sucesion de fibonacci");
 N = Num.nextInt();
 while(cv<=N){
     System.out.println(A);
     Suc=A+B;
     A=B;
     B=Suc;

cv++;
 }
}
}