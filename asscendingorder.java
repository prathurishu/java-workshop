public class asscendingorder {
    public static void maim(String[] args) {
        int[] array = new int[]{5, 4, 3, 2, 1};
        int tem = 0;

        for (int n = 0; n < array.length; n++) {
            for (int m = n + 1; m < array.length; m++) {
                if (array[n] > array[m]) {
                    tem = array[n];
                    array[n] = array[m];
                    array[m] = tem;
                }
            }
        }
        System.out.println();
        System.out.println("Elements of array sorted in asscending order:");
        for (int n = 0; n< array.length; n++) {
            System.out.print(array[n] + " ");

        }
    }
}
