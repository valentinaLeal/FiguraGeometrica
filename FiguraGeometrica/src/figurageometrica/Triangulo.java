/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurageometrica;

/**
 *
 * @author Estudiantes
 */
public class Triangulo extends FiguraGeometrica {

    int base;
    int altura;
    int hipotenusa;
    
    @Override
    float calcularArea() {
       
       int area;
       
       area= (base*altura)/2;
       
       return area;
        
    }

    @Override
    float calcularPerimetro() {
       
       int perimetro; 

       perimetro= base+altura+hipotenusa;
       
       return perimetro;
    }
    
    
}
