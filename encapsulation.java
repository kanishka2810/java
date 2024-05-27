class encapsulation {
    public static void main(String[] args)
    {
        Student st=new Student();
        st.set(19);
        int i=st.get();
       System.out.println(i);
    }
}
class Student
{
    int age;

//getter

    public int get()
    {
        return age;
    }

//setter

    public void set(int age)
    {
        this.age=age;
    }
}