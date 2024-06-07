public class maxsumintwoarray {
    
	public static void main(String[] args) 
	{ 
		int ar1[] = { 2, 3, 7, 10, 12, 15, 30, 34 }; 
		int ar2[] = { 1, 5, 7, 8, 10, 15, 16, 19 }; 
		int m = ar1.length; 
		int n = ar2.length; 
		int i = 0, j = 0; 
		int result = 0, sum1 = 0, sum2 = 0;  
		while (i < m && j < n) { 
			if (ar1[i] < ar2[j]) 
				sum1 += ar1[i++]; 
			else if (ar1[i] > ar2[j]) 
				sum2 += ar2[j++]; 
			else { 
				result += Math.max(sum1, sum2) + ar1[i]; 
				sum1 = 0; 
				sum2 = 0; 
				i++; 
				j++; 
			} 
		} 
		while (i < m) 
			sum1 += ar1[i++]; 
		while (j < n) 
			sum2 += ar2[j++]; 
		result += Math.max(sum1, sum2); 
		System.out.println( "Maximum sum path is :"+result); 
	} 
		 

} 
