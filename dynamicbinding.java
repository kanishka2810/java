public class dynamicbinding {
    public static void main(String[] args) {
        parentclass p=new childclass();
        p.view();
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