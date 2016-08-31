package carlist;




public class Truck extends Vehicle implements Accelerate{

    private boolean bed;

    public Truck(int doors, int seats, int wheels, float weight, Engine engine) {
        super(doors, seats, wheels, weight, engine);
        this.bed = bed;
    }

    public boolean isBed() {
        return bed;
    }

    public void setBed(boolean bed) {
        this.bed = bed;
    }

    @Override
    public String accelerate() {
      
       
        return "0-60mph in 5.0 sec"; 
    }

    public String getAccelerate(){
        return accelerate();
    }

    
 
    
}
