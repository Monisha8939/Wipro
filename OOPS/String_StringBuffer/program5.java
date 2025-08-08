import java.util.Scanner;
public class program5
{
    public static void main(String[] args) 
  {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int len=str.length();
        String res=str.substring(1, len - 1);
        System.out.println(res);
        sc.close();
    }
}
