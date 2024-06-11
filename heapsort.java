public class heapsort 
{
    public void sort(int a[])
    {
        int n = a.length;
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(a, n, i);
        for (int i = n - 1; i > 0; i--) 
        {
            int temp = a[0];
            a[0] = a[i];
            a[i] = temp;
            heapify(a, i, 0);
        }
    }
    void heapify(int a[], int n, int i)
    {
        int largest = i; 
        int l = 2 * i + 1; // left
        int r = 2 * i + 2; // right
            
        if (l < n && a[l] > a[largest])
            largest = l;
                
        if (r < n && a[r] > a[largest])
            largest = r;
    
        if (largest != i) 
        {
            int tem = a[i];
            a[i] = a[largest];
            a[largest] = tem;
    
            heapify(a, n, largest);
        }
    }
    public static void main(String args[])
    {
        int a[] = {68,4,57,57,24,67,23,7,33,89,24,5,43,1,0,3,543,23};
        int n = a.length;
    
        heapsort ob = new heapsort();
        ob.sort(a);
        
        System.out.println("Sorted array is");
        for (int i = 0; i < n; ++i)
            System.out.print(a[i] + " ");
    }
}