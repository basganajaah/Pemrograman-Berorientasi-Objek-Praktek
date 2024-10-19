public class Sorting {
    public static <Compare extends Comparable<Compare>> void selectionSort(Compare[] list) {
        int min;
        Compare temp;

        for (int index = 0; index < list.length - 1; index++) {
            min = index;
            for (int scan = index + 1; scan < list.length; scan++) {
                if (list[scan].compareTo(list[min]) < 0) {
                    min = scan;
                }
            }
            temp = list[min];
            list[min] = list[index];
            list[index] = temp;
        }
    }

    public static <Compare extends Comparable<Compare>> void insertionSort(Compare[] list) {
        for (int index = 1; index < list.length; index++) {
            Compare key = list[index];
            int position = index;

            while (position > 0 && list[position - 1].compareTo(key) < 0) {
                list[position] = list[position - 1];
                position--;
            }
            list[position] = key;
        }
    }
}
