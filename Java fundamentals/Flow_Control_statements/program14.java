import java.util.Scanner;
public class program14
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int n=s.nextInt();
      for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
          System.out.print("* ");
        }
        System.out.println();
      }
      sc.close();
    }
  }
