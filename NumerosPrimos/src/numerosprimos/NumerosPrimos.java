/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numerosprimos;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class NumerosPrimos {
        //Devuelve true si es primo, falso en caso contrario
       public static boolean CompruebaPrimo(int num) {
         boolean primo = true  ;
           for (int i=2;i<num;i++){
               if ((num % i)==0){
                   primo=false;
                   i=num+1;
               }
           }
         
           return primo;
       }
       
       public static int SiguientePrimo(int num){
         int primo=0;
         boolean bandera=true;
         
         for (int i =(num+1); bandera==true; i++){
             if (CompruebaPrimo(i)){
               bandera=false;
               primo=i;
             }
         }
         return primo;
       }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num=0;
        System.out.println("Introduce el numero");
        num= leer.nextInt();
        
        
        System.out.println(CompruebaPrimo(num));
        System.out.println(SiguientePrimo(num));
        // TODO code application logic here
    }
    
    
    

}
