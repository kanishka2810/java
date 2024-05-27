import java.util.Scanner;
class plindromenum
{
    public static void main(String[] args)
    {
        int modul,save=0;
        System.out.println("Enter a number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int realnumber=n;
        while(n!=0)
        {
            modul=n%10;
            save=save*10+modul;
            n=n/10;
        }
        if(realnumber==save)
            System.out.println("Number is palindrome");
        else
            System.out.println("Number is not palindrome");
    }
}