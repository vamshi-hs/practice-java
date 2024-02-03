/**
 * BinarySearch
 */
public class BinarySearch {

    static int search(int[] arr,int key){
        int low = 0;
        if (arr.length == 0){
            return -1;
        }
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low)/ 2;
            if (arr[mid] == key){
                return mid;
            }
            else if (key > arr[mid]){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return -1;
    }

    static void testing(){
        int arr[] = {1,2,3,4,5};
        int arr2[] = {1,2,3,4};
        int arr3[] = {};
        assert (search(arr, 20) == -1): "Search Failed";
        assert (search(arr2, 1) == 0): "Search Failed";  
        assert (search(arr2, 1) == 0): "Search Failed";
        assert (search(arr2, 30) == -1): "Search Failed";
        assert (search(arr3, 30) == -1): "Search Failed";
    }

    public static void main(String[] args) {
       testing();
       System.out.println("Testing passed"); 
   }
}