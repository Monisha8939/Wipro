import java.util.Scanner;
public class program2
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
      int max=arr[0];
      int min=arr[0];
      for(int i=1;i<arr.length;i++)
        {
          if(arr[i]>max)
          {
            max=arr[i];
          }
          if(arr[i]<min){
            min=arr[i];
          }
        }
      System.out.println("Maximum "+max);
      System.out.println("Minimum "+min);
      sc.close();
    }
  }
     
