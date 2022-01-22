package by.epam.level02;

import java.util.Arrays;
import java.util.Random;

/* Одномерные массивы
1. В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.
 * 
 */
public class Task1 {

	public static void main(String[] args) {
		int[] array = { 24, 16, 18, 36, 12, 4, 13, 17, 81 };
		int sum = 0;
		int k = 3;

		for (int i = 0; i < array.length; i++) {
			if (array[i] % k == 0) {
				System.out.print(array[i] + " ");
				sum += array[i];

			}
		}
		System.out.println();
		System.out.println("The amount is " + sum);
	}
}
