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
public class Circle extends Shapes{
  private double radius; 

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    
    public double getArea() {
        return Math.PI * radius * radius;
    }

    
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
    
    @Override
     public String toString(){
      return "<html><pre>"
             +    "Area          : " + getArea()  + 
              "<br>Circumference : " + getPerimeter()    + 
              "</pre></html>" ;
    }
}
