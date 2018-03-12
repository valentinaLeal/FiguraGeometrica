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
public class Cuadrado extends FiguraGeometrica{

    int lado;
    @Override
    float calcularArea() {
      
      int area;
      
      area= lado*lado;
      return area;
    }

    @Override
    float calcularPerimetro() {
        
        int perimetro;
        
        perimetro= (lado*2)+(lado*2);
        
        return perimetro;
    }
    
    
}
