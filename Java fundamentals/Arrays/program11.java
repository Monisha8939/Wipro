import java.util.Scanner;
public class program11
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int n=s.nextInt();
      int[] arr=new int[n];
      boolean ans=true;
      for(int i=0;i<n;i++)
        {
          arr[i]=sc.nextInt();
        
      if(arr[i]!=1 && arr[i]!=4)
      {
        ans=false;
      }
        }
      System.out.println(ans);
      sc.close();
    }
  }
