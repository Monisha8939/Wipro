import java.util.Scanner;
public class program10
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
      int[] res=new int[n];
      int e=0;
      int o=n-1;
      for(int i=0;i<n;i++)
        {
          if(arr[i]%2==0)
          {
            res[e++]=arr[i];
          }
          else{
            res[o--]=arr[i];
          }
        }
      for(int i=0;i<n;i++){
      System.out.println(res[i]);
      }
      sc.close();
    }
  }
