class reversestring
{
    public static void main(String[] args) {
        String s="kanishka";
        String st="";
            for(int i=0;i<s.length();i++)
                st=s.charAt(i)+st;
            System.out.println(st);
    }
}