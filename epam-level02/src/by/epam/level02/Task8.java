package by.epam.level02;

import java.util.Arrays;

/*
 *  8.Дана  последовательность целых чисел a1,a2,a3 ..an. Образовать новую последовательность, выбросив из 
    исходной те члены, которые равны  min  a1,a2,a3..an.
 */
public class Task8 {

	public static void main(String[] args) {

		int[] array = { -13, 7, 9, 4, -2, -7, 5, 4, 3, -1, 7 };
		int minValue = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] < minValue) {
				minValue = array[i];

			}
		}
		int[] arrayResult = new int[array.length];
		int index = 0;
		for (int j = 0; j < array.length; j++) {
			if (array[j] != minValue) {
				arrayResult[index] = array[j];
				index++;
			}
		}
		System.out.println("Tne new array is " + Arrays.toString(arrayResult));
	}
}
