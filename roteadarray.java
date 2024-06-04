public class roteadarray {
        public static void main (String[] args) {
            int a[] = { 1, 2, 3, 4, 5, 6, 7 };
            int n = a.length;
            int d = 4;
        int temp[] = new int[n];
        int k = 0;
        for (int i = d; i < n; i++) {
            temp[k] = a[i];
            k++;
        }
        for (int i = 0; i < d; i++) {
            temp[k] = a[i];
            k++;
        }
        for (int i = 0; i < n; i++) {
            a[i] = temp[i];
        }
        System.out.println("Array is");
            for (int i = 0; i < n; i++) {
            System.out.print(a[i]+" ");
        }
    }
}