/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;

/**
 *
 * @author waiyankaung
 */
public class triangle extends shapes {
     private double side1, side2, side3;

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }
    

    public triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
   
    
    @Override
    public double getArea() {
         double s = (side1 + side2 + side3)/2;
        return Math.round( Math.sqrt(s * (s - side1) * (s-side2) * (s-side3)));
    }

    @Override
    public double getPerimeter() {
         double s = (side1 + side2 + side3)/2;
        return Math.round(s * 2);
    }
}
