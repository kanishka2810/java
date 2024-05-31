
class vowelconsonateinastring
{
    public static void main(String[] args) {
        int vowel=0,cons=0;
        String s="Kanishka Khandelwal";
        s=s.toLowerCase();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='a' || s.charAt(i)=='e' ||s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u')
                {vowel++;}
            else 
            {
                if(s.charAt(i)>='a' && s.charAt(i)<='z')
                    cons++;
            }
        }
        System.out.println(vowel++);
        System.out.println(cons++);
    }
}