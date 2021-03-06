/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package colorchooser;

import java.awt.Color;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author 00220682
 */
public class JColorChooser extends javax.swing.JFrame {
   
  
    /**
     * Creates new form JColorChooser
     */
    public JColorChooser() {
        initComponents();
        chooser.addColorListener(canvas);
        chooser.addColorListener(label);
        chooser.addColorListener(colorPanel);
        colorPanel.addColorListener(canvas);
        colorPanel.addColorListener(label);
        colorPanel.addColorListener(chooser);
       
       
        //colorPanel.txtGreen.addColorListener(canvas);
      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        chooser = new colorchooser.ColorChooser();
        canvas = new colorchooser.ColorCanvas();
        colorPanel = new colorchooser.JInputPanel();
        jPanel1 = new javax.swing.JPanel();
        label = new colorchooser.ColorLabel();
        selectColor = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("JColorChooser");
        getContentPane().add(chooser, java.awt.BorderLayout.LINE_END);

        javax.swing.GroupLayout canvasLayout = new javax.swing.GroupLayout(canvas);
        canvas.setLayout(canvasLayout);
        canvasLayout.setHorizontalGroup(
            canvasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 409, Short.MAX_VALUE)
        );
        canvasLayout.setVerticalGroup(
            canvasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 119, Short.MAX_VALUE)
        );

        getContentPane().add(canvas, java.awt.BorderLayout.PAGE_START);
        getContentPane().add(colorPanel, java.awt.BorderLayout.CENTER);

        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 20, 5));
        jPanel1.add(label);

        selectColor.setText("Select Color");
        selectColor.setActionCommand("");
        selectColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectColorActionPerformed(evt);
            }
        });
        jPanel1.add(selectColor);

        jButton1.setText("Done");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_END);

        setBounds(0, 0, 425, 366);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
   try{
        
      
        PrintWriter printWriter = new PrintWriter (new File("rgb.txt"));
        printWriter.println(chooser.r);
        printWriter.println(chooser.g);
        printWriter.println(chooser.b);
       // printWriter.println(ce.getColor().getGreen());
       // printWriter.println(ce.getColor().getBlue());
        printWriter.close();
        }catch(FileNotFoundException e){
            
            JOptionPane.showMessageDialog(null, "File not created.");
        
        
        }    
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void selectColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectColorActionPerformed
        // TODO add your handling code here:
          try{
        
      
        PrintWriter printWriter = new PrintWriter (new File("rgb.txt"));
        printWriter.println(chooser.r);
        printWriter.println(chooser.g);
        printWriter.println(chooser.b);
       // printWriter.println(ce.getColor().getGreen());
       // printWriter.println(ce.getColor().getBlue());
        printWriter.close();
        }catch(FileNotFoundException e){
            JOptionPane.showMessageDialog(null, "File not created.");
            
        
        
        }    
   
    }//GEN-LAST:event_selectColorActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JColorChooser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JColorChooser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JColorChooser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JColorChooser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
       
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JColorChooser().setVisible(true);
          
       
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private colorchooser.ColorCanvas canvas;
    private colorchooser.ColorChooser chooser;
    private colorchooser.JInputPanel colorPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private colorchooser.ColorLabel label;
    private javax.swing.JButton selectColor;
    // End of variables declaration//GEN-END:variables
}
