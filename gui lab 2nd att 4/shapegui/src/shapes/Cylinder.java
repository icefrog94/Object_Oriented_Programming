/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package shapes;

/**
 *
 * @author 01603857
 */
public class Cylinder extends Circle{
    private double height;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

 
    public Cylinder(double height, double radius) {
        super(radius);
        this.height = height;
    }

   public double getVolume(){
    return Math.round( super.getArea() * height);
    }
    
    public double getLateralArea(){
    return Math.round(super.getPerimeter() * height);
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
