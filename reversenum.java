import java.util.Scanner;
class reversenum
{
    public static void main(String[] args)
    {
        int modul,save=0;
        System.out.println("Enter a number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n!=0)
        {
            modul=n%10;
            save=save*10+modul;
            n=n/10;
        }
        System.out.println("the reverse number is"+save);
    }
}