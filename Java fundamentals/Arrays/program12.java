import java.util.Scanner;
public class program12
  {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int[] a=new int[3];
        int[] b=new int[3];
        for(int i=0;i<3;i++)
        {
            a[i] = sc.nextInt();
        }
       for(int i=0;i<3;i++) 
       {
            b[i]=sc.nextInt();
        }
     System.out.print(a[1]+" "+b[1]);
     sc.close();
    }
}
