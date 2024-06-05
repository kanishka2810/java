public class MinimumProductSubarray {
    public static void main(String[] args) {
        int a[]={1, -2, -3, 0, 7, -8, -2};
        int n=a.length;
        int result=a[0];
        for(int i=0;i<n;i++)
        {
            int mul=a[i];
            for(int j=i+1;j<n;j++)
            {
                result=Math.min(result,mul);
                mul=mul*a[j];
            }
            result=Math.min(result,mul);
        }
        System.out.println("Minimum product is:"+result);
    }
}
