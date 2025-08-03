import java.util.Scanner;
class Author
  {
    private String name;
    private String email;
    private char gender;
    public Author(String name,String email,char gender)
    {
      this.name=name;
      this.email=email;
      this.gender=gender;
    }
    public String getName()
    {
      return name;
    }
    public String getEmail()
    {
      return email;
    }
    public char getGender()
    {
      return gender;
    }
  }
class book
  {
    private String name;
    private Author author;
    private double price;
    private int qtyInStock;
    public book(String name,Author author,double price,int qtyInStock)
    {
      this.name=name;
      this.author=author;
      this.price=price;
      this.qtyInStock=qtyInStock;
    }
    public String getName()
    {
      return name;
    }
    public Author getAuthor()
    {
      return author;
    }
    public double getPrice()
    {
      return price;
    }
    public int getQtyInStock()
    {
      return qtyInStock;
    }
  }
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String authorName= sc.nextLine();
        String authorEmail=sc.nextLine();
        char gender=sc.next().charAt(0);
        Author author=new Author(authorName, authorEmail, gender);
        sc.nextLine();  
        
        String bookName=sc.nextLine();
        double price=sc.nextDouble();
        int qty=sc.nextInt();
        Book book=new Book(bookName, author, price, qty);

        System.out.println("Book Name:" +book.getName());
        System.out.println("Book Price:" +book.getPrice());
        System.out.println("QuantityInStock" +book.getQtyInStock());
       
        System.out.println("Author Name:" +author.getName());
        System.out.println("Author Email: " +author.getEmail());
        System.out.println("Author Gender: " +author.getGender());
        sc.close();     
    }
}
