/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg18;

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
   /*18- Dados dos números A y B multiplicarlos sin usar la multiplicación.*/
   Scanner multi = new Scanner(System.in);
   int A,B,c=1,Mult=0;
   System.out.println("ingrese un numero A y un numero B");
   A = multi.nextInt();
   B = multi.nextInt();
   if(A<0){
       A=A*-1;
   }
   else if(B<0){
       B=B*-1;
   }
   while(c<=A){
       Mult+=B;
       c++;
   }
   System.out.println("el resultado de la multiplicacion "+Mult); 
    }   
}
