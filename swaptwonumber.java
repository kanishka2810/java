import java.util.Scanner;

public class swaptwonumber {
    public static void main(String[] agrs)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of a");
        int a=sc.nextInt();
        System.out.println("Enter value of b");
        int b=sc.nextInt();
        System.out.println("value of a and b before change"+"a is"+a+"b is"+b);
        int temp=a;
        a=b;
        b=temp;
        System.out.println("value of a and b after change"+"a is"+a+"b is"+b);
    }
}
