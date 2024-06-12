import java.util.Arrays;
public class Minimizethemaxdiffebwtheheight 
{
    public static void main(String[] args)
	{
		int[] a = {1, 15, 10};
		int k = 6;
		int n=a.length;

		Arrays.sort(a);
		int ans = a[n - 1] - a[0];
        
        int min, max;
		for (int i = 1; i < n; i++) 
        {
			if (a[i] - k < 0)
				continue;
			min = Math.min(a[0] + k, a[i] - k);
			max = Math.max(a[i - 1] + k, a[n - 1] - k);
			ans = Math.min(ans, max - min);
		}
		System.out.println(ans);
	}
}
