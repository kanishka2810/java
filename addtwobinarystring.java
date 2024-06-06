public class addtwobinarystring {
    public static void main(String[] args) {
        String s="110";
        String s2="1001";
        int a = s.length()-1;
		int b = s2.length()-1;
		int carry = 0;
		int sum = 0;
		StringBuilder res = new StringBuilder();
		while(a>=0 || b>=0 || carry == 1){
			sum = carry;
			if(a>=0) sum = sum+s.charAt(a)-'0';
			if(b>=0) sum = sum+s2.charAt(b)-'0';
			res.append((char)(sum%2+'0'));
			carry = sum/2;
			a--;
			b--;
		}
		System.out.print(res.reverse().toString());
    }
}
