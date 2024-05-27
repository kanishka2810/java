import java.util.Scanner;
class switchcase
{
    public static void main(String[] agrs)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of a");
        int a=sc.nextInt();
        System.out.println("Enter value of b");
        int b=sc.nextInt();
        System.out.println("Enter your choice");
        System.out.println("1.Addition ,2.Subtraction ,3.Multiplication ,4.Division ,5.Modul");
        int ch=sc.nextInt();
        switch(ch)
        {
            case 1: 
                int sum=a+b;
                System.out.println("Sum is:"+ sum);
                break;
             
            case 2:
                int sub=a-b;
                System.out.println("Subtraction is:"+ sub);
                break;
            
            case 3:
                int multi=a*b;
                System.out.println("Multiplication is:"+ multi);
                break; 
                
            case 4:
                int div=a/b;
                System.out.println("Division is:"+ div);
                break;
            
            case 5:
                int mod=a%b;
                System.out.println("modul is:"+ mod);
                break;
                
            default:
                System.out.println("Enter right choice");
        }
    }
}
 
