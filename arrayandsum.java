public class arrayandsum {
    public static void main(String[] args) {
        int arr[]={10,2,5,3,9,1,4,7,3,6,4};
        int sum=7;
        int flag=1;
        int a[]=new int[10];
        int le=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]+arr[j]==sum)
                {
                    for(int k=0;k<a.length;k++)
                    {
                        if(a[k]==arr[i])
                        {
                            flag=1;
                            break;
                        }
                        else
                        {
                            flag=0;
                        }
                    }
                    if(flag==0)
                    {System.out.println("pair is "+" "+arr[i]+" "+arr[j]);}
                    a[le]=arr[i];
                    le=le+1;
                }
                
            }
        }
    }
}
