import java.util.Scanner;
class factorial
{
    public static void main(String[] agrs)
    {
        int fact=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        for(int i=1;i<=num;i++)
        {
            fact=fact*i;
        }
        System.out.println("factorial is"+ fact);
    }
}