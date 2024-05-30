public class secondlargestelemnt {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6};
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]<a[j])
                {
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                }
               
            }
           
        }
        System.out.println("third largest element:"+(a.length-2));
        //System.out.println("Second largest element:"+(a.length-1));
    }
    
}
