
package carlist;
import java.awt.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import javax.swing.*;
public class CarListCellRenderer extends DefaultListCellRenderer{
        
    
        public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus){
            try{
                FileReader fr = new FileReader(new File("cars.txt"));
                BufferedReader reader = new BufferedReader(fr);
                final ImageIcon ElectricIcon = new ImageIcon(this.getClass().getResource(reader.readLine()));
                final ImageIcon LuxuryIcon = new ImageIcon(this.getClass().getResource(reader.readLine()));
                final ImageIcon RacingIcon = new ImageIcon(this.getClass().getResource(reader.readLine()));
                final ImageIcon TruckIcon = new ImageIcon(this.getClass().getResource(reader.readLine()));
                
                super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
                String s = value.toString().toLowerCase();
                if(s.contains("electric")){
                    setIcon(ElectricIcon);
                    setText("Electric");
                }
                else if(s.contains("luxury")){
                    setIcon(LuxuryIcon);
                    setText("Luxury");
                }
                else if(s.contains("racing")){
                    setIcon(RacingIcon);
                    setText("Racing");
                }
                else if(s.contains("truck")){
                    setIcon(TruckIcon);
                    setText("Truck");
                }
                else{
                    setIcon(null);
                }
            }
            catch(FileNotFoundException e){} catch (IOException ex){
                System.exit(0);
            }
            return this;
    }
}   

