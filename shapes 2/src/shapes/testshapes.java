/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;

import javax.swing.JOptionPane;

public class testshapes {
      public static void main(String[] args) {
         String more = "y";        
         while(more.equalsIgnoreCase("y")){
      //Enter S,C, or T
         String input = JOptionPane.showInputDialog("Enter R for rectangle,C for circle, or T for triangle");   
     //If Statements
      //rectangle
      if (input.equalsIgnoreCase("R")){
           String lengthu = JOptionPane.showInputDialog("Enter length of a rectangle");
          double length = Double.parseDouble(lengthu); 
         String width1 = JOptionPane.showInputDialog("Enter width of a rectangle");
         double width = Double.parseDouble(width1);
           double area = length * width;
          double perimeter = (2*length)+(2*width);
           JOptionPane.showMessageDialog( null,"The area is " + area + " and the perimeter is " + perimeter); 
           
      }
            //Circle
       if(input.equalsIgnoreCase("C")){
           String radiusu = JOptionPane.showInputDialog("Enter the radius of a circle");
           double radius = Double.parseDouble(radiusu);
           double area = 3.14159 * radius * radius;
          double circumference = 2 * 3.14159 * radius;
           JOptionPane.showMessageDialog(null, "Area: "+ area + "\nCircumference: "+circumference);        
       }
      
            //Triangle
      if  (input.equalsIgnoreCase("T")){
           String baseu = JOptionPane.showInputDialog("Enter the length 1 of a triangle");
           double length1 = Double.parseDouble(baseu);
           String heightu = JOptionPane.showInputDialog("Enter the length 2 of a triangle");
           double length2 = Double.parseDouble(heightu);
           String output = "The area is " + (length1 * length2) / 2;
           double Hypotenuse = Math.sqrt(Math.pow(length1, 2.0)+Math.pow(length2, 2.0));
          double Perimeter = length1 + length2 + Hypotenuse;
           JOptionPane.showMessageDialog(null,"output: "+ output+"\nHypotenuse: "+ Hypotenuse + "\n Perimeter: "+Perimeter);     
      }
            more = JOptionPane.showInputDialog("Continue? - Y for Yea");
      
         }  
   }
    
}

