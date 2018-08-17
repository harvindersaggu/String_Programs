Input : 5
Output :
1 * 2 * 3 * 4 * 5  
11 * 12 * 13 * 14 * 15  
21 * 22 * 23 * 24 * 25  
16 * 17 * 18 * 19 * 20  
6 * 7 * 8 * 9 * 10  





import java.io.*;

class Pattern {

	public static void main(String[] args) {

		// Number of rows you want to print
		int n = 5;

		int p = n;

		if (n >= 1 && n <= 100) {

			for (int i = 1; i <= n; i += 2) {

				int k = (i - 1) * n + 1;

				for (int j = 0; j < n - 1; j++) {

					System.out.print(k + " * ");

					k++;
				}

				System.out.print(k + "  ");

				System.out.println();
			}

			if (n % 2 != 0)
                       {
				p = n - 1;
			}
			for (int i = p; i > 0; i -= 2) {

				int k = (i - 1) * n + 1;

				for (int j = 0; j < n - 1; j++) {

					System.out.print(k + " * ");

					k++;
				}

				System.out.print(k + "  ");

				System.out.println();
			}
		}
	}
}
