
package shapes;

/**
 *
 * @author 01603857
 */
public class sphere extends circle{
     private double radius;


    public sphere(double radius) {
        super(radius);
    
    }
    public double getVolume(){
    
    return Math.round ( 4.0 / 3.0 ) * super.getRadius()* getArea();
    }

    public double getSurfacearea(){
        return 4 * super.getArea();
    }
    
}