class multilevelinheritance
{
    public static void main(String[] args)
    {
        subchild ob2 = new subchild();
        ob2.show();
        ob2.display();
        ob2.view();
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

class subchild extends Child
{
    public void view()
    {
        System.out.println("2nd Child class");
    }
}