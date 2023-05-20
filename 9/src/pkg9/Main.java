/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg9;

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
    /*9- Dados 15 números, imprimir el promedio.*/
   
    Scanner Num = new Scanner(System.in);
    int N,c=1,sum=0;
    double prom;
while(c<=15){
        System.out.println(+c+" ingrese el numero");
        N = Num.nextInt();
        sum+=N;
        c++;
}
prom = sum/15;
System.out.println("el promedio de los 15 numeros es "+prom);
      }
    
}
