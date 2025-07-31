public class program1
  {
    public static void main(String args[])
    {
      int a=Integer.parseInt(args[0]);
      if(a<0)
      {
        System.out.println("The number is negative");
      }
      else if(a==0)
      {
        System.out.println("The number is zero");
      }
      else
      {
        System.out.println("The number is positive");
      }
    }
  }
