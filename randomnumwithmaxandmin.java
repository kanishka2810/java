public class randomnumwithmaxandmin {
    public static void main(String[] args) {
        int max=1000;
        int min=900;
        double a=Math.random()*(max-min+1)+min;
        System.out.println("Random number"+a);
    }
}
