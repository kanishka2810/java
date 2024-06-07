public class sbsetofanotherarray 
{
    public static void main(String args[])
    {
        int a[] = { 28,10,20,02 };
        int a2[] = { 20 };
        int m = a.length;
        int n = a2.length;
        int i = 0;
        int j = 0;
        int flag=0;
        for (i = 0; i < n; i++) 
        {
            for (j = 0; j < m; j++)
                if (a2[i] == a[j])
                    break;
                if (j == m)
                    flag=1;
        }
        if(flag==1)
            System.out.print("is not a subset ");
        else
            System.out.print("is a subset ");
    }
}