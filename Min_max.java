public class Min_max {
    public static void main(String []args){
        int[] array = {1,8,9,0,2,5,25,4,6,3,12,5};
        merge_sort(array);
        System.out.println("Sorted element are: ");
        for(int i =0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println("");
        max_element(array);
        System.out.println("Minimum element in array: ");
        min_element(array);
    }

    private static void min_element(int[] array) {
        System.out.println(array[0]);

    }

    private static void max_element(int[] array) {
        int n = array.length;
        System.out.println("Max element in array is : ");
        System.out.println(array[n-1]);
    }

    private static void merge_sort(int[] array) {
        int x = array.length;
        if(x<= 1) return;
        int mid = x/2;

        int[] leftArray = new int[mid];
        int[] rightArray = new int[x-mid];
        int j=0;
        for(int i =0;i<x;i++){
            if(i<mid){
                leftArray[i] = array[i];
            }
            else{
                rightArray[j] = array[i];
                j++;
            }
        }
        merge_sort(leftArray);
        merge_sort(rightArray);
        merge(leftArray,rightArray,array);


    }

    private static void merge(int[] leftArray, int[] rightArray, int[] array) {
        int leftSize = array.length/2;
        int rightSize = array.length - leftSize;

        int i= 0,l =0,r=0;
        while(l<leftSize && r<rightSize){
            if(leftArray[l]<rightArray[r]){
                array[i] = leftArray[l];
                i++;
                l++;
            }
            else{
                array[i] = rightArray[r];
                i++;
                r++;
            }
        }
        while(l<leftSize){
            array[i] = leftArray[l];
            i++;
            l++;
        }
        while(r<rightSize){
            array[i]= rightArray[r];
            i++;
            r++;
        }

    }
}