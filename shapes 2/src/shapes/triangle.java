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
public class triangle extends shapesmain {
      private double height;
    private double base;
    private double hypotenuse;
    

    
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHypotenuse() {
        return hypotenuse;
    }

    public void setHypotenuse(double hypotenuse) {
        this.hypotenuse = hypotenuse;
    }
    
    public triangle(double height, double base, double hypotenuse) {
        this.height = height;
        this.base = base;
        this.hypotenuse = hypotenuse;
        
    }
    
    public double getSide(){
         return (base + height + hypotenuse)/2;
    }
    
    @Override
    public double getArea(){
        double s = (base + height + hypotenuse)/2;
         return Math.sqrt(s * (s-base) * (s-height) * (s-hypotenuse));
    }
    
    @Override
    public double getPerimeter(){
        return base + height + hypotenuse;
    }
    
   
 }


