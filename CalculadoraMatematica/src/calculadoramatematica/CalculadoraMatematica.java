/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadoramatematica;
import java.util.Scanner;
/**
 *
 * @author adoni
 */
public class CalculadoraMatematica {

    /**
     * @param args the command line arguments
     */
    
    private double numero1;
    private double numero2;
    
    public CalculadoraMatematica (){
      this.numero1 = 0;
      this.numero2 = 0;
    }
    
    public void establecerNumeros(double num1, double num2){
       this.numero1 = num1;
       this.numero2 = num2;
    }
    
    public double sumar(){
      return numero1 + numero2;
    }
    
    public double resta(){
      return numero1 - numero2;
    }
    
    public double multiplicacion(){
      return numero1 * numero2;
    }
    
    public double division(){
      if(numero2 == 0){
        throw new ArithmeticException("Error: division por cero no es valida");
      }
      return numero1 / numero2;
    }
    
}
