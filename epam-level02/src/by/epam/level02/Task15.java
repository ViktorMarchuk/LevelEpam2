package by.epam.level02;

import java.util.Scanner;

/*
 * 5. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
      1,1,1...1,1,1
      2,2,2...2,2,0
      3,3,3...3,0,0
      n-1,n-1,0 ...0,0,0
      n,0,0...0,0,0
 */
public class Task15 {

	public static void main(String[] args) {
		System.out.println("Input the size of array ");
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();

			if (n % 2 == 0) {

				int[][] array = new int[n][n];

				for (int i = 0; i < array.length; i++) {
					for (int j = array[i].length - 1; j >= 0; j--) {
						if (i <= j) {
							System.out.print((i + 1) + " ");

						} else {
							System.out.print(array[i][j] + " ");

						}
					}
					System.out.println();
				}
			} else {
				System.out.println("Input an even number ");

			}
		}
	}
}
