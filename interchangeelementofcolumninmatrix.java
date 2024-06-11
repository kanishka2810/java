public class interchangeelementofcolumninmatrix {
    public static void main(String[] args)
	{
		int a[][] = { {2,8,1,0}, 
                      {0,6,0,2},
                      {0,9,0,3},
                      {1,1,1,0} };
		int n=4;
        System.out.println("input matrix is:");
		for (int j = 0; j < n; j++) 
		{
			for (int k = 0; k < n; k++)
			{
				System.out.print(a[j][k] + " ");
			}
			System.out.println();
		}
        for (int j = 0; j < n; j++) 
        {
			int temp = a[j][0];
			a[j][0] = a[j][n - 2];
			a[j][n - 2] = temp;
		}
		System.out.println("Output Matrix is: ");
		for (int j = 0; j < n; j++) 
		{
			for (int k = 0; k < n; k++)
				System.out.print(a[j][k] + " ");
			System.out.println();
		}
	}
}
