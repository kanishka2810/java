public class frequencyofcharacters {
    public static void main(String[] args) {
        String s="Kanishka Khandelwal";
        int freq[]=new int[s.length()];
        int i,j;
        char str[]=s.toCharArray();
        for(i=0;i<s.length();i++)
        {
            freq[i]=1;
            for(j=i+1;j<s.length();j++)
            {
                if(str[i]==str[j])
                {
                    freq[i]++;
                    str[j]='0';
                }
            }
        } 
        for(i=0;i<freq.length;i++)
        {
            if(str[i]!=' ' && str[i]!='0')
            {
                System.out.println(str[i]+"="+freq[i]);
            }
        }
    }
}
