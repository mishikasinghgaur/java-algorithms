package com.msg.java.algorithms.sorting;

public class BubbleSort {
    void sort(int a[]){
        int n = a.length;
        boolean swapped = false;
        for (int i = 0; i < n-1; i++){
            swapped = false;
            for (int j=0; j<n - i-1;j++){
                if(a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    swapped = true;
                }
            }
            if(swapped==false){
                break;
            }
        }
    }

    void display(int a[]){
        int n = a.length;
        for (int i=0; i<n; i++){
            System.out.println(a[i]);
        }
    }

    public static void main(String [] args){
        BubbleSort ob = new BubbleSort();
        int arr[]={6,5,0,3};
        ob.sort(arr);
        ob.display(arr);
    }
}
