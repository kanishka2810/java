public class defaultconstructor {
    public static void main(String[] args) {
        student s1 = new student();
        student s2 = new student();
        s1.Student_details();
        s2.Student_details();
        // c.view();
    }
}

class student {
    int id, roll_no;

    public void Student_details() {
        System.out.println("Student Id and Roll No is" + id + "," + roll_no);
    }
}