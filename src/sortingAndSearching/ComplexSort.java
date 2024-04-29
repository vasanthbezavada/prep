package sortingAndSearching;

import java.util.Arrays;

/*
* merge sort
* quick sort
* heap sort -- used by most of the inbuilt languages
*
*
* uses recursion
* */
public class ComplexSort {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(mergeSort(new int[]{1,3,2,-8})));
    }

    static int[] mergeSort(int[] arr){
        if(arr.length == 1)
            return arr;
        int mid = arr.length/2;
        int[] left = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left,right);
    }

    private static int[] merge(int[] left, int[] right) {

        int[] result = new int[left.length+ right.length];
        int i=0,j=0,k = 0;
        while (i< left.length && j< right.length){
            if(left[i]<right[j])
                result[k++]=left[i++];
            else
                result[k++]=right[j++];
        }
        while (i< left.length){
            result[k++]=left[i++];
        }
        while (j< right.length){
            result[k++]=right[j++];
        }
       return result;
    }

}
