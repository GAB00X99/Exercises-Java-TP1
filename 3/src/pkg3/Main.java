/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg3;

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
    /*3- Leer dos números, almacenarlos en las variables X y Y respectivamente. Intercambiar el contenido
de las variables de manera que el valor contenido en X pase a Y, y el valor contenido en Y pase a
X.*/
    Scanner NumX = new Scanner(System.in);
    Scanner NumY = new Scanner(System.in);
    int Num1, Num2, Aux;
    System.out.println("ingrese el valor de X");
  Num1 = NumX.nextInt();
  System.out.println("ingrese el valor de Y");
  Num2 = NumY.nextInt();
  
  Aux = Num2;
  Num2 = Num1;
  Num1 = Aux; 
  System.out.println("El Valor de X es "+Num1+" y Y es "+Num2);
  
  
  
  
    
    
    
    
    
    
    
    
    
    }
    
}
