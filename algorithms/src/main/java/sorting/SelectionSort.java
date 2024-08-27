package com.msg.java.algorithms.sorting;

public class SelectionSort {

    void sort(int a[]){
        int n = a.length;
        for(int x=0; x<n-1; x++){
            int minIndex = x;
            for(int j = x+1; j<n;j++){
                if(a[j]<a[minIndex]){
                    minIndex=j;
                }
            }

            int temp = a[minIndex];
            a[minIndex] = a[x];
            a[x] = temp;
        }
    }

    void printArray(int arr[]){
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
        }

    public static void main(String [] args){
        SelectionSort ob = new SelectionSort();
        int arr[] = {64,25,12,22,11};
        ob.sort(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);
    }
}
