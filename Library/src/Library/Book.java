package Library;
public class Book implements Comparable<Book> {

    private String bookName;

    private String[] Authors;

    private int units;

    public Book(String name, String[] Authors, int units)
    {
        this.bookName = name;
        this.Authors  = Authors;
        if (units < 0) throw new IllegalArgumentException("Units can not be negative");
        else this.units = units;
    }

    public void setBookName(String name)
    {
        this.bookName = name;
    }

    public String getBookName()
    {
        return bookName;
    }

    public void setAuthors(String[] authors)
    {
        this.Authors = authors;
    }

    public String[] getAuthors()
    {
        return Authors;
    }

    public void setUnits(int units)
    {
        this.units = units;
    }

    public int getUnits()
    {
        return units;
    }

    //TODO: method commpareTo comes here
    public int compareTo(Book b ){
        if(this.bookName.compareTo(b.bookName)>0)
            return 1;
        else if(this.bookName.compareTo(b.bookName)<0)
            return -1;
        else //if(this.bookName.equals(b.bookName))
            return 0;

    }
    //TODO: method toString comes here
    public String toString(){
        String all="";
        for(int i=0;i<this.Authors.length; i++){
            all=all+this.Authors[i]+", ";
        }
        return "BookName: " + this.bookName+ ". Authors: " + all;
    }
}
