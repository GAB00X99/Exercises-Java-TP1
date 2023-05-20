/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg37;

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
    /*37- Ingrese N números de 8 dígitos cada uno, donde los dos primeros representan el día, los dos
siguientes el mes y los cuatro últimos el año.
Verifique e imprima si la fecha es válida o no. Se considera válida si cumple con las siguientes
condiciones:
Los meses de 31 días son el 1, 3, 5, 7, 8, 10 y 12.
Los meses de 30 días son el 4, 6, 9, 11 y que febrero tendrá 28 días salvo los años bisiestos en los
cuales tendrá 29 días. Un año es bisiesto si es múltiplo de 4 y no de 100, salvo que los múltiplos de
100 sean múltiplos de 400.*/
    Scanner Num = new Scanner(System.in);
    int Año=0,N,i=1,N8,Dia=0,Mes=0,Aux1,bis1=0,bis2=0,bis3=0;
    System.out.println("ingrese la cantidad de numeros de 8 digitos");
    N = Num.nextInt();
    while(i<=N){
        System.out.println("ingrese un numero de 8 digitos");
        N8 = Num.nextInt();
        Dia = N8 / 1000000;
        Aux1 = N8-Dia*1000000;
        Mes =  Aux1/10000;
        Año = N8-(Dia*1000000)-(Mes*10000);
        
        if(Mes<=31){
            bis1=Año%4;
            bis2=Año%100;
            bis3=Año%400;
          
          switch(Mes){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if(Dia<=31){
                    System.out.println("el mes es valido");
                }
                else{
                    System.out.println("el mes es invalido");   
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if(Dia<=30){
                    System.out.println("el mes es valido");
                }
                else{
                    System.out.println("el mes es invalido");
                }
                break;
            case 2:
             if((bis1==0&bis2!=0)||(bis2==0&bis3==0)){
                     if(Dia<=29){
                         System.out.println("el mes es valido y es año biciesto");
                     }   
                    }
             else if(Dia<=28){
             System.out.println("el mes es valido, no es año biciesto");
              
        }
             else{
                 System.out.println("el mes es invalido");
             }
        break;
            default:
                break;
        }
    
        
              
       i++;
    }
   System.out.println(Dia+" "+Mes+" "+Año);
    System.out.println(bis1+" "+bis2+" "+bis3);
  
    }
    }
}