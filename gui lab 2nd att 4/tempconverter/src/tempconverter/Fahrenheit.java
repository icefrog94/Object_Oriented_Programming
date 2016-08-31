/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tempconverter;

import java.text.DecimalFormat;
import javax.swing.JFrame;

public class Fahrenheit extends JFrame{
    
      private double degrees ;           
      DecimalFormat df = new DecimalFormat("0.00");
             
    public double getdegrees(){
    return degrees;
    }    
  
    public void setDegrees(double  degrees){
        this.degrees = degrees;
    }
    public Fahrenheit(double  degrees){
      
    this.degrees = degrees;
    }
    
    
     public double getCelsius(){
     
        return  ((degrees - 32) * 5 ) / 9;
    }
    @Override
    public String toString(){
    
        return "<html>: " +df.format(getCelsius());
    
    
    }
}
