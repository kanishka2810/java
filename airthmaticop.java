import java.util.Scanner;
class airthmeicop
{
    public static void main(String[] agrs)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of a");
        int a=sc.nextInt();
        System.out.println("Enter value of b");
        int b=sc.nextInt();
        //sum of 2 no
        int sum =a+b;
        System.out.println("Sum is:"+sum);
        //mul of 2 no
        int multi =a*b;
        System.out.println("Muli[lication is:"+multi);
        //subtraction
        int sub =a-b;
        System.out.println("Subraction is:"+sub);
        //Division of 2 no
        int division =a/b;
        System.out.println("Division is:"+division);    
    }
}