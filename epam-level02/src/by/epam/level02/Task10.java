package by.epam.level02;

/*
 * 10. Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй 
элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать
 */
public class Task10 {

	public static void main(String[] args) {
		int[] array = { 4, 3, 6, 3, 2, 9, 7, 8, 1, 3, 3 };
		int i = 0;
		for (i = 0; i < array.length; i++) {
			if (i % 2 != 0) {
				array[i] = 0;

			}
			System.out.print(array[i] + " ");
		}

	}

}
