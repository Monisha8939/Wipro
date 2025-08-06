import java.util.Scanner;
import java.util.StringJoiner;
public class program2.java
  {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        StringJoiner s1=new StringJoiner("-", "[", "]");
        s1.add(sc.nextLine());
        s1.add(sc.nextLine());
        StringJoiner s2=new StringJoiner("-", "{", "}");
        s2.add(sc.nextLine());
        s2.add(sc.nextLine());
        StringJoiner merge1 = new StringJoiner("-", "{", "}");
        merge1.add(s2.toString().replace("{", "").replace("}", ""));
        merge1.add(s1.toString().replace("[", "").replace("]", ""));
        System.out.println(merge1);
        StringJoiner merge2 = new StringJoiner("-", "[", "]");
        merge2.add(s1.toString().replace("[", "").replace("]", ""));
        merge2.add(s2.toString().replace("{", "").replace("}", ""));
        System.out.println(merge2);
        sc.close();
    }
  }
