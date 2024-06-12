public class maximumproduct {
    public static void main(String[] args) {
        int a[]={2,2,-3,-3,-1,2};
        int product=6;
        //int b[]=new int[a.length];
        for(int i=0;i<a.length;i++)
        {
            for(int j=i;j<a.length;j++)
            {
               int res=a[i]*a[j];
               if(res==product)
                  System.out.println(res);
            }
            
        }
    }
}
