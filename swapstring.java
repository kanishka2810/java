public class swapstring {
    public static void main(String[] args) {
        String s="kanishka";
        String st="khandelwal";
        System.out.println("value before swap s is:"+s+" "+"and st is:"+st);
        s=s+st;
        st=s.substring(0,s.length()-st.length());
        s=s.substring(st.length());
        System.out.println("value after swap s is:"+s+" "+"and st is:"+st);
        
    }
}
