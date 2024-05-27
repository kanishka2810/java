public class overloading
{
    public static void main(String[] args)
    {
        A ob=new A();
        ob.f1(1);
        ob.f1(1,2);
        ob.f1(1.689);
        ob.f1(167890);
        ob.f1(1378296);
        
    }
}
class A
{
    public void f1(int a)
    {
        System.out.println(a);
         
    }
    public void f1(int a,int b)
    {
        System.out.println(a+b);
         
    }
    public void f1(float a)
    {
        System.out.println(a);
         
    }
    public void f1(double a)
    {
        System.out.println(a);
         
    }
    public void f1(long a)
    {
        System.out.println(a);
         
    }
}