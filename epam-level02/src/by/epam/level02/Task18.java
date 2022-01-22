package by.epam.level02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

/*
 * 8. В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить 
 *    на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит 
 *    пользователь с клавиатуры.
 */
public class Task18 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.println("Creat the matrix");
		int[][] array = new int[6][6];
		int minValueArr = 2;
		int maxValueArr = 9;
		Random rn = new Random();
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = rn.nextInt((maxValueArr - minValueArr) + 1) + minValueArr;
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Input numbers of columns for replacement");
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			int column1 = Integer.parseInt(bf.readLine());
			if (column1 < 0) {
				System.out.println("Input correctly numbers of columnes");
			} else {
				while (true) {
					int column2 = Integer.parseInt(bf.readLine());
					if (column2 < 0 || column1 == column2) {
						System.out.println("Input correctly numbers of columnes");

					} else {

						for (int i = 0; i < array.length; i++) {
							int temp = array[i][column1];
							array[i][column1] = array[i][column2];
							array[i][column2] = temp;
						}
						for (int i = 0; i < array.length; i++) {
							for (int j = 0; j < array[i].length; j++) {
								System.out.print(array[i][j] + " ");
							}
							System.out.println();
						}
						break;
					}
				}
			}
		}
	}
}
