package DAY5;


public class PG2 {
    public static int binary_search(int arr[], int key) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == key) {
                return mid;
            }
            if (arr[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 10};
        int key = 6;
        int result = binary_search(arr, key);
        if(result == -1){
            System.out.println("Element not found");
        }else{
            System.out.println("Element found at index: " + result);
        }
    }
    
}
