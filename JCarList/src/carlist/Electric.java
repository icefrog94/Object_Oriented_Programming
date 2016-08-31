package carlist;




public class Electric extends Vehicle implements Accelerate{

    final boolean electric_power;
    
    public Electric(int doors, int seats, int wheels, float weight, Engine engine) {
        super(doors, seats, wheels, weight, engine);
        this.electric_power = true;
    }

    public boolean isElectric_power() {
        return electric_power;
    }

    @Override
    public String accelerate() {
       
         return "0-60mph in 2.1 sec"; 
        
        
    }
    
}
