/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadoramatematica;

import java.util.Scanner;


/**
 *
 * @author adoni
 */
public class Prueba {
    
        public static void main(String[] args) {
        
        CalculadoraMatematica calculadora = new CalculadoraMatematica();
        int option = 0; 
        Scanner scanner = new Scanner(System.in);
        
        do{
          System.out.println("=================Operaciones=================");
          System.out.println("                 1.valores                     ");
          System.out.println("                 2.sumar                     ");
          System.out.println("                 3.resta                     ");         
          System.out.println("                 4.multiplicacion            ");
          System.out.println("                 5.division                  ");
          System.out.println("                 6.salir                     ");
          System.out.println("==============================================");
          option = scanner.nextInt();
          
          switch(option){
           case 1 :
             System.out.println("ingrese el primer valor");
             double num1 = scanner.nextDouble();
           
             System.out.println("ingrese el primer valor");
             double num2 = scanner.nextDouble();
             calculadora.establecerNumeros(num1,num2);
         break;
         
         case 2 : 
             System.out.println("La suma es: " + calculadora.sumar());
         break;
         
         case 3 : 
             System.out.println("La resta es: " + calculadora.resta());
         break;
         
         case 4 : 
             System.out.println("La Multiplicacion es: " + calculadora.multiplicacion());
         break;
         
         case 5 : 
           try {
               
             System.out.println("La Dvision es: " + calculadora.division());
             
           } catch(Exception e) {
              System.out.println(e.getMessage());
           }
         break;
         
         case 6 : 
            System.out.println("Saliendo del sistema...");
            option = 0;
         break;
         
         default :
            System.out.println("opcion invalida Reintenta nuevamente");
         break;
        }
       
        }while(option != 0);
        
        scanner.close();
    }
    
    
}
