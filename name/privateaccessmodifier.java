package name;
public class privateaccessmodifier {
    public static void main(String[] args) {
        example ob=new example();
        ob.disp(); //disp() has private access in example
        int i =ob.id;
        System.out.println("private access modifier"+i); //a has private access in example
    }
}
class example
{
    private int id;
    private void disp()
    {
        System.out.println("private access modifier");
    }
}
