import java.util.Scanner;
class primenum {
    public static void main(String[] args) {
        int flag=0;
        System.out.println("Try programiz.pro");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
            for(int i=2;i<=n/2;++i)
            {
                if(n%i==0)
                {
                    flag=1;
                    break;
                }
            }
    
        if(flag==0)
            System.out.println("prime number");
        else
            System.out.println("not prime number");
        
    }
}