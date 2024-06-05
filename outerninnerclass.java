public class outerninnerclass {
        int i=10;
    class innerclass
    {
        public void show()
        {
            System.out.println("inner class"+ i);
        }
    }
    public static void main(String[] args) {
       
       outerninnerclass ot=new outerninnerclass();
        outerninnerclass.innerclass in=ot.new innerclass();
        in.show();

    }
}
