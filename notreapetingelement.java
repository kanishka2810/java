public class notreapetingelement {
    public static void main(String[] args) {
        int a[]={ 1,2,3,6,3,1,2,6 };
        int i,j;
        for(i=0;i<a.length;i++)
        {
            for(j=0;j<a.length;j++)
            
                if((i!=j) && (a[j]==a[i]))
                break;  
            if(j==a.length)
                System.out.println(a[i]);   
                  
        }
    }
}
