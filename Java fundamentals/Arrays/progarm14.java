public class program14
{
    public static void main(String[] args)
  {
        if(args.length!=9)
        {
            System.out.println("Required 9 argumnets");
            return;
        }
       int[][] arr=new int[3][3];
       int k=0;
       int max=Integer.MIN_VALUE;
       for(int i=0;i<3;i++) 
       {
            for(int j=0;j<3;j++)
              {
                arr[i][j]=Integer.parseInt(args[k++]);
                if(arr[i][j]>max)
                {
                    max=arr[i][j];
                }
            }
            System.out.println();
        }
      System.out.println(max);
      sc.close();
    }
}
