public class Quick_sort {
    public static void main(String []args){
        int[] array = {8,5,7,9,2,1,3,4,6};

        quick_Sort(array,0, array.length - 1);

        System.out.println("The sorted array is : ");
        for(int i = 0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }

    private static void quick_Sort(int[] array, int start, int end) {
        
        // divide the array in two parts called partition of the array 
        
        if(end <= start) return; // base case 
        int pivot = partition(array, start, end);
        quick_Sort(array, start, pivot-1);
        quick_Sort(array, pivot+1, end);
        

    }

    private static int partition(int[] array, int start, int end) {
        int pivot = array[end];
        int i = start-1;
        // in partition we just compare and  swap the elements 
        // we return the index 
        for(int j = start;j<=end-1;j++){
            if(array[j] < pivot){
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }

        }
        i++;
        int temp = array[i];
        array[i] = array[end];
        array[end] = temp;

        return i;
    }
}