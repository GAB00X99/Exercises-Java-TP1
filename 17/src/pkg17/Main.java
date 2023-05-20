/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg17;

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
    /*17- Ingresar nombre y cantidad existente de 10 productos. Si la cantidad existente de un producto es
menor que 100 (faltante), pedir que se ingresen los datos del proveedor de ese producto e
imprimirlos junto al nombre del producto que se encuentra faltante.*/
    Scanner P = new Scanner(System.in);
    Scanner C = new Scanner(System.in);
    int c=1,cant;
    String prod,prov;
    while(c<=10){
    System.out.println("ingrese el producto "+c);
    prod = P.nextLine();
    System.out.println("ingrese la cantidad existente del producto "+prod);
    cant = C.nextInt();
    if(cant<100){
        System.out.println("ingrese los datos del proveedor del producto");
        prov = P.nextLine();
        System.out.println("/nombre del proveedor "+prov+" /producto faltante: "+prod);
                
    }
    c++;
    }
    }
   
}
