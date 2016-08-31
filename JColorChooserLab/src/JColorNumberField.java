/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package colorchooser;

import java.util.Vector;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.text.Document;

/**
 *
 * @author 01613273
 */
public class JColorNumberField extends JTextField implements ColorListener{
    private Vector listeners;

    public JColorNumberField() {
        super();
        setText("0");
        listeners = new Vector();
        }
        
    protected Document creatDefaultModel(){
        String[] accept = {"0","1","2","3","4","5","6","7","8","9","-"} ;
        return new RestrictedDocument(accept);
    }
    
    public int getValue() throws NumberFormatException{
        return Integer.parseInt(getText());
    }

    @Override
    public void changeColor(ColorEvent ce) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



}
