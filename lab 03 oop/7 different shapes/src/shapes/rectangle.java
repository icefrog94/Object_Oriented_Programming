/**
 *
 * @author 01603857
 */
package shapes;

 public class rectangle extends shapes {
  
     private double length, width;

        public double getLength() {
            return length;
        }

        public void setLength(double length) {
            this.length = length;
        }

        public double getWidth() {
            return width;
        }

        public void setWidth(double width) {
            this.width = width;
        }

        public rectangle(double length, double width) {
            this.length = length;
            this.width = width;
        }
        @Override
         public double getArea(){
        return length * width;
     }
    
        @Override
         public double getPerimeter(){
        return 2 * (length + width);
    }
    
    
   

}

    
