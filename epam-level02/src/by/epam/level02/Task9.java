package by.epam.level02;

/*
 * 9. В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких 
чисел несколько, то определить наименьшее из них.
 */
public class Task9 {

	public static void main(String[] args) {
		int[] array = { 10, 5, 6, 8, 5, 1, 8, 9, 4, 1 };
		int min = array[0];

		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j] && array[i] < min) {

					min = array[j];
				}
			}
		}
		System.out.println("Min value " + min);

	}
}
