import java.util.Scanner;
public class squarehollowpattern {
    public static void main(String[] arg)
    {
        int i,j;
        Scanner sc=new Scanner(System.in);
        System.err.println("Enter number of n");
        int n=sc.nextInt();
        System.err.println("Enter number of m");
        int m=sc.nextInt();
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                if(i==0 || j==0 || i==n-1 || j==m-1)
                    System.out.print("*");
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
    }
}