import java.util.Scanner;
public class program10
  {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int n=sc.nextInt();
        String s= str.substring(str.length()-n);
        StringBuilder res=new StringBuilder();
       for (int i = 0; i < n; i++) {
            res.append(s);
        }
       System.out.println(res.toString());
       sc.close();
    }
}
