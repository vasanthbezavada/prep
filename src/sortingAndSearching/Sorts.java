package sortingAndSearching;

import java.util.Arrays;

public class Sorts {
    public static void main(String[] args) {
        int[] nums = {5,8,7,4,4,6,8,4,6,8,4,0,3,9,6,7};
        bubbleSort(nums);
        selectionSort(nums);
        insertionSort( nums);
    }

    static void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1;j< arr.length; j++){
                if(arr[j] < arr[i]){ // reverse condition for desc sort
                    int temp = arr[j];
                    arr[j]= arr[i];
                    arr[i] = temp;
                }
            }
        }
        System.out.println("bubbleSort");
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int smallestIndex = i;
            int smallestNumber = arr[i];
            for (int j = i+1;j< arr.length; j++){
                // find whichever is smallest among the rest of the items.
                if(arr[j] < smallestNumber){ // reverse condition for desc sort
                    smallestIndex = j;
                    smallestNumber = arr[j];
                }
            }
            // now swap with the smallest number
            int temp = arr[i];
            arr[i]= arr[smallestIndex];
            arr[smallestIndex] = temp;

        }
        System.out.println("selection");
        System.out.println(Arrays.toString(arr));
    }

    static void insertionSort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            for(int j = i-1; j>=0; j--){
                if(arr[j]>arr[j+1]){ // reverse condition for desc sort

                    int temp = arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }else break;
            }
        }
        System.out.println("selection");
        System.out.println(Arrays.toString(arr));
    }
}
