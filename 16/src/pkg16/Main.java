/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg16;

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
    /*16- Ingresar el nombre y la edad de 100 personas. Según la edad, determinar si la persona se
encuentra en primaria, secundaria o en la universidad. Considerar de 6 a 12 años primaria, de 13 a
17 secundaria y mayores de 17 en la universidad.*/
    Scanner Num = new Scanner(System.in);
    Scanner Name = new Scanner(System.in);
    int c=1,N,Prim=0,Sec=0;
    String name;
while(c<=100){
     System.out.println(+c+" ingrese un nombre");
    name = Name.nextLine();
    System.out.println(+c+" ingrese la edad");
    N = Num.nextInt();
    
    if(N>=6&N<=12){
        Prim++;
    }
    else if(N>=17&N<=17){
        Sec++;
    }
  c++;
} 
System.out.println("en la primaria se encuentran "+Prim+" ,y en la secundaria "+Sec);
    
    
    
    
    
    
    }
    
}
