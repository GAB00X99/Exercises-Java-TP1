/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg43;

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
    /*43- Se leen 100 números, cada uno de los cuales consta de 4 dígitos. Se pide:
a- Contar la cantidad de números cuyo último digito es 0 (cero).
b- Contar la cantidad de números cuyo último digito es 5 (cinco).
c- Si el número leído no termina en 5 ni 0, descomponerlo en dos partes e imprimirlas.
d- Imprimir la cantidad de números que terminan en cincos y en ceros.*/
    Scanner Num = new Scanner(System.in);
    int i=1,N,ContC40=0,ContC45=0,CC1,CC2;
  int C1=0,C2=0,C3=0,C4=0;
    while(i<=100){
        System.out.println(+i+" ingrese un numero de 4 digitos");
        N = Num.nextInt();
        if(N>=1000&N<=9999){
           C1=N%10000/1000;
           C2=N%1000/100; 
           C3=N%100/10;
           C4=N%10;
           if(C4==0){
               ContC40++;
           }
           else if(C4==5){
               ContC45++;
           }
           else{
               CC1=N/100;
               CC2=N%100;
               System.out.println("**************************************************\nel numero "+N+" no termina en 5 ni 0,\ndescompuesto en dos partes es :"+CC1+" "+CC2);   
               
           }             
           
            }
        i++;
        }
        System.out.println("cantidad de numeros cuyo ultimo digito termina en 5: "+ContC45+"\ncantidad de numeros cuyo ultimo digito no termina en 0: "+ContC40);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    }
    

