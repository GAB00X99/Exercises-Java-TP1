/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg42;

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
   /*42- Ingresar números e imprimir aquellos que sean igual a la mitad más 1 del leído anteriormente. El
proceso finaliza al ingresar el número 999.
Ejemplo: dada la serie 2, 3, 15, 8, 5, 10, 6, 9999. Deberá Imprimir: 5, 6…*/
    Scanner Num = new Scanner(System.in);
    int N=0,Ant=0;
    while(N!=9999){
         double Aux1=(Ant/2)+1;
        System.out.println("ingrese un numero");
        N = Num.nextInt();
        Ant=N;
        if(N==Aux1){
            System.out.println(+N+" es igual a la mitad mas 1 del numero leido anteriormente, que es: "+Aux1);
        }  
    }    
    }
}
