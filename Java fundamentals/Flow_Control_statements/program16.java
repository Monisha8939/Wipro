import java.util.Scanner;
public class program16
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int original=n;
      int rev=0;
      while(n!=0){
        int d=n%10;
        rev=rev*10+d;
        n/=10;
      }
      if(original==rev){
        System.out.println("Palindrome");
      }
      else{
        System.out.println("Not Palindrome");
      }
      sc.close();
    }
  }
    
