public class statickeyword {
    public static void main(String[] args) {
       show();
       statickeyword ob=new statickeyword();
        ob.view(100);
      //ob.show();
    }

    int roll_no;
    static void show()
    {
        int age=10;
          System.out.println("Age is:"+age);
    }
    public void view(int roll_no)
    {
        this.roll_no=roll_no;
        System.out.println("Roll No. is:"+ roll_no);
    }
}