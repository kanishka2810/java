public class quicksort {
    public static void main(String args[])
	{
		int a[] ={82,0,34,53,124,13,343,13,1,6,3};
		int n = a.length;

		QuickSort2 ob = new QuickSort2();
		ob.sort(a, 0, n-1);

		for (int i=0; i<n; ++i)
			System.out.print(a[i]+" ");
		System.out.println();
	}

    void sort(int a[], int l, int h)  //l=low,h=high
	{ 
		if (l < h)
		{
			int pi = partition(a, l, h);
			sort(a, l, pi-1);
			sort(a, pi+1, h);
		}
	}
	int partition(int a[], int l, int h)
	{
		int pivot = a[h]; 
		int i = (l-1);
		for (int j=l; j<h; j++)
		{
			if (a[j] <= pivot)
			{
				i++;
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
		int temp = a[i+1];
		a[i+1] = a[h];
		a[h] = temp;

		return i+1;	
    }
}