package by.epam.level02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 4. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 *    1,2,3 ... n
 *    n-1,n-2...n
 */
public class Task14 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		System.out.println("Input the even number N");
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			int n = Integer.parseInt(bf.readLine());
			if (n % 2 == 0) {
				int[][] array = new int[n][n];
				for (int i = 1; i < array.length; i++) {
					for (int j = 1; j < array[i].length; j++) {
						if (i % 2 == 0) {
							System.out.print((array.length - j) + " ");
						} else {
							System.out.print(j + " ");
						}
					}
					System.out.println();
				}
			} else {
				System.out.println("Input correct number");
			}
		}
	}
}
