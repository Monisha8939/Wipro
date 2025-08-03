class Calculator 
{
     public static int powerInt(int num1, int num2)
    {
        return (int) Math.pow(num1, num2);
    }
     public static double powerDouble(double num1, int num2) 
    {
        return Math.pow(num1, num2);
    }
}

public class Main
  {
    public static void main(String[] args)
  {
        Scanner sc=new Scanner(System.in);
        int ibase=sc.nextInt();
        int iexp=sc.nextInt();
        Calculator c=new Calculator();
        System.out.println(c.powerInt(ibase,iexp));
        double dbase=sc.nextDouble();
        int  dexp=sc.nextInt();
        System.out.println(c.powerDouble(dbase,dexp));
        sc.close();
   }
}
