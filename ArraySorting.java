class ArraySorting {
    public static void main(String[] args) {
        System.out.println("Hello, We are going to sort a integer array!\n");
        int array[] = { 2, 0, 134, 2, 4, 2 };
        int temp;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 5; j++) {
                // This is assending order.
                // If you need desending element order array, just change greater than symbol to
                // less than symbol.
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        System.out.println("sorted array : ");
        for (int k = 0; k < 6; k++) {
            System.out.print(array[k] + " ");
        }

    }
}