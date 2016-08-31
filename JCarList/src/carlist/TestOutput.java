package carlist;




public class TestOutput {
    public static void main(String[]args){
        
        Vehicle [] vehicle = new Vehicle[4];
        
        Engine[]engine = new Engine[4];
        
        engine[0] = new Engine("ZKJS4",4,30,true);
        engine[1] = new Engine("Z3gd4",8,54,false);
        engine[2] = new Engine("ZGMF208",8,100,true);
        engine[3] = new Engine("MAGNUS10",6,80,false);
        
        vehicle[0] = new Electric(4,4,4,2000,engine[0]);
        vehicle[1] = new Luxury(4,4,4,2000,engine[1]);
        vehicle[2] = new Truck(4,4,4,20000,engine[2]);
        vehicle[3] = new Racing(2,4,4,2000,engine[3]);
        
        
        // for loop for the output
        for(Vehicle currentVehicle:vehicle ){
            
            StringBuilder currentCar = new StringBuilder(128);
            
            currentCar.append("\nType: "+ currentVehicle.getClass().getName().substring(8)+"\n");
            currentCar.append("Doors: " + currentVehicle.getDoors()+"\n");
            currentCar.append("Wheels: " + currentVehicle.getWheels()+"\n");
            currentCar.append("Doors: " + currentVehicle.getDoors()+"\n");
            currentCar.append("Weight: "+ currentVehicle.getWeight()+"\n");
            currentCar.append("Engine Specs\n"+ currentVehicle.getEngine().toString()+"\n");
            
            
            //currentCar.append(currentVehicl);
            
            Accelerate acc = (Accelerate)currentVehicle;
            currentCar.append("Accelerate info: "+acc.accelerate());
            
            System.out.println(currentCar.toString());
        }
        
    }
}
