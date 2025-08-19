import java.util.Scanner;
public class program9
  {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String b=sc.nextLine();
        StringBuilder res=new StringBuilder();
        int maxlen=Math.max(a.length(),b.length());
       for (int i=0;i<maxlen;i++)
         {
            if (i<a.length())
            {
                res.append(a.charAt(i));
            }
            if (i < b.length()) 
            {
                res.append(b.charAt(i));
            }
        }
      System.out.println(res.toString());
      sc.close();
    }
}
