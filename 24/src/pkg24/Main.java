/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg24;

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
    /*24- Para calificar en una prueba atlética, un grupo de N competidores debe responder a las siguientes
marcas:
a- Hombres mayores o iguales a 35 años, deben registrar entre 40 y 60 minutos.
b- Mujeres mayores a 30 años, deben tener un tiempo entre 40 y 80 minutos.
Ingresar edad, sexo y tiempo alcanzado por atleta e imprimir como resultado si el mismo califica o
no.*/
Scanner Num = new Scanner(System.in);
Scanner Sex = new Scanner(System.in);
Scanner Nam = new Scanner(System.in);
Scanner Ed = new Scanner(System.in); 
Scanner Tim = new Scanner(System.in);
int MasCont=0,FemCont=0,C=1,N,Edad,Time,Sexo,masc=1,fem=0;
String Name,Mas,Fem;
System.out.println("ingrese la cantidad de atletas");
N = Num.nextInt();
while(C<=N){
System.out.println("ingrese sexo de el/la atleta");
Sexo = Sex.nextInt();
    System.out.println("ingrese nombre de el/la atleta "+C);
Name = Nam.nextLine();
System.out.println("ingrese edad de el/la atleta "+C);
Edad = Ed.nextInt();
System.out.println("ingrese tiempo de el/la atleta "+C);
Time = Tim.nextInt();   
if((Sexo==1)&(Edad>=35)&(Time>=40&Time<=60)){
    System.out.println("el atleta clasifica");
    MasCont++;
}
else if((Sexo==0)&(Edad>30)&(Time>=30&Time<=80)){
    System.out.println("la atleta clasifica");
    FemCont++;
}








C++;
}

    
    
    
    }
    
}
