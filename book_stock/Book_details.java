
package book_stock;
import library.*;

public class Book_details extends Book{
String title,author,edition;

public  Book_details(String a,String b,String c,String d,String e) {
    super(a,b);
    title=c;
    author=d;
    edition=e;
    }
    public void display(){
        System.out.println("Book Type: "+book_type+"\nAccno: "+Accno+"\nTitle: "+title+"\nAuthor: "+author+"\nEdition: "+edition);
    }

}
 class Main {
    public static void main(String[] args) {
        Book_details ob=new Book_details("Action","A001B","It's Hero Time" , " Ben Tenison","Ultimate Alien");
        ob.display();
    }
}


