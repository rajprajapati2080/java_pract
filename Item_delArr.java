import java.util.*;
class Item_delArr {
	// 4,5,6,7,8
	// 4,5,7,8,0
	public static void deleteElement (int array[], int el) {
		int i = 0, k = 0;
		for (i = 0; i < array.length; i++) {
			if (array[i] == el) break;
		}
		// 
		for (k = i; k < array.length - 1; k++) {
			array[k] = array[k + 1];
		}
		array[k] = 0;
	}

	public static void main (String[]arg) {
		int array[] = {1,2,3,4,5,6,7,8,9};
		deleteElement(array, 6);
		for (int i: array)
			System.out.print(i + " ");
	}
}