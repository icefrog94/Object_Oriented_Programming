

package books;


public class Novel extends Book {
    private String genre;

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Novel(String genre, String title, String author, int numPages) {
        super(title, author, numPages);
        this.genre = genre;
    }
    @Override
    public String getInfo(){
    
        return super.getInfo().toString()+"\n"
             + "Genre: "+ genre;
    }
    @Override
    public String displayInfo(){
    
        return getInfo();
    }
    
}
