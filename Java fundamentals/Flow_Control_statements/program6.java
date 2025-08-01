import java.util.*;
public class program6
  {
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      char a=s.next().charAt(0);
      if(a>='a' || a>='A'&& a<='z'|| a<=='Z')
      {
        System.out.println("Alaphabet");
      }
      else if(a>='0' && a<='9')
      {
        System.out.println("Digit");
      }
      else
      {
        System.out.println("Special Character");
      }
    }
  }
        
