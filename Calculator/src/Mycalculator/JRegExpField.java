
package Mycalculator;
import javax.swing.*;
import javax.swing.text.*;

public class JRegExpField extends JTextField{
    private String exp;

    public String getExp() {
        return exp;
    }

    public void setExp(String exp) {
        this.exp = exp;
        setDocument(new RegExpDocument(exp));
    }
    
    public JRegExpField(){
        super();
    }
    
    public JRegExpField(String exp){
        this.exp = exp;
    }
    
    @Override
    protected Document createDefaultModel(){
        return new RegExpDocument(exp);
    }
}
