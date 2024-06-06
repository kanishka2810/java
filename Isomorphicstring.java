public class Isomorphicstring 
{
    public boolean Isomorphic(String s1, String s2) 
    {
        if (s1 == null || s2 == null || s1.length() != s2.length())
        {
            return false;
        }
        int[] a1 = new int[256];//we use 256 because we assume there is ASCII character 
        int[] a2 = new int[256];
        for (int i = 0; i < s1.length(); i++) 
        {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
      
            if (a1[c1] != a2[c2]) 
            {
                return false;
            }
      
            a1[c1] = i + 1;
            a2[c2] = i + 1;
        }
        return true;
    }
      
    public static void main(String[] args) 
    {  
        Isomorphicstring iso = new Isomorphicstring();
        System.out.println(iso.Isomorphic("abbcdd", "qwwcrr"));
        System.out.println(iso.Isomorphic("aab", "que"));
    }
}