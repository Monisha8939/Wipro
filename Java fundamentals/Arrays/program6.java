import java.util.*;
public class program6
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      for(int i=0;i<n;i++)
        {
          arr[i]=sc.nextInt();
        }
      Arrays.sort(arr);
      for(int arr1:arr)
        {
          System.out.println(arr1+" ");
        }
      sc.close();
    }
  }
