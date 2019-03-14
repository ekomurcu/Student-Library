package Users;
import Library.Lib;
import Library.Book;
import java.util.Date;
public class Reader extends User{
    private int userID;
    private String userName;
    private Date regDate;

    public Reader(int id, String name){
        super(id,name);
        this.userID=id;
        this.userName=name;
    }
    public void rentBook(Lib lib, Book b){
        lib.rentBook(this,b);
    }
    public void printRentBooks(Lib lib){
        lib.printRentBooks(this);
    }
    public String toString(){
        return super.toString()+" Status: Reader";
    }
}