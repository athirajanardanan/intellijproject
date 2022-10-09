package class18;

public class book {
   static String bookname;
   static int bookprice;
   static String publisher;
    static String writer;


    public book(String bookname, int bookprice) {
        this.bookname = bookname;
        this.bookprice = bookprice;
        System.out.println("Details of book in constructor 1");
        System.out.println("Book name:="+bookname);

        System.out.println("Book price:="+bookprice);


    }
    public book(String bookname,int bookprice,String publisher,String writer)
    {
        this(bookname,bookprice);
        this.publisher = publisher;
        this.writer = writer;
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Details of book in constructor2");
        System.out.println("Book name:="+bookname);

        System.out.println("Book price:="+bookprice);

        System.out.println("Book publisher:="+publisher);

        System.out.println("writer:="+writer);


    }
    public static void main(String[] args)
    {
        book obj=new book("One night at the call center",500);
        book obj1=new book("one indian girl",1000,"Rupa publications india","chethan Bhagath");
    }

}
