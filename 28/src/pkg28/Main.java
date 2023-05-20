/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg28;

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
   /*28- Ingresar 30 números, imprimir solo aquellos que sean el doble del leído anteriormente. Ej: para los
siguientes números: 25, 5, 6, 12, 24, 4, 8 deberá imprimir 12, 24, 8.*/
  Scanner Num = new Scanner(System.in);
  int Mul,c=1,Aux,Aux2,N=0;
  Aux=N;
    while(c<=30){
 System.out.println(+c+" ingrese un numero");
 N = Num.nextInt();
 Aux2=N/2;
 if(Aux2==Aux){
     System.out.println("el numero ingresado "+N+" es el doble del anterior");
 }
 c++;
 Aux = N;
    }
    }
    
}
