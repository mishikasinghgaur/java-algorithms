package BinarySearch;

import java.io.*;
import java.lang.*;
import java.util.*;

class kthElementOfTwoSortedArrays {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int k = Integer.parseInt(br.readLine().trim());

            String[] line1 = br.readLine().trim().split(" ");
            int[] arr1 = new int[line1.length];
            for (int i = 0; i < line1.length; i++) {
                arr1[i] = Integer.parseInt(line1[i]);
            }

            String[] line2 = br.readLine().trim().split(" ");
            int[] arr2 = new int[line2.length];
            for (int i = 0; i < line2.length; i++) {
                arr2[i] = Integer.parseInt(line2[i]);
            }

            Solution ob = new Solution();
            System.out.println(ob.kthElement(k, arr1, arr2));
        }
    }
}

class Solution {

    public long kthElement(int k, int arr1[], int arr2[]) {

        int n = 0, m = 0;

        int[] result = new int[arr1.length+arr2.length];

        for(int i = 0; i < result.length; i++) {
            if (n < arr1.length && (m >= arr2.length || arr1[n] < arr2[m])) {
                result[i] = arr1[n];
                n++;
            } else {
                result[i] = arr2[m];
                m++;
            }
        }

        int res = getKthElement(k, result, 0, result.length);

        return res;
    }

    private int getKthElement(int k, int[] result, int low, int high) {

        while (low <= high) {

            int mid = (low + high) / 2;

            if(mid == k - 1){
                return result[mid];
            }

            if(mid > k - 1) {
                return getKthElement(k, result, low, mid - 1);
            } else {
                return getKthElement(k, result, mid + 1, high);
            }
        }

        return -1;
    }

}