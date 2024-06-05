public class MaximumProductSubarray {
    public static void main(String[] args) {
        int a[]={1, -2, -3, 0, 7, -8, -2};
        int result=a[0];
        int n=a.length;
        for(int i=0;i<n;i++)
        {
            int mul=a[i];
            for(int j=i+1;j<n;j++)
            {
                result=Math.max(result,mul);
                mul=mul*a[j];
            }
            result=Math.max(result,mul);
        }
        System.out.println("Maximum product is"+result);
    }
}
