

package books;


public class Biography extends Book {
    private String subject;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Biography(String subject, String title, String author, int numPages) {
        super(title, author, numPages);
        this.subject = subject;
    }
    @Override
    public String getInfo(){
    
        return super.getInfo().toString()+"\n"
           + "Subject: "+ subject;
           
    }
    @Override
    public String displayInfo(){
        return getInfo();
    }
}
