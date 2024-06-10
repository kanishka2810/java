public class bubblesort {
    public static void main(String[] args)
    {
        int a[]={0,1,22,234,444,4444};
        int n=a.length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    int tem=a[j];
                    a[j]=a[j+1];
                    a[j+1]=tem;
                }
            }
            System.out.println(a[i]);
        }
        
    }
}
