public class program13
{
    public static void main(String[] args) 
  {
        if (args.length!=4)
        {
            System.out.println("Required 4 Arguments");
            return;
        }
       int[][] arr = new int[2][2];
       int k = 0;
       for(int i=0;i<2;i++)
         {
            for(int j=0;j<2;j++) 
            {
                arr[i][j]=Integer.parseInt(args[k++]);
            }
        }
        for(int i=1;i>=0;i--) 
        {
            for(int j=1;j>=0;j--) 
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
       sc.close();
    }
}
