/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package colorchooser;

import javax.swing.JLabel;

/**
 *
 * @author 00220682
 */
public class ColorLabel extends JLabel implements ColorListener{

    @Override
    public void changeColor(ColorEvent ce) {
        String hex = String.format("#%02x%02x%02x", ce.getColor().getRed(), ce.getColor().getGreen(),ce.getColor().getBlue());
        setText("Hexadecimal color value: "+hex);
    }
    
    public ColorLabel(){
        super();
        setText("Hexadecimal color value: #000000 ");
    }
    
}
