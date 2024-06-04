import java.util.Arrays;
public class stringanagramornot {
    public static void main(String[] args) {
        char str[]={'k','a','n','s'};
        char st[]={'a','s','k','p'};
        int k=str.length;
        int k1=st.length;
        int flag=0;
        if(k!=k1)
            {flag=1;}
        Arrays.sort(str);
        Arrays.sort(st);
        for(int i=0;i<k;i++)
            if(str[i]!=st[i])
                flag=1;

        if(flag==1)
            System.out.println("no anagram");
        else
            System.out.println("anagram");
        }
}
