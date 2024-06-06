public class panagramstring {
    public static void main(String[] args) {
        String s="The quick brown fox jumps over the lazy dog"; //String is panagrm because it contain a-z alphabets
      //  String s="Kanishka"; // String is not panagram because it not contain a-z alphabets
        s=s.toLowerCase();
        for(char c='a';c<='z';c++)
        {
            if(s.indexOf(c)==-1)
            {
                System.out.println("String is not panagram string");
                return;
            }
        }
        System.out.println("String is panagram");
    }
}
