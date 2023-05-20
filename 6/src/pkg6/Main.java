/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg6;

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
    /*6- Dados tres números A, B y C imprimir el mayor de ellos.*/
    int A,B,C;
    Scanner Num1= new Scanner(System.in);
    Scanner Num2= new Scanner(System.in);
    Scanner Num3= new Scanner(System.in);
    System.out.println("ingrese el valor de A");
    A = Num1.nextInt();
    System.out.println("ingrese el valor de B");
    B = Num2.nextInt();
    System.out.println("ingrese el valor de C");
    C = Num3.nextInt();
    if((A>B)&(A>C)){
        System.out.println("A es el mayor");
        }
    else if((B>A)&(B>C)){
        System.out.println("B es el mayor");
    }
    else if((C>A)&(C>B)){
    System.out.println("C es el mayor");
    }
    else{
System.out.println("son todos iguales o hay dos iguales mayores");        
    }
    }
    
}
