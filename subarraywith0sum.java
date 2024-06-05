public class subarraywith0sum {
    public static void main(String[] args) 
    {
        int a[]= {4, 2, 1, 6,-1,-4,7,0,-6,-2};
        int n=a.length;
        int flag=0;
        for(int i=0;i<n;i++)
        {
            int sum=0;
            for(int j=i;j<n;j++)
            {
                sum=sum+a[j];   
                if(sum==0)
                {
                System.out.println("Subarray is:"+i+" "+j); 
                flag=1;
                }
            }
        }
        if(flag==0)
        {
            System.out.println("no substring");
        }
    }
    
}
