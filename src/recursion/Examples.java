package recursion;

public class Examples {
    public static void main(String[] args) {

        System.out.println(findNthfibonWithoutUsingRecursion(50));
        System.out.println(findNthFib(100));

        int[] arrayToSearch = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("index of element 3 : " + binarySearchWithoutRecursion(arrayToSearch, 3));
        System.out.println("index of element 7 : " + binarySearchWithoutRecursion(arrayToSearch, 7));
        System.out.println("index of element 10 : " + binarySearchWithoutRecursion(arrayToSearch, 10));
        System.out.println("index of element 3 : " + binarySearch(arrayToSearch, 3, 0, arrayToSearch.length - 1));
        System.out.println("index of element 7 : " + binarySearch(arrayToSearch, 7, 0, arrayToSearch.length - 1));
        System.out.println("index of element 10 : " + binarySearch(arrayToSearch, 10, 0, arrayToSearch.length - 1));


    }

    static long findNthfibonWithoutUsingRecursion(long n) {
        if (n < 2) {
            return n;
        }
        long lag1 = 1;
        long lag2 = 0;
        long ans = 0;
        for (int i = 2; i <= n; i++) {
            ans = lag2 + lag1;
            lag2 = lag1;
            lag1 = ans;
        }
        return ans;
    }

    static long findNthFib(long n) {
        if (n < 2) {
            return n;
        }
        return findNthfibonWithoutUsingRecursion(n - 1) + findNthfibonWithoutUsingRecursion(n - 2);
    }

    static int binarySearchWithoutRecursion(int[] arr, int element) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (arr[middle] == element) {
                return middle;
            }
            if (arr[middle] < element) {
                // so the element must exists in right side of the array
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return -1;
    }

    static int binarySearch(int[] arr, int element, int left, int right) {
        if (left <= right) {
            int middle = left + (right - left) / 2;
            if (arr[middle] == element) {
                return middle;
            }
            if (arr[middle] < element) {
                // so the element must exists in right side of the array
                return binarySearch(arr, element, middle + 1, right);
            } else {
                return binarySearch(arr, element, left, middle - 1);
            }
        } else return -1;
    }


}
