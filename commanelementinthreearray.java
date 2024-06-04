public class commanelementinthreearray {
    public static void main(String[] args) {
       int a[]={1,2,3,4};
       int ar[]={3,4,5,6};
       int arr[]={3,4,7,8};
       //int k=-1;
       for(int i=0;i<a.length;i++)
       {
            for(int j=0;j<ar.length;j++)
            {
                //if(a[i]==ar[j])
                //{
                   // for(k=k+1;k<arr.length;k++)
                   for(int k=0;k<arr.length;k++)
                    {
                        if(a[i]==ar[j] && ar[j]==arr[k])
                            System.out.println(ar[j]+"");
                        // else
                        // {
                        //     k=k-1;
                        //     break;
                        // }
                    }  
                }
            }
       }
    }

