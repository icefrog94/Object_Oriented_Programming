

package books;

/**
 *

 */
public class Author extends Books {
    private String address,email,titles;

   

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTitles() {
        return titles;
    }

    public void setTitles(String titles) {
        this.titles = titles;
    }

    public Author( String address, String email, String titles) {
       
        this.address = address;
        this.email = email;
        this.titles = titles;
    }
    @Override
    public String getInfo(){
    
        return  "Address: "+ address+"\n"
             + "Email: "+email+"\n"
             + "Titles: "+titles;
    
    }
    @Override
    public String displayInfo(){
    
        return getInfo();
    
    }
    
}
