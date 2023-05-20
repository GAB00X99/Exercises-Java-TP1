/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg4;

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
    /*4- Dados dos números A y B imprimir el mayor de ellos.*/
    Scanner NumA = new Scanner(System.in);
    Scanner NumB = new Scanner(System.in);
    int Num1, Num2;
    System.out.println("ingrese el valor de A");
  Num1 = NumA.nextInt();
  System.out.println("ingrese el valor de B");
  Num2 = NumB.nextInt();
  if((Num1 > Num2)&(Num1!=Num2)){
    System.out.println("A es mayor que B"); 
  
  }else{
      System.out.println("B es mayor que A"); 
  }
        
    }
    
    }
    

