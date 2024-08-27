package BinarySearch;

import java.io.*;
import java.util.*;
class medianRowWiseSortedMatrix
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String S[] = read.readLine().split(" ");
            int R = Integer.parseInt(S[0]);
            int C = Integer.parseInt(S[1]);
            int matrix[][] = new int[R][C];
            int c = 0;
            for(int i = 0; i < R; i++){
                String line[]=read.readLine().trim().split(" ");
                for(int j = 0; j < C; j++){
                    matrix[i][j] = Integer.parseInt(line[j]);
                }
            }
            Solution1 ob = new Solution1();
            int ans = ob.median(matrix, R, C);
            System.out.println(ans);
        }
    }
}

class Solution1 {
    int median(int matrix[][], int R, int C) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

        // Find the minimum and maximum elements in the matrix
        for (int i = 0; i < R; i++) {
            if (matrix[i][0] < min) {
                min = matrix[i][0];
            }
            if (matrix[i][C-1] > max) {
                max = matrix[i][C-1];
            }
        }

        int desired = (R * C + 1) / 2;
        while (min < max) {
            int mid = min + (max - min) / 2;
            int place = 0;

            // Count of elements less than or equal to mid
            for (int i = 0; i < R; i++) {
                place += countLessThanEqual(matrix[i], mid);
            }

            if (place < desired) {
                min = mid + 1;
            } else {
                max = mid;
            }
        }

        return min;
    }

    // Helper function to count the number of elements <= mid in a row
    int countLessThanEqual(int[] row, int mid) {
        int l = 0, h = row.length - 1;
        while (l <= h) {
            int md = l + (h - l) / 2;
            if (row[md] <= mid) {
                l = md + 1;
            } else {
                h = md - 1;
            }
        }
        return l;
    }
}
