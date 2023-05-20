/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg14;

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
    /*14- Se conocen dos números A y B de cuatro dígitos cada uno. Imprimir un número C que está
formado por los dos primeros dígitos de A y los últimos dígitos de B.
Ejemplo: A = 1234 B=5678 -> C=1278*/
    Scanner Nums = new Scanner(System.in);
    int A,B,Aux1,Aux2,Aux3,Aux5,Aux6,Aux7,primer;
    int Ult,C;
    System.out.println("ingrese un numero A y B");
    A = Nums.nextInt();
 
    B = Nums.nextInt();
    if((A>=1000 & A<=9999)&(B>=1000 & B <=9999)){
        Aux1 = A/1000;
        Aux2 = A-Aux1*1000;/*000*/
        Aux3 = Aux2/100;
        primer = (Aux1*10+Aux3)*100;/*funciona*/ 
        Aux5 = B/1000;
        Aux6 = B-Aux5*1000;/*000*/
        Aux7 = Aux6/100;
        Ult = Aux6-Aux7*100;/*00*/ 
        C = primer+Ult;
        System.out.println("el numero formado por A y por B es "+C);
    }
    
    
    
    
    }
    
}
