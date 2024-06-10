public class mergesort {
    void sort(int a[],int start,int mid,int last)
    {
        int leftpart[]=new int[20];
        int rightpart[]=new int[20];
            
        for(int i=0;i<mid-start+1;++i)
            leftpart[i]=a[start+i];
        for(int j=0;j<last-mid;j++)
            rightpart[j]=a[mid+1+j];
            
        int i=0,j=0;
        int k=start;
            
        while(((i<mid-start+1)) && (j<(last-mid)))
        {
            if(leftpart[i]<=rightpart[j])
            {
               a[k]=leftpart[i];
                i++;
            }
            else
            {
                a[k]=rightpart[j];
                j++;
            }
            k++;
        }
        while(i<mid-start+1)
        {
            a[k] = leftpart[i];
            i++;
            k++;
        }
        while (j < last-mid)
        {
            a[k] = rightpart[j];
            j++;
            k++;
        }
        for(i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
    public void msort(int a[],int start,int last)
    {
        if(start<last)
        {
            int mid=(start+last)/2;
            msort(a,start,mid);
            msort(a,mid+1,last);
            sort(a,start,mid,last);
        }
    }
    public static void main(String[] args)
    {
        mergesort on=new mergesort();
        int a[]={2,35,243,557,354,643,3463,45};
        int n=a.length;
       on.msort(a,0,n-1);
    }
}