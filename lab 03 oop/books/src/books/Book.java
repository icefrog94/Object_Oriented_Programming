

package books;

/**
 *
 * @author wilbert
 */
public class Book extends Books {
 private String title,author;
 public int numPages = 0 ;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumPages() {
        return numPages;
    }

    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }

    public Book(String title, String author,int numPages) {
        this.title = title;
        this.author = author;
        this.numPages = numPages;
   }
    

    @Override
    public String getInfo() {
        
    return "Title: "+ title+"\n"
         + "Author: "+ author+"\n"
         + "Number of Pages: "+numPages;
        
    }

    @Override
    public String displayInfo() {
        return getInfo();
    }
}
