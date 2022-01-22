package by.epam.level02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 6. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное)
 *     1,1,1...1,1,1
 *     0,1,1...1,1,0
 *     0,0,1...1,0,0
 *     .............
 *     0,1,1...1,1,0
 *     1,1,1...1,1,1
 */
public class Task16 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		System.out.println("Input the even number N ");
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			int n = Integer.parseInt(bf.readLine());
			if (n % 2 != 0) {
				System.out.println("Input  correct number ");

			} else {

				int[][] array = new int[n][n];
				for (int i = 0; i < array.length / 2; i++) {
					for (int j = 0; j < array[i].length; j++) {
						if (j >= i && j < array.length - i) {
							System.out.print((array[i][j] = 1) + " ");

						} else {
							System.out.print(array[i][j] + " ");
						}
					}

					System.out.println();
				}
				for (int i = array.length / 2; i < array.length; i++) {
					for (int j = 0; j < array[i].length; j++) {
						if (j <= i && j >= array[i].length - i - 1) {
							System.out.print((array[i][j] = 1) + " ");
						} else {
							System.out.print(array[i][j] + " ");
						}
					}
					System.out.println();
				}

			}
		}
	}
}