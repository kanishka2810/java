public class finalkeyword {
    public static void main(String[] args) {
        cmain ob=new cmain();
        ob.view();
    }
}
class cmain
{
    final int age=20;
    public void view()
    {
        age = 30;  //cannot assign a value to final variable age
        System.out.println("Age is:"+age);
    }
}
