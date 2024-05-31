
import java.util.Scanner;

public class automorphicnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        int square=num*num;
        int flag=0;
        while(num>0)
        {
            if(num%10!=square%10)
            {
                System.out.println("Not Automorphic");
                flag=0;
                break;
            }
            else{
                flag=1;
            }
            num=num/10;
            square=square/10;
            //flag=1;
        }
        if(flag==1)
            System.out.println(" Automorphic");
        //else
          //  System.out.println("automorphic");
    }
}
