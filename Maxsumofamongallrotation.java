public class Maxsumofamongallrotation {
    public static void main(String[] args) {
        int a[]={8,9,10,11};
        int n=a.length;
        int res=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            int sum=0;
            for(int j=0;j<n;j++)
            {
                int sum2=(i+j)%n;
                sum=sum+j*a[sum2];
            }
            res=Math.max(sum,res);
        }
        System.out.println(res);
    }
}
