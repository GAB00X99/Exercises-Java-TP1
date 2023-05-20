/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg35;

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
    /*35- Hubo 3 candidatos en una elección. Cada elector tenía los siguientes datos: sexo (1v 2m) y el
partido por el cual votó (1 a 3).
Hacer un diagrama que ingrese N electores y calcule:
a- La cantidad de mujeres que votaron.
b- La cantidad de varones que votaron al candidato 3.
c- Decir que candidato ganó la elección. Nota: considere que no hay empate.
d- Imprimir todos los resultados.*/
    Scanner Num = new Scanner(System.in);
    int Voto,N,A=1,B=2,C=3,i=1,M=1,F=0,Sex,Cont1=0,Cont0=0,ContA=0,ContB=0,ContC=0,ContC1=0;
    System.out.println("ingrese la cantidad de electores");
    N = Num.nextInt();
    while(i<=N){
        System.out.println("ingrese sexo del elector"+i+"\n1=masculino 0=femenino "+i);
        Sex = Num.nextInt();
        if(Sex==1){
            Cont1++;
        }
        else{
            Cont0++;
        }
        System.out.println(+i+" ingrese el partido que voto el elector\ncandidato1=1\ncandidato2=2\ncandidato3=3 ");
        Voto = Num.nextInt();
       switch(Voto){
           case 1:
               ContA++;
               break;
           case 2:
               ContB++;
               break;
           case 3:
               ContC++;
               break;
           default:
               break;
       } 
       if(Sex==1&Voto==3){
           ContC1++;
       }
        i++;
        
    }
    if(ContA>ContB&ContA>ContC){
        System.out.println("el ganador es el candidato 1");
    }
    else if(ContB>ContA&ContB>ContC){
        System.out.println("el ganador es el candidato 2");
    }
    else{
        System.out.println("el ganador es el candidato 3");
    }
    System.out.println("la cantidad de mujeres que votaron es "+Cont0);
    System.out.println("la cantidad de varones que votaron el candidato 3 son; "+ContC1);


    
    }
    
}
