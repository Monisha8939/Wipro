import java.util.Scanner;
public class program5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char a=sc.next().charAt(0);
        char b=sc.next().charAt(0);
        if(a<b)
        {
            System.out.print(a+","+b);
        }
        else{
            System.out.print(b+","+a);
        }
        sc.close();
    }
}
