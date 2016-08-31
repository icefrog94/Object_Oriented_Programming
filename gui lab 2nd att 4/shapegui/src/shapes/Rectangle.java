/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package shapes;


public class Rectangle extends Shapes {

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
   private double length, width;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    
    @Override
    public double getArea() {
        return Math.round( length * width);
       
    }

    @Override
    public double getPerimeter() {
        return Math.round((length + width) * 2);
       }
    
    public String toString(){
      return "<html><pre>"
             +    "Area      : " + getArea()  + 
              "<br>Perimeter : " + getPerimeter()    + 
              "</pre></html>" ;
    }
}
