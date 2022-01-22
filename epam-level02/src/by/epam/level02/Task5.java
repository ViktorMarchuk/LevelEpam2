package by.epam.level02;

/*
 * 5. Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.

 */
public class Task5 {

	public static void main(String[] args) {
		int[] array = { 0, 4, 56, 6, 34, 89, 7, 1, 0, -2, 12 };
		for (int i = 0; i < array.length; i++) {
			if (array[i] > i) {

				System.out.print(array[i] + " ");
			}

		}
	}
}
