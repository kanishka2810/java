public class swaptwovaluesusingbitwiseoperator {
    public static void main(String[] args) {
        int a=638,b=37128;
        System.out.println("Value before swap a is:"+a+" ,b is:"+b);
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("vale after swap a is:"+a+" ,b is:"+b);
    }
}
