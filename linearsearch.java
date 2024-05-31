public class linearsearch {
    public static void main(String[] args) {
        int a[]={3,5,76,45,9,2,54};
        int key=78;
        int flag=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==key)
                flag=1;
        }
        if (flag==1)
            System.out.println("found");
        else
            System.out.println("not found");
        
    }
}
