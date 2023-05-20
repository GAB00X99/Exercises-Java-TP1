/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg26;

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
    /*26- Se ingresan ternas de valores que corresponden a los nombres, edad y sueldo de los empleados
de una empresa. Se pide imprimir:
a- El nombre de aquellos empleados que cumplan con la condición de que la edad sea mayor a
25 años y el sueldo mayor a $3000.
b- La cantidad de empleados menores a 18 años.
c- La cantidad de empleados que se ingresaron y la suma de los sueldos.
El final de lista viene dado por nombre =””.*/
    Scanner Nam = new Scanner(System.in);
    Scanner Ed = new Scanner(System.in);
    Scanner Suel = new Scanner(System.in);
    Scanner Num = new Scanner(System.in);
    int c=1,N,edad,sueldo,cont18=0,sumSuel=0;
    String name;
    System.out.println("ingrese la cantidad de empleados");
    N = Num.nextInt();
    while(c<=N){
        System.out.println("ingrese nombre");
    name = Nam.nextLine();
    System.out.println("ingrese edad");
    edad = Ed.nextInt();
    System.out.println("ingrese sueldo");
    sueldo = Suel.nextInt();
    if((edad>25)&(sueldo>3000)){
        System.out.println("mayor a 25 años y el sueldo mayor a $3000: "+name);
    }
    else if(edad<18){
        cont18++;
    }
   
    sumSuel+=sueldo;
    c++;
    }
        System.out.println("la suma de los sueldos es "+sumSuel+" ,y la cantidad de empleados es "+N);
        System.out.println("la cantidad de empleados menores a 18 es "+cont18);
        
        
        
        
        
        
        
    }
    
}
