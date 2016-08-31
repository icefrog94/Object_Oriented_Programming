/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package shapes;

public class TrianglePrism extends Triangle {
    private double height;

    public TrianglePrism(double side1, double side2, double side3, double height) {
        super(side1, side2, side3);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
    public double getVolume(){
    return Math.round( super.getArea() * height);
    }
    
    public double getLateralArea(){
    return Math.round( super.getPerimeter() * height);
    }
    
    public double getSurfaceArea(){
    return Math.round(super.getPerimeter() * height) + (2 * super.getArea());
    }
    
    public String toString(){
      return "<html><pre>"
             +    
                  "Volume        : " + getVolume()  + 
              "<br>Lateral Area  : " + getLateralArea()    + 
              "<br>Surface Area  : " + getSurfaceArea()  +                
              "</pre></html>" ;
    }
}
