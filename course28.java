import java.util.Arrays;

public class course28 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println(Arrays.toString(arr));
        int[] sortedArr = {1, 2, 3, 4, 5};
        int index = Arrays.binarySearch(sortedArr, 3);
        System.out.println(index);
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};
        System.out.println(Arrays.equals(arr1, arr2));
        int[] arr3 = {1, 2, 3};
        int[] arr4 = {1, 2, 4};
        System.out.println(Arrays.compare(arr3, arr4));
        int[] arr5 = {3, 1, 4, 2};
        Arrays.sort(arr5);
        System.out.println(Arrays.toString(arr5)); 
    }
}