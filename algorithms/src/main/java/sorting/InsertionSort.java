package com.msg.java.algorithms.sorting;

public class InsertionSort {
    void sort(int a[]){

        for (int i=1;i<a.length;i++) {
            int current = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > current) {
                a[j + 1] = a[j];
                j--;
            }

            a[j + 1] = current;
        }
    }

    void display(int a[]){
        for(int i=0; i<a.length; i++){
            System.out.println(a[i]);
        }
    }
    public static void main(String [] args){
        InsertionSort is = new InsertionSort();
        int arr[] = {15, 4, 9, 7, 6, 11};
        is.sort(arr);
        is.display(arr);
    }
}
