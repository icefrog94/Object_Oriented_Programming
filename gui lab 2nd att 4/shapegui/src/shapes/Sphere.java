/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;


public class Sphere extends Circle {

    public Sphere(double radius) {
        super(radius);
    }
     public double getVolume(){
       return (4.0/3.0) * super.getRadius() * getArea();
    
    }
    
    public double getSurfaceArea(){
        return 4 * super.getArea();
    
    }
}
