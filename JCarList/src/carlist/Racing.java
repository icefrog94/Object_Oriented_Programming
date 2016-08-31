package carlist;




public class Racing extends Vehicle implements Accelerate{

    private String design;
    final boolean PERFORMANCE =  true;

    public Racing(int doors, int seats, int wheels, float weight, Engine engine) {
        super(doors, seats, wheels, weight, engine);
        this.design = design;
    }

    public String getDesign() {
        return design;
    }

    public void setDesign(String design) {
        this.design = design;
    }

    @Override
    public String accelerate() {
        
       return "0-60mph in 0.7 sec"; 
        
    }

  
   
    
}
