public class Binary_search {
    public static void main(String args[]) {
        int arr[] = { 10, 20, 30, 40, 50, 60, 70, 80 };
        int key = 80;
        int high = arr.length - 1;
        int index = binarySearch(arr, 0, high, key);
        if (index == -1)
            System.out.println("key  is not found");
        else
            System.out.println("search key  is found at index: " + index);
    }

    public static int binarySearch(int arr[], int low, int high, int key) {
        if (high >= low) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == key) {
                return mid;
            }
            if (arr[mid] > key) {
                return binarySearch(arr, low, mid - 1, key);
            } else {
                return binarySearch(arr, mid + 1, high, key);
            }
        }
        return -1;
    }

}