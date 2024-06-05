
import java.util.Arrays;

public class LongestConsecutiveSubsequence {
    public static void main(String[] args) {
        int a[]={1,60,32,2,4,23,97,3,33,5};
        int n=a.length;
        Arrays.sort(a);
        int max_len=1,current_len=1;
        for(int i=1;i<n;i++)
        {
            if(a[i]!=a[i-1])
            {
                if(a[i]==a[i-1]+1)
                {
                    current_len++;
                }
                else
                {
                    max_len=Math.max(max_len,current_len);
                    current_len=1;
                }
            }
        }
        System.out.println(max_len);
    }
}
