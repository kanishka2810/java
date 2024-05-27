class abstraction {
    public static void main(String[] args)
    {
        Child ob=new Child();
        ob.show();
        ob.display();
    }
}
abstract class Parent 
{
    public void show()
    {
        System.out.println("Show method");
    }
    public abstract void display();//abstract method with out defination
}
class Child extends Parent
{
    public void display()
    {
        System.out.println("Abstact method defination");
    }
    
}