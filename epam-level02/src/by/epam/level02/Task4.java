package by.epam.level02;

import java.util.Arrays;

/*
 * 4. Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы
 */
public class Task4 {

	public static void main(String[] args) {

		int[] array = { 4, 6, 4, 3, 9, 76, 34, -7 };
		int minValue = array[0];
		int minIndex = 0;
		int maxValue = array[0];
		int maxIndex = 0;

		for (int i = 0; i < array.length; i++) {
			int current = array[i];
			if (current < minValue) {
				minValue = current;
				minIndex = i;
			}
			if (current > maxValue) {
				maxValue = current;
				maxIndex = i;
			}
		}
		int temp = array[maxIndex];
		array[maxIndex] = array[minIndex];
		array[minIndex] = temp;

		System.out.println(Arrays.toString(array));
	}
}
