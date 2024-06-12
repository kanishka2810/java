import java.util.Arrays;

public class missingandreapting {
    public static void main(String[] args) {
        int[] arr = {1,3,3,2,4,5};
        int n = arr.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    System.out.println("reapting number is:"+arr[i]);
                }
            }
        }
        Arrays.sort(arr);
        if (arr[0]!=1)
        {
            System.out.println("missing number is "+ 1 + ".");
        }
        else if (arr[n-1]!=n)
        {
            System.out.println("missing number is "+ n + ".");
        }
        else
        {
            for(int i=0; i<n;i++)
            {
                if (i+1!=arr[i])
                {
                    int ans = arr[i]-1;
                    System.out.println("missing number: "+ans);
                    break;
                }
            }
        }
    }
}
