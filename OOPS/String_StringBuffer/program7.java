import java.util.Scanner;
public class program7
{
    public static void main(String[] args) 
  {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int len = str.length();
       if (len>=2 && str.charAt(0)=='x' && str.charAt(len - 1)=='x') 
       {
            String res= str.substring(1, len - 1);
            System.out.println(res);
        } 
       else 
       {
            System.out.println(str);
        }
       sc.close();
    }
}
