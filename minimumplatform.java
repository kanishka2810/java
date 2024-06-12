public class minimumplatform {
    public static void main(String[] args)
    {
        int arr[] = { 100, 300, 500 }; 
		int dep[] = { 900, 400, 600 }; 
		//int n = 3; 
		int platform , res = 1; 
		for (int i = 0; i < arr.length; i++) 
        { 
			platform = 1; 
			for (int j = 0; j < arr.length; j++) 
            { 
				if (i != j) 	
					if (arr[i] >= arr[j] 
						&& dep[j] >= arr[i]) 
						platform++; 
			} 
			res = Math.max(res, platform); 
		} 
        System.out.println(res); 
    }
}