/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package howMuchPaint;

import javax.swing.JFrame;

/**
 *
 * @author 01603857
 */
public class HowMuch extends JFrame {
    private int lengthOfRoom;
 
    private int widthOfRoom;
    private int numOfdoors;
    private int numOfwindows;
    
     
    final double COVERAGE = 120.0; 
    final double height;
    public double totalSqFt;
    public double totalPlusCeil;
    public double paintRequire;
    public double paintRequireCeil;
    
    //Compute totalSqFt,paintRequire
   

    public int getLengthOfRoom() {
        return lengthOfRoom;
    }

   

    public int getWidthOfRoom() {
        return widthOfRoom;
    }

    public int getNumOfdoors() {
        return numOfdoors;
    }

    public int getNumOfwindows() {
        return numOfwindows;
    }

    public HowMuch(int lengthOfRoom, int widthOfRoom, int numOfdoors, int numOfwindows) {
        this.height = 8.0;
        this.paintRequireCeil = 0;
        this.paintRequire = 0;
        this.totalPlusCeil = 0;
        this.totalSqFt = 0;
        
        this.lengthOfRoom = lengthOfRoom;
        
        this.widthOfRoom = widthOfRoom;
        this.numOfdoors = numOfdoors;
        this.numOfwindows = numOfwindows;
    }
    
  public double getHowMuch(){
       //Compute totalSqFt,paintRequire
      totalSqFt = ((getLengthOfRoom() * 2)*8) +((getWidthOfRoom()* 2) *8);
    //Based on windows 3 feet x 4 feet  = 3 x 4 = 12 square feet 
   // """"""" doors 3 feet x 6 feet 8 inches = 3 x 6.66 = 19.98 square feet
    totalSqFt -= numOfwindows * 12 ;
    totalSqFt -= numOfdoors * 19.98; 
  

        
          return   paintRequire = Math.round(totalSqFt / COVERAGE );
        
   } 
    @Override
 public String toString(){
 return  "<html>Paint Required: "+ getHowMuch() +"Gallons";
 
 
 }
   
 }
     

