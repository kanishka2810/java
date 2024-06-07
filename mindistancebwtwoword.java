public class mindistancebwtwoword {
    public static void main(String[] args) {
        String[] s={"kanishka","name","yashi","anshika","nikita"};
        String word="kanishka";
        String word2="nikita";
        int ans=Integer.MAX_VALUE;
        int a=-1,b=-1;
        for (int i = 0; i < s.length; i++) {
            if(s[i]==word)
                a=i;
            if(s[i]==word2)
                b=i;
            if(a!=-1 && b!=-1)
                ans=Math.min(ans,(Math.abs(a-b)));
        }
        System.out.println(ans);
    }
}
