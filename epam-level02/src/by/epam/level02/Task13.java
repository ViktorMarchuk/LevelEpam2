package by.epam.level02;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
 * 3. Дана матрица. Вывести k-ю строку и p-й столбец матрицы
 */
public class Task13 {

	public static void main(String[] args) {
		int[][] array = new int[6][8];

		Random rn = new Random();
		int min = 1;
		int max = 9;

		System.out.println("Creat the array");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = rn.nextInt((max - min) + 1) + min;
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		int i=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Output  column ");
		int k = sc.nextInt();
		for ( i = 0; i < array.length; i++) {
			System.out.print(array[i][k] + " ");
		}
		System.out.println();
		System.out.println("Output  line ");
		int p = sc.nextInt();

		for (int j = 0; j < array[p].length; j++) {
			System.out.print(array[p][j] + " ");
		}
		System.out.println();
	}
}
