package carlist;




public abstract class Vehicle {
    private Engine engine;
    private int doors;
    private int seats;
    private int wheels;
    private float weight;

    public Vehicle(Engine engine) {
     this.engine = engine;
   } 
    
    public Vehicle(int doors, int seats, int wheels, float weight, Engine engine) {
        this.doors = doors;
        this.seats = seats;
        this.wheels = wheels;
        this.weight = weight;
        this.engine = engine;
    }
   
    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
    
    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

  
  
    
    
            
}
