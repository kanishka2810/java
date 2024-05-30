public class copyelemenoneoanother {
    public static void main(String[] args) {
        int a[]={2,3,4,5};
        int b[]=new int [a.length];
        for(int i=0;i<a.length;i++)
        {
        b[i]=a[i];
        }
        System.out.println("a[i] is:");
        for(int i=0;i<a.length;i++)
        System.out.println(a[i]+" ");

        System.out.println("b[i] is:");
        for(int i=0;i<b.length;i++)
        System.out.println(b[i]+" ");
    }
}
