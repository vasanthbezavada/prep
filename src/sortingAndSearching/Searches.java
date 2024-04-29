package sortingAndSearching;

public class Searches {
    public static void main(String[] args) {
        int[] arrayToSearch = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(binarySearch(arrayToSearch, -5));
        System.out.println(binarySearch(arrayToSearch, 3));
    }

    static int binarySearch(int[] arr, int searchTerm) { // time complexity log n
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int middle = start + (end - start) / 2;
            if (arr[middle] == searchTerm)
                return middle;

            if (arr[middle] < searchTerm)
                start = middle + 1;
            else
                end = middle - 1;
        }
        return -1;
    }

}
