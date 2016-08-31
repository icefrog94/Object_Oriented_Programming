
package shapes;
/**
 *
 * @author 01603857
 */
public class cylinder extends circle {
    private double height;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public cylinder(double height, double radius) {
        super(radius);
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
    
    
}
    


