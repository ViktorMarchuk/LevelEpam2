package by.epam.level02;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
 * 3. Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных, 
положительных и нулевых элементов
 */
public class Task3 {

	public static void main(String[] args) {
		System.out.println("Enter the dimension of array : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = new int[n];
		Random rn = new Random();
		int min = -4;
		int max = 8;
		int countPositive = 0;
		int countNegative = 0;
		int countZero = 0;

		for (int i = 0; i < array.length; i++) {
			array[i] = rn.nextInt((max - min) + 1) + min;
			if (array[i] > 0) {
				countPositive++;
			}
			if (array[i] < 0) {
				countNegative++;
			}
			if (array[i] == 0) {
				countZero++;
			}
		}
		System.out.println("Array " + Arrays.toString(array));
		System.out.println("The count of positive elements is " + countPositive);
		System.out.println("The count of negative elements is " + countNegative);
		System.out.println("The count of elements Zero is " + countZero);
	}
}
