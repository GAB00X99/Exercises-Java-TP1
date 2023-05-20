/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg13;

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
    /*13- Dado un conjunto de N números naturales, determinar:
a- Cuántos son mayores que 60.
b- Cuántos son menores que 20.
c- Cuántos están comprendidos entre 55 y 85, incluidos los extremos.*/
    Scanner Nums = new Scanner(System.in);
    int Nat,c=1,N,contMAY60=0,contMEN20=0,Cont5585=0;
    System.out.println("ingrese la cantidad de numeros ");
    N = Nums.nextInt();
 while(c<=N){
     System.out.println(+c+" ingrese un numero natural");
     Nat = Nums.nextInt();
     if(Nat>60){
         contMAY60++;
     }
     else if(Nat<20){
         contMEN20++;
     }
     else if((Nat>=55)&(Nat<=85)){
         Cont5585++;
     }
     c++;
 }
 System.out.println("mayores que 60 :"+contMAY60+" menores que 20 :"+contMEN20+" ,y comprendidos entre 55 y 85 son :"+Cont5585);
    }
    
}
