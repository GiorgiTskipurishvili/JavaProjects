package Task_5;
import java.util.ArrayList;
public class Book {
    /**Write a Java program to create a class called "Book" with attributes for title,
     * author, and ISBN, and methods to add and remove books from a collection.**/

    private String title, author, ISBN;
    private static ArrayList < Book > bookCollection = new ArrayList < Book > ();

    public Book(String title, String author, String ISBN){
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }

    public String getAuthor(){
        return author;
    }
    public void setAuthor(String author){
        this.author = author;
    }

    public String getISBN(){
        return ISBN = ISBN;
    }
    public void setISBN(String  ISBN){
        this.ISBN = ISBN;
    }


    public static void addBook(Book book){
        bookCollection.add(book);
    }
    public static void removeBook(Book book){
        bookCollection.remove(book);
    }
    public static ArrayList<Book> getBookCollection() {
        return bookCollection;
    }
}