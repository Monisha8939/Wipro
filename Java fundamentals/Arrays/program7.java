import java.util.*;
public class program7
{
    public static void main(String[] args)
  {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
          {
            arr[i]=sc.nextInt();
          }
        Set<Integer> s=new LinkedHashSet<>();
        for (int num:arr)
          {
            s.add(num);   
        }
        for (int num:s) 
        {
            System.out.print(num +" ");
        }
    }
}
