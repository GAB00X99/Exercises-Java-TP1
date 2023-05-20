/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg25;

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
    /*25- Sumar los números del 1 al 100 no terminados en 5.*/
  int total=0,aux,sum=0,suma=5,num,c=1,cont=0;
  
  while(c<=100){
      aux=c%10;
    if((aux!=5)){
      suma+=aux;  
        
        
    }
    sum+=c;  
     c++; 
    total=sum-suma;  
      
  }
    System.out.println("el resultado es "+total);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
    
}
