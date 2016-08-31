/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package colorchooser;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import javax.swing.JPanel;

/**
 *
 * @author 00220682
 */
public class ColorCanvas extends JPanel implements ColorListener{

  
    @Override
    public void changeColor(ColorEvent ce) {
        
        setBackground(ce.getColor());
        
        ColorChooser c = new ColorChooser();
        c.color2 = ce.getColor();
   
    }
    
    public ColorCanvas(){
        super();
        setBackground(java.awt.Color.BLACK);
    }
    
}
