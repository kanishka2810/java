public class insertionsort {
    public static void main(String[] args)
   {
       int a[]={2,2,35,243,557,354,643,3463,45,35};
       int n=a.length;
       for(int i=1;i<n;i++)
       {
            int x=a[i];
            int j=i-1;
            while(j>-1 && a[j]>x)
            {
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=x;
       }
       for(int i=0;i<n;i++)
       {
           System.out.println(a[i]);
       }
   }
}
