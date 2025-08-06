import java.util.Scanner;
public class program1
  {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String str=s.toLowerCase();
        int l= 0;
        int r=str.length() - 1;
        boolean ans=true;
        while (l<r) 
        {
            if (str.charAt(l)!=str.charAt(r))
            {
                ans=false;
                break;
            }
            l++;
            r--;
        }
        if (ans) 
        {
            System.out.println("It is a Palindrome");
        } 
        else
        {
            System.out.println("It is not a Palindrome");
        }
        sc.close();
    }
  }
