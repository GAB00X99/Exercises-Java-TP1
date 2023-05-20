/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg39;

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
    /*39- Valorar el stock de un almacén. Para ello se deberá leer la siguiente información referida a cada
artículo:
a- Nombre del artículo.
b- Unidades en existencia.
c- Año de fabricación.
d- Precio unitario.
Se considera que los artículos fabricados con anterioridad a 2000 se devalúan en un 20%: Hacer
un programa que a partir de los datos ingresados determine el valor actual de cada artículo y el
valor total del stock del almacén.
La entrada de datos finaliza cuando se lee la palabra “FIN” en el nombre de artículo. Por final de
programa deberá imprimir el valor del stock actualizado.*/
  Scanner Num= new Scanner(System.in); 
  Scanner Art= new Scanner(System.in);  
  int N,i=1,Año,Uni,SumPrecio=0;
  double Precio;
  String Arti="";
    
    while(!Arti.equals("FIN")){
        System.out.println("ingrese nombre del articulo");
        Arti = Art.next();
        System.out.println(Arti);
        if(!Arti.equals("FIN")){
            System.out.println("ingrese unidades en existencias");
        Uni = Num.nextInt();
        System.out.println("ingrese año de fabricacion del articulo");
        Año = Num.nextInt();
        System.out.println("ingrese precio por unidad");
        Precio = Num.nextInt();
        if(Año<2000){
         Precio=Precio*0.8;     
        }
        SumPrecio+=Precio;  
        }
        

    }
    if(SumPrecio!=0){
     System.out.println("el precio total del almacen es "+SumPrecio);   
    }
    else{
     System.out.println("el almacen esta vacio");      
    }
   
    
    }
    
}
        