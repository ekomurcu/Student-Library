package Users;
import java.util.Comparator;
public class SortUser implements Comparator<User>{
    public SortUser(){

    }
    public int compare(User user1, User user2){
        return user1.getUserName().compareTo(user2.getUserName());
    }
}