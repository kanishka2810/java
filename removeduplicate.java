import java.util.Arrays;
public class removeduplicate {
    public static void main(String[] args)
    {
        int j=0;
        int a[]={-1,-1,0,5,1,2,3,4,5,6,-1};
        Arrays.sort(a);
        for(int i=0;i<a.length-1;i++)
        
        {
            if(a[i]!=a[i+1])
            {
                a[j++]=a[i];
            }
        }   
        
        a[j++]=a[a.length-1];
        for(int i=0;i<j;i++)
           System.out.println(a[i]); 
    }
}