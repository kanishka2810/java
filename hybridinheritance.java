class hybridinheritance {
    public static void main(String[] args)
    {
        Child ob1 = new Child();
        ob1.display();
        ob1.show();
        
        subchild ob2 = new subchild();
        ob2.view();
        ob2.show();
    
        newchild ob3=new newchild();
        ob3.look();
        ob3.display();
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

class subchild extends Parent
{
    public void view()
    {
        System.out.println("2nd Child class");
    }
}
class newchild extends Child
{
    public void look()
    {
         System.out.println("subclass class of child class");
    }
}