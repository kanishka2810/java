import java.math.BigInteger;

public class sumoftwolargernuminstring {
    public static void main(String[] args) {
        String s="638721092378739801082";
        String s2="8287310992740911827894";
        BigInteger b=new BigInteger(s);
        BigInteger b2=new BigInteger(s2);
        BigInteger res=b.add(b2);
        System.out.println("Result is"+res);
    }
}
