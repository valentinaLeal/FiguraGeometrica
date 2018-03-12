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
public class Rectangulo extends FiguraGeometrica {

    int base; 
    int altura;
    
    @Override
    float calcularArea() {
        int area;
        
        area = (int) (base*altura);
        
        return area;
    }

    @Override
    float calcularPerimetro() {
         
        int perimetro;
        
        perimetro = (base*2)+(altura*2);
        
        return perimetro;
    }
    
    
    
}
