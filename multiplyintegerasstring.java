
import java.math.BigInteger;

public class multiplyintegerasstring {
    public static void main(String[] args) {
        String s="1235421415454545454545454544";
        String s1="1714546546546545454544548544544545";

        BigInteger b=new BigInteger(s);
        BigInteger b2=new BigInteger(s1);

        BigInteger res=b.multiply(b2);

        System.out.println("Result is:"+res);
    }
}
