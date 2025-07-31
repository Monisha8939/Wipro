public class program 1{
  public static void main(String args[])
  {
    if(args.length !=2){
      System.out.println("Two arguments required");
      return;
    }
    String s1=args[0];
    String s2=args[1];
    System.out.println(s1+" technologies "+ s2);
  }
}
