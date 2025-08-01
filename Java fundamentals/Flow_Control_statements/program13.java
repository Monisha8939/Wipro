import java.util.Scanner;
public class program13
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int n=s.nextInt();
      int sum=0;
      while(n>0){
        int d=n%10;
        sum+=d;
        n/=10;
      }
      System.out.println(sum);
    }
  }
