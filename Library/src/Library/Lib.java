package Library;

import Users.Admin;
import Users.Reader;
import Users.SortUser;
import Users.User;

import java.util.*;

public class Lib {

    private HashMap<Book, HashSet<User>> bookMap;
    private HashMap<User, HashSet<Book>> userMap;

    public Lib() {
        bookMap = new HashMap<>();
        userMap = new HashMap<>();
    }

    //TODO: rentBook method comes here
    public void rentBook(User u, Book b){
        if(bookMap.containsKey(b) && b.getUnits()!=0){
            b.setUnits(b.getUnits()-1);
            bookMap.get(b).add(u);
            if(userMap.containsKey(u))
                userMap.get(u).add(b);
        }
        else{
            throw new IllegalArgumentException("No such book in the system");
        }

    }
    public void addBook(User u,Book b)
    {
        if(bookMap.containsKey(b)){
            b.setUnits(b.getUnits()+1);
        }
        else
            bookMap.put(b,new HashSet<User>());
    }
    //TODO: printRentBooks method 1 comes here
    public void printRentBooks(Reader u){
        HashSet<Book> rentBooks= userMap.get(u);
        for(Book rented: rentBooks){
            System.out.println(rented.toString());
        }
    }
    //TODO: printRentBooks method 2 comes here
    public void printRentBooks(Admin u){
        Set<Book> bookSet= bookMap.keySet();
        for(Book rented: bookSet){
            Set<User> rentUsers= bookMap.get(rented);
            System.out.print(rented.getBookName());
            System.out.print(" [");
            for(User curr:rentUsers){
                System.out.print(curr.toString());
            }
            System.out.println("]");
        }
    }

    public void addUser(User u)
    {
        if(!userMap.containsKey(u)){
            userMap.put(u,new HashSet<Book>());
        }
        else
            throw new IllegalArgumentException("User already exists");
    }


    public void deleteBook(User u,Book b)
    {
        if(bookMap.containsKey(b)){
            bookMap.remove(b);
        }
        else
            throw new IllegalArgumentException("No such book in the system");
    }



    //TODO: method printAllUsers comes here
    public void printAllUsers(){
        //Getting Set of keys from HashMap
        Set<User> setUser=userMap.keySet();
        //Creating an ArrayList of keys by passing the keySet
        List arr= new ArrayList<User>(setUser);
        //Sorting according to SortUser class by the help of Collections class
        Collections.sort(arr ,new SortUser());
        //Printing all books out in sorted
        for(int i=0; i<arr.size(); i++){
            System.out.println(arr.get(i));
        }
    }

    //TODO: method printAllBooks comes here
    public void printAllBooks(){
        Set<Book> bookSet=bookMap.keySet();
        //Since hashmaps work like a stack, we need to reverse the order.
        for(Book curr : bookSet){
            System.out.println(curr.toString());
        }
    }
}



















