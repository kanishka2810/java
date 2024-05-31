import java.util.Scanner;
public class exceptionhandling {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of a");
        int a=sc.nextInt();
        System.out.println("Enter value of b");
        int b=sc.nextInt();
        int c;
        try 
        {
                c=a/b;
        } 
        catch (ArithmeticException e) {
            System.out.println("Divided by zero error");
        }
        //System.out.println(c);
    }
}
