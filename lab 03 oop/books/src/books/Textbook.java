

package books;


public class Textbook extends Book {
    private String gradeLevel;

  

    public String getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(String gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

      public Textbook(String gradeLevel, String title, String author, int numPages) {
        super(title, author, numPages);
        this.gradeLevel = gradeLevel;
      }  
    @Override
    public String getInfo(){
    
        return  super.getInfo().toString()+"\n"
       
               
           + "Grade level: "+ gradeLevel;
    } 
    @Override
    public String displayInfo(){
    
        return getInfo();
    }
    
}
