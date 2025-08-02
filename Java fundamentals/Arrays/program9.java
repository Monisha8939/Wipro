import java.util.Scanner;
import java.util.Arrays;
public class program9
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int[] arr=new int[n];
      for(int i=0;i<arr.length;i++)
      {
        arr[i]=sc.nextInt();
      }
    Arrays.sort(arr);
    int[] res=new int[n];
    for(int i=0;i<n;i++)
      {
        if(arr[i]==10)
        {
          res[i]=0;
        }
        else{
          res[i]=arr[i];
        }
      }
      for(int i=0;i<n;i++){
        System.out.print(res[i]+" ");
      }
      sc.close();
    }
  }
        
          
