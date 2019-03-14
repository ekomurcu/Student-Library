package Users;
import Library.Lib;
import Library.Book;
import java.util.Date;
public class Admin extends User{
    private int userID;
    private String userName;
    private Date regDate;
    public Admin(int id, String name){
        super(id,name);
        this.userID=id;
        this.userName=name;
    }
    public void deleteBook(Lib lib, Book b){
        lib.deleteBook(this,b);
    }
    public void addBook(Lib lib, Book b){
        lib.addBook(this,b);
    }
    public void printRentBooks(Lib lib){
        lib.printRentBooks(this);
    }
    public String toString(){
        return super.toString()+" Status: Admin";
    }
}