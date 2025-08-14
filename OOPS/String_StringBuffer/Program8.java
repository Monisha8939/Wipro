import java.util.Scanner;
public class program8
  {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder res=new StringBuilder();
        int len=str.length();
        for (int i=0;i<len;i++) 
        {
            if (str.charAt(i)=='*'|| (i>0 && str.charAt(i-1)=='*') || (i<len-1 && str.charAt(i+1)=='*'))
            {
                continue;
            }
            res.append(str.charAt(i));

        }
       System.out.println(res.toString();
       sc.close();
    }
}
