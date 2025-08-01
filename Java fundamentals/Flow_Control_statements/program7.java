import java.util.Scanner;
public class program7
  {
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      char a=s.next().charAt(0);
      if(a>=65 && a<97)
      {
        System.out.println((char)(a+32));
      }
      else
      {
        System.out.println((char)(a-32));
      }
      s.close();
    }
  }
