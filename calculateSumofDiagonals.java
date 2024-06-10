public class calculateSumofDiagonals  {
    static public void main(String[] args)
	{
		int[][] a = { {1,2,3 },
                      {4,5,6},
                      {7,8,9}};
		int d = 0, Sd = 0;
		int n=a.length;
		for (int i = 0; i < n; i++) 
        { 
			for (int j = 0; j < n; j++) 
            { 
				if (i == j) 
					d += a[i][j]; 
				if ((i + j) == (n - 1)) 
					Sd += a[i][j]; 
			} 
		} 
		System.out.println("Sum of Principal Diagonal:"+ d); 
		System.out.println("Sum of Secondary Diagonal:"+ Sd); 
						
	} 
}
