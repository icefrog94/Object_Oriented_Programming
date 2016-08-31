package carlist;





public class Engine {
    private String engineModel;
    
    private int cylinders;
    private int horsePower;
    
    boolean automatic;

    public Engine(String engineModel, int cylinders, int horsePower,boolean automatic) {
        this.engineModel = engineModel;
        this.cylinders = cylinders;
        this.horsePower = horsePower;
        this.automatic = automatic;
    }

    public String start(){
        
        StringBuilder start = new StringBuilder(128);
        
        if(!automatic){
            start.append("Insert Key.");
        }else{
            start.append("Press Button");
        }
        
        return start.toString();
    }
    
    public String stop(){
        StringBuilder stop = new StringBuilder(128);
        
        if(!automatic){
            stop.append("Set transmission to park Remove Key.");
        }else{
            stop.append("Set transmission to park then Press Button");
        }
        
        return stop.toString();
    }
    
    public String getEngineModel() {
        return engineModel;
    }

    public void setEngineModel(String engineModel) {
        this.engineModel = engineModel;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }
  
     public String toString(){
        StringBuilder engine = new StringBuilder(128);
        
        engine.append("Model: " +getEngineModel()+"\n");
        engine.append("Cylinders: " + getCylinders()+"\n");
        engine.append("Horse Power: " +getHorsePower() + " hp \n");
        
        return engine.toString();
        
    }
    
}
