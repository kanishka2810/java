public class staticbinding {
    public static void main(String[] args) {
        parentclass p=new parentclass();
        childclass c=new childclass();
        p.view();
        c.view();
    }
}
class parentclass
{
    public void view()
    {
        System.out.println("Parent class");
    }
}
class childclass extends parentclass
{
    public void view()
    {
         System.out.println("Child class");
    }
}