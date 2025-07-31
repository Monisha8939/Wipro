public class program2
  {
    public static void main(String args[])
    {
      if(args.length!=1){
        System.out.println("One argument is required");
        return;
      }
      System.out.println("Welcome"+" "+args[0]);
    }
  }
