
package temperatureconv;
import javax.swing.JOptionPane;
/**
 *
 * @author waiyankaung
 */
public class testtemp { 
  public static void main(String[] args) {       
         String more = "y";
        while (more.equalsIgnoreCase("Y")){       
        String unit = JOptionPane.showInputDialog("Enter F for fahrenheit or C for celsius: ");       
        String temp = JOptionPane.showInputDialog("Enter the Temperature: ");
        double degree = Double.parseDouble(temp);        
        switch (unit) {
            case "F":
            case "f":
                fahrenheit fah = new fahrenheit(degree);
                JOptionPane.showMessageDialog(null, fah.getDegree() +  " Celsius ");
                break;
            case "C":
            case "c":
                celsius cel = new celsius(degree);
                JOptionPane.showMessageDialog(null, cel.getDegree() + " Fahrenheit ");
                break;
        }       
        more = JOptionPane.showInputDialog("Continue? - Y for Yes");              
    }    
 }
}
