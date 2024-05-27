public class superkeyword {
    public static void main(String[] args) {
        parent ob=new child();
        ob.view();
    }
}
class parent
{
    public void view()
    {
        System.out.println("Parent");
    } 
}
class child extends parent
{
    public void view()
    {
        super.view();
        System.out.println("child");
    }
}