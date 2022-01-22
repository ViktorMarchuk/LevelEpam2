package by.epam.level02;

/*
 * 2. Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
 */
public class Task12 {

	public static void main(String[] args) {
		int[][] array = { { 2, 5, 4, 3, 5 }, 
				          { 5, 4, 3, 7, 9 },
				          { 1, 3, 5, 4, 3 },
				          { 3, 5, 4, 2, 1 },
				          { 4, 3, 5, 7, 2 } };

		System.out.println("Diagonal of the martix from left to the rigth :");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (i == j) {
					System.out.print(array[i][j] + " ");
                }
			}
		}
		System.out.println();
		System.out.println("Diagonal of the matrix from the rigth to the left :");
		for (int x = 0; x < array.length; x++) {
			System.out.print(array[x][array.length - 1 - x] + " ");
		}
	}
}
