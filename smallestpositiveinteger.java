import java.util.Arrays;

public class smallestpositiveinteger {
    public static void main(String[] args) {
        //int flag=0;
		int a[] = {2, 3, 4, 5};
		int n = a.length;
		int res = 1; 
		Arrays.sort(a);
		for (int i = 0; i < n; i++)
		{
		if(a[i] > res)
        {
			break;
		}
		else
        {
			res+=a[i];
		}
		}
			
		System.out.println(res);
    }
}
