/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurageometrica;

import java.util.Scanner;

/**
 *
 * @author Estudiantes
 */
public class Principal {

   
    public static void main(String[] args) {
       
        Rectangulo miRectangulo=new Rectangulo ();
        Triangulo miTriangulo =new Triangulo ();
        Cuadrado miCuadrado =new Cuadrado ();
        Scanner miEscaner=new Scanner(System.in);
        
        System.out.println("Para calcular el area del rectangulo digite los siguentes datos:");
        
        System.out.println("Digite la altura del rectangulo:");
        miRectangulo.altura=miEscaner.nextInt();
        System.out.println("Digite la base del rectangulo:");
        miRectangulo.base=miEscaner.nextInt();
        System.out.println("El resultado es:");
        float resultado=miRectangulo.calcularArea();
        System.out.println(resultado);
        
        
        System.out.println("Para calcular el area del Triangulo digite los siguentes datos:");
        
        System.out.println("Digite la altura del triangulo:");
        miTriangulo.altura=miEscaner.nextInt();
        System.out.println("Digite la base del triangulo:");
        miTriangulo.base=miEscaner.nextInt();
        System.out.println("El resultado es:");
        float resultado2=miTriangulo.calcularArea();
        System.out.println(resultado2);
        
        
        System.out.println("Para calcular el area del Cuadrado digite los siguentes datos:");
        
        System.out.println("Digite el lado del cuadrado:");
        miCuadrado.lado=miEscaner.nextInt();
        
        System.out.println("El resultado es:");
        float resultado3=miCuadrado.calcularArea();
        System.out.println(resultado3);
        
         }
    
    
}
