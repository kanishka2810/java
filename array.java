public class array {
    public static void main(String[] args) {
        int arr[]={1,4,8,5,7,3,9};
        int sum=9;
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i;j<arr.length;j++)
            {
                if(sum==arr[i]+arr[j])
                {
                    if((arr[i]==4 && arr[j]==5) || (arr[j]==4 && arr[i]==5))
                    {
                        System.out.println(arr[i]+" "+arr[j]);
                    }
                }
            }
        }
    }
}