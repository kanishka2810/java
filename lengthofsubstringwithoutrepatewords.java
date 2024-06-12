public class lengthofsubstringwithoutrepatewords 
{
    public static void main(String[] args)
    {
        String str = "rabcabyua";
        int n = str.length();
        int res = 0;
        for (int i = 0; i < n; i++) 
        {
            boolean[] s = new boolean[256];
            for (int j = i; j < n; j++) 
            {
                if (s[str.charAt(j)] == true)
                    break;
                else 
                {
                    res = Math.max(res, j - i + 1);
                    s[str.charAt(j)] = true;
                }
            }
            s[str.charAt(i)] = false;
        }
        System.out.println(res);
    }
}