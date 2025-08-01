import java.util.Scanner;
import java.util.Arrays;
public class program5
  {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++)
        {
            arr[i]=sc.nextInt();
        }
       Arrays.sort(arr); 
       System.out.println("Two smallest numbers:"+arr[0]+"and"+arr[1]);
       System.out.println("Two largest numbers:"+arr[n-2]+"and"+arr[n - 1]);
       sc.close();
    }
}
