import java.util.Scanner;
public class program8
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int[] arr=new int[n];
      for(int i=0;i<n;i++)
        {
          arr[i]=sc.nextInt();
        }
      boolean f=false;
      int sum=0;
      for(int num:arr){
        if(num==6)
        {
          f=true;
          continue;
        }
        if(num==7 && f)
        {
          f=false;
          continue;
        }
        if(!f)
        {
          sum+=num;
        }
      }
      System.out.println(sum);
      sc.close();
    }
  }
