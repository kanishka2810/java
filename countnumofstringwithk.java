import java.util.Arrays;
public class countnumofstringwithk {
     public static void main(String[] args)
    {
        String str = "abcbaa";
        int k = 2;//substrings with exactly 3 distinct characters
        int res = 0;
        int n = str.length();
        boolean a[] = new boolean[26];
        for (int i = 0; i < n; i++)
        {
            int Count = 0;
            Arrays.fill(a, false);
            for (int j=i; j<n; j++)
            {
                if (!a[str.charAt(j) - 'a'])
                    Count++;
                a[str.charAt(j) - 'a'] = true;
                if (Count == k)
                    res++;
            }
        }
        System.out.println("Result " +res);
                           
    }
}