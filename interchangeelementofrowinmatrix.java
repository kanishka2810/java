public class interchangeelementofrowinmatrix {
    public static void main(String args[])
	{
		int a[][] = { {2,8,1,0},
						{ 1,1,1,0 },
						{ 0,6,0,2},
						{ 0,9,0,3 } };
		System.out.println("Input matrix is: ");
		for (int j = 0; j < a.length; j++) 
		{
			for (int k = 0; k < a[0].length; k++)
			    System.out.print(a[j][k] + " ");
			System.out.println();
		}	
		int res = a.length;
		
		for (int j = 0; j < a[1].length; j++) 
		{
		    
			int temp = a[1][j];
			a[1][j] = a[res - 2][j];
			a[res - 2][j] = temp;
		}	
		System.out.println("Output matrix is: ");
		for (int j = 0; j < a.length; j++) 
		{
			for (int k = 0; k < a[0].length; k++)
				System.out.print(a[j][k] + " ");
			System.out.println();
		}
	}
}
