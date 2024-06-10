public class selectionsort {
    public static void main(String[] args)
   {
       int a[]={1,1,0,7,24,546,785,242,555};
       int n=a.length;
       for(int i=0;i<n-1;i++)
       {
           int x=i;
           for(int j=i+1;j<n;j++)
           {
               if(a[j]<a[x])
               {
                   x=j;
               }
           }
           int temp=a[i];
           a[i]=a[x];
           a[x]=temp;
           System.out.println(a[i]);
       }
   }
}
