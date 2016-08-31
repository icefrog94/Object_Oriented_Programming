

package Mycalculator;

public class JDecimalField extends JRegExpField{
    public JDecimalField(){
        super();
        setExp("-*[0-9]*[\\x2e]*[0-9]*");
    }
    
    public double getValue() throws NumberFormatException{
        return Double.parseDouble(getText());
    }
}
