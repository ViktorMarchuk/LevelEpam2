package by.epam.level02;

/*
 * Даны действительные числа A1,A2,A3 ..An
 * Найти max (A1+A2n, A2+A2n-1,..., An+An+1)

 */
public class Task7 {

	public static void main(String[] args) {
		int[] array = { 1, 3, 2, 6, 8, 4, 2, 3, 10, 7 };
		int maxValue = array[0] + array[array.length - 1];
		
		for (int i = 1; i < array.length / 2; i++) {
			if (array[i] + array[array.length - i - 1] > maxValue) {
				maxValue = array[i] + array[array.length - i - 1];
			}
		}
		System.out.println("Max value " + maxValue);
	}

}
