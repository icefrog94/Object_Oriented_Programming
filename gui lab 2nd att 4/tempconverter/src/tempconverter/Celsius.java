

package tempconverter;

import java.text.DecimalFormat;
import javax.swing.JFrame;

public class Celsius extends JFrame {
     private double  degrees ;           
     DecimalFormat df = new DecimalFormat("0.00");
             
    public double  getdegrees(){
    return degrees;
    }    
  
    public void setDegrees(int degrees){
        this.degrees = degrees;
    }
    public Celsius(double  degrees){
    
    this.degrees = degrees;
    }
    
    
     public double  getFahrenheit(){
     
        return (degrees *9/5 + 32);
    }
    @Override
     public String toString(){
     
         return "<html>: " +df.format(getFahrenheit());
     
     
     }
}
