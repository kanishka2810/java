public class LargestSumContiguousSubarray {
    public static void main(String[] args)
    {
        int[] a = { -2, -3, 4, -1, -2, 1, 5, -3 };
        int n = a.length;
        int max = Integer.MIN_VALUE, maxend= 0;
        for (int i = 0; i < n; i++) {
            maxend = maxend + a[i];
            if (max < maxend)
                max = maxend;
            if (maxend < 0)
                maxend = 0;
        }
       System.out.println("Maximum contiguous sum is "
                           + max);
    }
}
