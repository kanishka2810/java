public class occureancesofintegerinaarray {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,5,5,5};
        int occur=5,count=0;
        for(int i=0;i<a.length;i++)
        {
            if(occur==a[i])
                count++;
        }
        System.out.println("occurance of 5 is"+" "+count);
    }
}
