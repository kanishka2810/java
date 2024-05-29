package p2;
import p1.defaulaccessmodifier;
public class defaulaccessmodifier1 {
    public static void main(String[] args) {
        defaulaccessmodifier ob=new defaulaccessmodifier(); //compile time error because try to acsess class from outside package
        ob.dis(); //compile time error

    }
}