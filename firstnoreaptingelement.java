public class firstnoreaptingelement {
    public static int nre(int[] a,int n)
    {
        int i,j;
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(i!=j && a[i]==a[j])
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int a[]={2,3,4,5,1,2,3,4,6};
        int n=a.length;
        int res= nre(a,n);
        if(res==-1)
            System.out.println("no");
        else
            System.out.println(a[res]);

    }
}
