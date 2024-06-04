public class stringpalindromornot {
    public static void main(String[] args) {
        {
            String str="aab";
            String temp="";
            int flag=0;
            for(int i=str.length()-1;i>=0;i--)
            {
                temp=temp+str.charAt(i);
            }
            if(str.equals(temp)){
                flag=1;  
            }
            if(flag==1)
                System.out.println("palindrom");
            else
                System.out.println("no palindrom");
        }
    }
}
