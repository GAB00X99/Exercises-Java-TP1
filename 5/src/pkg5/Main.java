/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg5;

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
    Scanner N = new Scanner(System.in);
    int Lad;
    System.out.println("ingrese la cantidad de lados de un poligono");
    Lad = N.nextInt();
    switch(Lad){
        case 3:
            System.out.println("es un triangulo");
            break;
        case 4:
            System.out.println("es un cuadrilatero");
            break;
        case 5:
            System.out.println("es un pentagono");
        break; 
        
        default:
            System.out.println("no es ninguno de los 3");
            break;
        
            
    }
   
}
}