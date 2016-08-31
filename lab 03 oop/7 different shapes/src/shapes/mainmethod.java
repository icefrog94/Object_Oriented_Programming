/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 01603857
 */
package shapes;

import javax.swing.JOptionPane;

public class mainmethod {
      public static void main(String[] args) {
         String more = "y";        
         while(more.equalsIgnoreCase("y")){
      //Enter S,C, or T
         String input = JOptionPane.showInputDialog("Enter R for rectangle , C for circle , or T for triangle , RP for retangularprism , S for sphere , TR for triangularprism , and CY for cylinder");   
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
      //rectangularprism
       if (input.equalsIgnoreCase("RP")){
          String lengthu = JOptionPane.showInputDialog("Enter length of a RectangularPrism");
          double length = Double.parseDouble(lengthu); 
          String width1 = JOptionPane.showInputDialog("Enter width of a RectangularPrism");
          double width = Double.parseDouble(width1);
          String height1 = JOptionPane.showInputDialog("Enter height of a RectangularPrism");
          double height = Double.parseDouble(height1); 
          double perimeter = (2*length)+(2*width);
          double lateralarea = perimeter*height;
          double volume = length * width * height;
          double surfacearea = (length*width*2 + length*height*2 + height*width*2);
          JOptionPane.showMessageDialog( null,"The volume is " + volume + " , the surfacearea is " + surfacearea + " and the lateralArea is: "+ lateralarea); 
          
           
      }
            //sphere
       if(input.equalsIgnoreCase("S")){
           String radiusu = JOptionPane.showInputDialog("Enter the radius of a sphere");
           double radius = Double.parseDouble(radiusu);
           double area = 4 * 3.14159 * radius * radius;
           double volume = ( 4.0 / 3.0 ) * Math.PI * Math.pow( radius, 3 );
           JOptionPane.showMessageDialog(null, "Area: "+ area + "\nvolume is: "+ volume);        
       }
       
        //circle
        if(input.equalsIgnoreCase("C")){
           String radiusu = JOptionPane.showInputDialog("Enter the radius of a circle");
           double radius = Double.parseDouble(radiusu);
           double area = 3.14159 * radius * radius;
           double circumference = 2 * 3.14159 * radius;
           JOptionPane.showMessageDialog(null, "Area: "+ area + "\nCircumference: "+circumference);        
       }
          //cylinder
        if(input.equalsIgnoreCase("CY")){
           String radiusu = JOptionPane.showInputDialog("Enter the radius of a cylindere");
           double radius = Double.parseDouble(radiusu);
           String he = JOptionPane.showInputDialog("Enter the height of a cylindere");
           double h = Double.parseDouble(he);
           double area = 3.14159 * radius * radius;
           double volume = Math.round(area * h);
           double cir = 2 * 3.14159 * radius;
           double laterarea = Math.round(cir * h);
           double surfacearea = Math.round(laterarea + (2*area));
           JOptionPane.showMessageDialog(null, "Volume: "+ volume  + "\nlaterarea is : "+ laterarea+ "\n surfacearea is: "+ surfacearea);        
       }
      
            //Triangle
      if  (input.equalsIgnoreCase("T")){
           String baseu = JOptionPane.showInputDialog("Enter the first side of a triangle");
           double s1 = Double.parseDouble(baseu);
           String heightu = JOptionPane.showInputDialog("Enter the second side of a triangle");
           double s2 = Double.parseDouble(heightu);
           String heigh2 = JOptionPane.showInputDialog("Enter the third side of a triangle");
           double s3 = Double.parseDouble(heigh2);
           double S = (s1 + s2 + s3)/2;
           double area = Math.round( Math.sqrt(S * (S - s1) * (S-s2) * (S-s3)));
           double Perimeter = Math.round(S * 2);
           JOptionPane.showMessageDialog(null," Area is: "+ area + "\n Perimeter: "+Perimeter);     
      }
        //triangularprism
       if  (input.equalsIgnoreCase("TR")){
           String baseu = JOptionPane.showInputDialog("Enter the first side of a triangularprism");
           double s1 = Double.parseDouble(baseu);
           String heightu = JOptionPane.showInputDialog("Enter the second side of a triangularprism");
           double s2 = Double.parseDouble(heightu);
           String heigh2 = JOptionPane.showInputDialog("Enter the third side of a triangularprism");
           double s3 = Double.parseDouble(heigh2);
           String height = JOptionPane.showInputDialog("Enter the height of a triangularprism");
           double h = Double.parseDouble(height);
           double S = (s1 + s2 + s3)/2;
           double area = Math.round( Math.sqrt(S * (S - s1) * (S-s2) * (S-s3)));
           double Perimeter = Math.round(S * 2);
           double lateralarea = Perimeter * h;
           JOptionPane.showMessageDialog(null," Area is: "+ area + "\n Perimeter: "+Perimeter + "/n Lateral area is: "+ lateralarea);     
      }
            more = JOptionPane.showInputDialog("Continue? - Y for Yea");
      
         }  
   }
    
}

