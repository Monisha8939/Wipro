import java.util.Scanner;
public class program4
  {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in); 
        String str=sc.nextLine();
        int len = str.length();
        if (len % 2 == 0)
        {
            String ans= str.substring(0, len/2);
            System.out.println(ans);
        } 
        else
        {
            System.out.println("null");
        }
        sc.close();
    }
}
