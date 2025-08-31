import java.util.Scanner;
class Box {
    double w, h,b;
    Box(double width, double height, double breadth) 
  {
         w=width;
         h=height;
         b=breadth;
    }
   public static double volume() 
  {
        return  w*h*b;
    }
}

 public class Main
  { 
    public static void main(String[] args)
  {
        Scanner sc=new Scanner(System.in);
        double w=sc.nextDouble();
        double h=sc.nextDouble();
        double b=sc.nextDouble();
        Box box=new Box(w,h,b);
        System.out.println(box.volume());
        sc.close();
   }
}
