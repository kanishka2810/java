public class Countsubarrayswithequalnumberof1n0 {
    public static void main(String[] args)
{
    int arr[] = {1, 0, 0, 1, 0, 1, 1};
    int n = arr.length;
        int count = 0;
        int j,i;
        for (i = 0; i <= n - 1; i++)
        {   
            int count_0 = 0;
            int count_1 = 0;
            for (j = i; j <= n - 1; j++)
            {
                if (arr[j] == 0)
                {
                    count_0++;
                }
                else if (arr[j] == 1)
                {
                    count_1++;
                }
                if(count_0 == count_1)
                {
                    count++;
                }
            }
        }
    System.out.println("Count is"+count++);
    
    }
}
