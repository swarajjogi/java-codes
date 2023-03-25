package com.Alogrithms;

public class Selection_sort {
    public static void main(String []args){
        int [] array  = {8,9,6,4,7,2,3,0,1};
// problem: Sort the elements in the array with Selection Sort algorithm
        selection_Sort(array);
        System.out.println("Sorted elements are : ");
        for(int i = 0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }

    private static void selection_Sort(int[] array) {

        for(int i =0;i<array.length - 1;i++){
            int min = i;
            for(int j = i+1;j<array.length;j++){
                if(array[min] > array[j]){
                    int temp = array[min];
                    array[min] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}