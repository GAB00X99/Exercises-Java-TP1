/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg38;

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
    /*38- Ingresar N números de 3 dígitos, imprimir cuántos números ingresados son capicúa.*/
    Scanner Num = new Scanner(System.in);
    int N,i=1,Numero,A=0,B=0,C=0,Aux1,Aux2,capi=0;
    System.out.println("ingrese la cantidad de numeros");
    N = Num.nextInt();
    while(i<=N){
    System.out.println(+i+" ingrese un numero de 3 digitos");
    Numero = Num.nextInt();
    A=Numero/100;
    B=(Numero-A*100)/10;
    C= Numero-A*100-B*10; 
    if(A==C){
        System.out.println("el numero es capicua");
        capi++;
    }
    else{
        System.out.println("el numero no es capicua");
     
    }
    i++;
    } 
    System.out.println("la cantidad de numeros capicua es "+capi);
   
    }
}
