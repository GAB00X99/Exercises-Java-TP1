/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg22;

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
   /*22- Ingresar el nombre y la edad de 50 alumnos de un curso. Determinar e imprimir:
a- El nombre del alumno que encuentre con mayor edad.
b- El nombre del alumno que encuentre con menor edad.
c- Cantidad de alumnos menores que 12.
d- Cantidad de alumnos entre 10 y 16.
e- El promedio de las edades.*/
    Scanner Num = new Scanner(System.in);
     Scanner Nom = new Scanner(System.in);
    int c=1,Edad=0,cont12=0,cont1016=0,sum=0,May,Men;
    Men = Edad;
    May=Edad;
    String name;
    float prom;
    while(c<=100){
        System.out.println("ingrese el nombre y una edad");
        name = Num.nextLine();
        Edad = Nom.nextInt();
       if(May < Edad){
           May = Edad;
       }
       else if(Men < Edad){
           Men =  Edad;
       }
        
        if(Edad<12){
            cont12++;
        }
        else if(Edad<=10 & Edad>=16){
            cont1016++;
        }
        sum+=Edad;
        c++;
    }
    prom = sum/100;
  System.out.println("el alumnno con mayor edad es "+May+" y con la menor edad es "+Men);
  System.out.println("la cantidad de alumnos menores es "+cont12);
  System.out.println("la cantidad de alumnos entre 10 y 16 años es "+cont1016);
  System.out.println("el promedio de las edades de los alumnos es "+prom);
  
    
    
  
    }
    
}
