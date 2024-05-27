class thiskeyword {
    public static void main(String[] args) {
        cmain ob=new cmain();
        ob.view(10);
      
    } 
}

class cmain{
    int age;
    public void view(int age)
    {
        this.age=age;
          System.out.println("Age is:"+ age);
    }
}
