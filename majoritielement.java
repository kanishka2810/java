public class majoritielement {
    public static void main(String[] args)
    {
        int a[] = {5,6,7,5,5,8,5,1,5,1,5};
        int n = a.length;
        int max_Count = 0;
        int index = -1;
        
        for (int i = 0; i < n; i++) 
        {
            int count = 0; 
            for (int j = 0; j < n; j++) 
            {
                if (a[i] == a[j])
                    count++;
            }
            if (count > max_Count) 
            {
                max_Count = count;
                index = i;
            }
        }
        if (max_Count > n / 2)
            System.out.println("No is: "+a[index]);

        else
            System.out.println("No Element");
    }
}