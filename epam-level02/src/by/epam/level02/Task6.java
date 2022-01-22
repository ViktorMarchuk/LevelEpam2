package by.epam.level02;

import java.util.Arrays;

/*
 * 6. Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых 
являются простыми числами.
 */
public class Task6 {

	public static void main(String[] args) {
		int sum = 0;
		int[] array = { 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
		for (int i = 0; i < array.length; i++) {

			if (i % 2 == 1 && i % 3 != 0 || i == 2 || i == 3) {

				System.out.println("Ordinal numbers that are simple numbers " + i + " ");
				sum += array[i];

			}
		}
		System.out.println();
		System.out.println("The sum of number is " + sum);
	}
}
