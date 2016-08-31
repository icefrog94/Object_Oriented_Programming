package carlist;




/**
 *
 * @author JamieDell
 */
public class Luxury extends Vehicle implements Accelerate{
    private String comfort;

    public Luxury(int doors, int seats, int wheels, float weight, Engine engine) {
        super(doors, seats, wheels, weight, engine);
        this.comfort = comfort;
    }
    
    public String getComfort() {
        return comfort;
    }

    public void setComfort(String comfort) {
        this.comfort = comfort;
    }

    @Override
    public String accelerate() {
        
        return "0-60mph in 3.0 sec"; 
        
    }
    
    
}
