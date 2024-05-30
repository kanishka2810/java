public class largestelementinarray {
    public static void main(String[] args) {
        int ar[]={2,14,234,5678,23456};
        int max=ar[0];
        for (int i = 0; i< ar.length;i++)
        {
            if(ar[i]>max)
            max=ar[i];
        }
        System.out.println("maximum is:"+max);
        
    }
}
