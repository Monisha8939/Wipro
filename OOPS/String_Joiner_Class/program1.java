import java.util.Scanner;
public class program1
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      ArrayList<String>arr=new ArrayList<>();
      for(int i=0;i<n;i++)
        {
          arr.add(sc.nextLine());
        }
       StringJoiner sj = new StringJoiner(",", "{", "}");
        for (String name : arr) {
            sj.add(name);
        }
      System.out.println(sj.toString());
      sc.close();
    }
}
