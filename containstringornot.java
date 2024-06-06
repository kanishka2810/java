public class containstringornot {
    public static void main(String[] args) {
        String s="kanishka";
        String s2="yashi";
        s=s.toLowerCase();
        s2=s2.toLowerCase();
        if(s.contains(s2))
        {
            System.out.println("Substring");
        }
        else
            System.out.println("no");
    }
}
