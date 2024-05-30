public class matrixsubtraction {
    public static void main(String[] args) {
        int a[][]={{1,2},{4,5}};
        int b[][]={{1,2},{4,5}};
        int c[][]=new int [2][2];
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<b.length;j++)
            {
               c[i][j]=a[i][j]-b[i][j];
            }
        }
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<b.length;j++)
            {
                System.out.print(+c[i][j]+" ");
            }
            System.out.println("\n");
        }
    }
}