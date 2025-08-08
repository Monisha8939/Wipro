import java.util.Scanner;
public class program6
  {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        String result;
        if (str1.length()<str2.length()) 
        {
            res=str1+str2+str1;
        }
        else 
        {
            res=str2+str1str2;
        }
        System.out.println(res);
        sc.close();     
    }
}
