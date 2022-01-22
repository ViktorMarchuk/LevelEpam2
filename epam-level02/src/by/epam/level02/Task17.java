package by.epam.level02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/*
 * 7. Сформировать квадратную матрицу порядка N по правилу: 
 *    A[I,J]=sin(I^2 - J^2/N)
 *    и подсчитать количество положительных элементов в ней.

 */
public class Task17 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		System.out.println("Input number N ");
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		
		int sum = 0;
		double[][] array = new double[n][n];
		System.out.println("Creat the matrix");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = Math.sin(i * i + j * j);
				System.out.print(array[i][j] + " ");

				if (array[i][j] > 0) {
					sum++;
				}
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("The count of positive numbers is " + sum);
	}
}