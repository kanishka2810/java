public class overriding {
    public static void main(String[] args)
    {
        A ob=new A();
        ob.f1();
        
        A ob1 = new B();
        ob1.f1();
        
    }
}
class A
{
    public void f1()
    {
        System.out.println("A");
         
    }
}
class B extends A
{
    public void f1()
    {
        System.out.println("B");
    }
}