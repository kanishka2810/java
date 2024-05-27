import java.util.Scanner;
class armstrongnum
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
            save=save+(modul*modul*modul);
            n=n/10;
        }
        if(realnumber==save)
            System.out.println("Number is armstrong");
        else
            System.out.println("Number is not armstrong");
    }
}