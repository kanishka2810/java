public class tranposematrix {
    public static void main(String[] args) {
        int a[][]={{1,2,3},{4,5,6},{7,8,9}};
        int b[][]=new int [3][3];
        System.out.print("array element:");
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                System.out.print(a[i][j]+"");
            }
            System.out.println("\n");
        }
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                b[j][i]=a[i][j];
            }

        }
        System.out.print("array element after transpose:");
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                System.out.print(b[i][j]+"");
            }
            System.out.println("\n");
        }
        
    }
}
