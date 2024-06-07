public class matrixinsprialform {
public static void main(String[] args)
	{
		int n = 3;
		int m = 4;
		int a[][] = { { 1, 2, 3 },
					{ 5, 6, 7},
					{ 9, 10, 11 },
					{ 13, 14, 15 } };
		int i, k = 0, l = 0;
		while (k < m && l < n) {
			for (i = l; i < n; ++i) {
				System.out.print(a[k][i] + " ");
			}
			k++;
			for (i = k; i < m; ++i) {
				System.out.print(a[i][n - 1] + " ");
			}
			n--;
			if (k < m) {
				for (i = n - 1; i >= l; --i) {
					System.out.print(a[m - 1][i] + " ");
				}
				m--;
			}
			if (l < n) {
				for (i = m - 1; i >= k; --i) {
					System.out.print(a[i][l] + " ");
				}
				l++;
			}
		}
	}
}