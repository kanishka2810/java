class singleinheritace
{
    public static void main(String[] args)
    {
        Parent ob=new Parent();
        ob.show();
        
        Child ob1 = new Child();
        ob1.display();
        
    }
}
class Parent
{
    public void show()
    {
        System.out.println("Parent class ");
         
    }
}
class Child extends Parent
{
    public void display()
    {
        System.out.println("Child class");
    }
}