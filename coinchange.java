public class coinchange 
{
    public static void main(String[] args) 
    {
        int coins[] = { 1, 2, 3 };
		int n = coins.length;
		int sum = 5;
	    int a[] = new int[sum + 1];
	    a[0] = 1;
	    for (int i = 0; i < n; i++)
		    for (int j = coins[i]; j <= sum; j++)
			    a[j] += a[j - coins[i]];

	    System.out.println(a[sum]);
    }
}
