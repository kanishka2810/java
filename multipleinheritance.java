class multipleinheritance {
     public static void main(String[] args)
    {
        Parent ob=new Parent();
        ob.show();
        ob.display();
    }
}
interface i1
{
    public void show();
}
interface i2
{
    public void display();
}

class Parent implements i1,i2
{
    public void show()
    {
        System.out.println("interface 1");
    }
    public void display()
    {
         System.out.println("interface 2");
    }
}