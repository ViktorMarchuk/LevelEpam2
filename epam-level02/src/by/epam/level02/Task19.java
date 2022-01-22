package by.epam.level02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

/*
 * 9. Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой 
 *    столбец содержит максимальную сумму.
 */
public class Task19 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.println("Creat the matrix of positive numbers");
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		Random rn = new Random();
		System.out.println("Input min value for random numbers");
		while (true) {
			int min = Integer.parseInt(bf.readLine());
			if (min < 0) {
				System.out.println("Input correct number");
			} else {
				System.out.println("Input max value for random numbers");
				while (true) {
					int max = Integer.parseInt(bf.readLine());
					if (max < 0) {
						System.out.println("Input correct number");
					} else {

						int[][] array = new int[6][6];// размер массива массивов 6
						int[] array1 = new int[6];
						int maxColumn = 0;
						int maxSum = 0;
						for (int i = 0; i < array.length; i++) {
							for (int j = 0; j < array.length; j++) {
								array[i][j] = rn.nextInt((max - min) + 1) + min;
								System.out.print(array[i][j] + " ");
							}
							System.out.println();
						}
						for (int i = 0; i < array.length; i++) {
							for (int j = 0; j < array[i].length; j++) {
								for (i = 0; i < array1.length-1; i++) {

									array1[i] += array[j][i];
									if (array1[i] > maxSum) {
										maxSum = array1[i];
										maxColumn = i;
									}
								}
								System.out.println();
								System.out.println(i + " column equel " + array1[i]);
							}
							System.out.println();
							System.out.println("The max column is " + maxColumn);
						}
					}
				}
			}
		}
	}
}
