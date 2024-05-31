class multithreading
{
    public static void main(String[] args) {
        multithreading m=new multithreading();
        m.view();
        m.show();
    }
        public void view()
        {
            for(int i=0;i<=100;i++)
            System.out.println("thread");
        }
        public void show()
        {
            for(int j=0;j<=100;j++)
            System.out.println("thread2");
        }
}