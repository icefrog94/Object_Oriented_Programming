

package books;
import javax.swing.JOptionPane;

public class TestClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
   
       
       String more = "Y";
       while(more.equalsIgnoreCase("Y")){
       String title =JOptionPane.showInputDialog("Please enter the Book title:");
       String author = JOptionPane.showInputDialog("Please enter the Author name: ");
       int numPages = Integer.parseInt(JOptionPane.showInputDialog("Please enter the number of pages:"));
        
        
       
       String address=JOptionPane.showInputDialog("Please enter the Author address: ");
       String email =JOptionPane.showInputDialog("Please enter the Author email: ");
       String titles =JOptionPane.showInputDialog("Please enter Author Titles: ");
 
       String subject =JOptionPane.showInputDialog("Please enter the Book subject: ");
       String genre=JOptionPane.showInputDialog("Please enter the Genre of the book: ");
       String gradeLevel =JOptionPane.showInputDialog("Please enter Grade level : ");
       
       
       Book book = new Book(title,author,numPages);
       Author autho = new Author(address,email,titles);
       Biography biograph = new Biography(subject,title,author,numPages);
       Textbook textbook = new Textbook(gradeLevel,title,author,numPages);
       Novel novo = new Novel(genre,title,author,numPages);
      JOptionPane.showMessageDialog(null, book.displayInfo()+"\n"
                                  + autho.displayInfo()+"\n"
                                  + textbook.displayInfo()+"\n"
                                  + biograph.displayInfo()+"\n"
                                  + novo.displayInfo() );
     JOptionPane.showMessageDialog(null,"If you want to continue, click OK !" );
            
        }
       
      }
    }    
  
        
        
        
        
        
        
       
        
    
    
