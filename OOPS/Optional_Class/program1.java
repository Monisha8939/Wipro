import java.util.Optional;
public class program1
  {
    public static void main(String args[])
    {
      String name=null;
      int len=Optional.ofNullable(name).map(String::length).orElse(0);
      System.out.println(len);
    }
  }
