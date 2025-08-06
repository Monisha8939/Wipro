import java.util.Scanner;
public class program2
{
    public static void main(String[] args) 
  {
        Scanner sc=new Scanner(System.in);
        String str1 = sc.nextLine();
        str1=str1.toLowerCase();
        String str2 = sc.nextLine();
        str2=str2.toLowerCase();
        String res;
        
        if (!str1.isEmpty() && !str2.isEmpty() && str1.charAt(str1.length() - 1)==str2.charAt(0))
        {
          res=str1+str2.substring(1);
        } 
        else 
        {
            res=str1+str2;
        }
        System.out.println(res);
        sc.close();
    }
}
