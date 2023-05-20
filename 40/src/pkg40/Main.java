/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg40;

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
    /*40- Se ingresan N pares de números en las variables CAT e IMP. Donde CAT corresponde a una
categoría de cliente cuyo valor puede ser 1, 2, 3 o 4; IMP corresponde al importe de una factura.
Desarrolle un algoritmo que:
a- Calcule el total general de importe de facturas.
b- Calcule el total de importe por categorías.
c- Determine el mayor de los importes y a qué categorías de cliente corresponde (considerando
que no hay importes repetidos).
d- Imprima todos los resultados.*/
    Scanner Num = new Scanner(System.in);
    int IMPTOTAL=0,N,CAT,IMP=0,i=1,CAT1=0,CAT2=0,CAT3=0,CAT4=0,IMP1=0,IMP2=0,IMP3=0,IMP4=0,MAY=0,CATMAY=0;
    System.out.println("ingrese la N cantidad de pares de numeros");
    N = Num.nextInt();
    MAY=IMP;
    
    while(i<=N){
        System.out.println(+i+" ingrese una categoria");
        CAT = Num.nextInt();
        System.out.println(+i+" ingrese un importe");
        IMP = Num.nextInt();
        if(IMP>=MAY){
            MAY=IMP;
            CATMAY=CAT;
        }
        IMPTOTAL+=IMP;
        if(CAT<=4){
         switch(CAT){
            case 1:
                CAT1++;
                IMP1+=IMP;
                break;
            case 2:
                CAT2++;
                 IMP2+=IMP;
                break;
            case 3:
                CAT3++;
                 IMP3+=IMP;
                break;
            case 4:
                CAT4++;
                 IMP4+=IMP;
                break;

        }   
        }
       
             i++;
     
    }
     System.out.println("total general de importe de facturas: "+IMPTOTAL);
        System.out.println("total de importe por categorías:"+"\nCategoria 1: "+IMP1+"\nCategoria 2: "+"\nCategoria 3: "+IMP3+"\nCategoria 4: "+IMP4);
        System.out.println("el mayor importe es de "+MAY+" y pertenece a la categoria "+CATMAY);
    
    
    
    
    
    
    
    
    
    
    
    }
    
}
