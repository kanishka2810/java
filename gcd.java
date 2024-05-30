public class gcd {
    public static void main(String[] args) {
        int x=12;
        int g=1;
        int y=8;
        for(int i=1;i<=x;i++)
       {
            for(int j=i;j<=y;j++)
            {
                if(x%i==0 && y%i==0)
                g=i;
                
            }
        }
        System.out.println("gcd is:"+g);
    }
}
