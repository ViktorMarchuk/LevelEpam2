package by.epam.level02;

import java.util.Random;

/*
 *    Задачи. Массивы массивов
 * 1. Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.

 */
public class Task11 {

	public static void main(String[] args) {

		int[][] array = new int[6][10];
		int min = 1;
		int max = 9;
        System.out.println("The original array after creation with helping method Random :");
		Random rn = new Random();
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = rn.nextInt((max - min) + 1) + min;
				
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Result :");
		for (int i = 0; i < array.length; i++) {
			for (int j = 1; j < array[i].length; j = j + 2) {
				if (array[0][j] > array[array.length - 1][j]) {
			
					System.out.print(array[i][j] + " ");

				}
			}
			System.out.println();
		}
	}
}
