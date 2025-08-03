import java.util.Optional;
public class program2
  {
    public static void main(String args[])
    {
      String address=null;
      System.out.println("Address:"+Optional.ofNullable(address).orElse("India"));
    }
  }
