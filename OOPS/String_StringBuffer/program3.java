import java.util.Scanner;
public class program3
{
    public static void main(String[] args) 
  {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int len=str.length();
        String ans;
        ans=str.substring(0, 2);
        String res= "";
        for (int i=0;i<len;i++)
          {
            res+=ans;
        }
      System.out.println(res);
      sc.close();
    }
}
