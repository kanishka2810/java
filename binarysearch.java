public class binarysearch {
    int bsearch(int a[], int start, int end, int x)
	{
		while (start <= end) 
		{
			int mid = (start + end) / 2;
			if (a[mid] == x) 
			{
				return mid;
			} 
			else if (a[mid] > x) 
			{
				end = mid - 1;
			} 
			else 
			{
			    start = mid + 1;
			} 
		}
		return -1;
	}
	public static void main(String args[])
	{
	    binarysearch ob = new binarysearch();

		int a[] = {2,4,5,33,35,67,89,100,335,354};
		int n = a.length;
		int x = 908;
		int result = ob.bsearch(a, 0, n - 1, x);

		if (result == -1)
			System.out.println("not found");
		else
			System.out.println("found at index "+ result);
							
	}
}
