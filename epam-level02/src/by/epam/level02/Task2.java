package by.epam.level02;

import java.util.Arrays;

/*
 * 2. Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим 
числом. Подсчитать количество замен
 */
public class Task2 {

	public static void main(String[] args) {

		int[] array = { 12, 4, 6, 7, 8, 42, 78, 1, 3, 5, 8 };
		int z = 5;
		int count = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] > z) {
				array[i] = z;
				count++;

			}
		}

		System.out.println("Quentity of the changes is " + count);

		System.out.println("The array after change is " + Arrays.toString(array));
	}

}
