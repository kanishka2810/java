
import java.util.Scanner;

public class automorphicnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        int square=num*num;
        while(num>0)
        {
            if(num%10!=square%10)
                System.out.println("Not equal");
            num=num/10;
            square=square/10;
        }
        System.out.println("Automorphic");
    }
}
