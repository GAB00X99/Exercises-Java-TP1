/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg41;

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
    /*41- Se lee la siguiente información: Sexo, Estado Civil y Edad en donde: Sexo será 1= varón y 2 =
mujer; Estado Civil será 1 = soltero, 2 = separado, 3 = casado y 4 = viudo. Se pide:
a- Contar la cantidad de hombres casados mayores a 28 años.
b- Contar la cantidad de mujeres solteras menores a 25 años.
c- Calcular el promedio de edad de los hombres casados.
d- Contar cuantos hombres y mujeres se ingresaron.
e- Contar la cantidad de hombres viudos.
f- Contar la cantidad de hombres y mujeres separados.
El final de la lectura viene indicado por un 5 en campo sexo.*/
    Scanner Num = new Scanner(System.in);
    
    int Edad,Sexo=0,Var=1,Muj=2,Ecivil,SOL=1,SEP=2,CAS=3,VIU=4,CantHCasMay28=0,CantMSolMen25=0,SumEdadHCas=0,CantHom=0,CantMuj=0,CantHViu=0,CantHSep=0,CantMSep=0;
 float PromEdadHCas=0;
     
 
 
              
        
    while(Sexo!=5){
       
        System.out.println("ingrese Sexo \nVaron=1\nMujer=2");
        Sexo = Num.nextInt();
        if(Sexo==1||Sexo==2){
         System.out.println("ingrese Estado Civil\nSoltero=1\nSeparado=2\nCasado=3\nViudo=4");
        Ecivil = Num.nextInt();
        System.out.println("ingrese Edad");
        Edad = Num.nextInt();
        if(Sexo==Var){
            if(Ecivil==CAS){
                if(Edad>28){
                CantHCasMay28++;
                SumEdadHCas+=Edad;
            }
            }
            else if(Ecivil==VIU){
                CantHViu++;
            }
            else if(Ecivil==SEP){
                CantHSep++;
            }
            CantHom++;
        }
        else if(Sexo==Muj){
            if(Ecivil==SOL){
             if(Edad<25){
                 CantMSolMen25++;   
             }
            }
            else if(Ecivil==SEP){
                CantMSep++;
            }
            CantMuj++;
        }   
        }
        
        
        
         
      

    }
    if(CantHCasMay28!=0){
     PromEdadHCas=SumEdadHCas/CantHCasMay28;      
     System.out.println("el promedio de la edad de los hombres casados es: "+PromEdadHCas);
    }
     
    System.out.println("la cantidad de hombres casados mayores a 28 años es: "+CantHCasMay28);
    System.out.println("la cantidad de mujeres solteras menores a 25 años es: "+CantMSolMen25);
    System.out.println("Cantidad de hombres: "+CantHom+"\nCantidad de mujeres: "+CantMuj);
    
    System.out.println("Cantidad de hombres viudos: "+CantHViu);
    System.out.println("cantidad de hombres separados: "+CantHSep+"\ncantidad de mujeres separadas"+CantMSep);
    }
    
}
