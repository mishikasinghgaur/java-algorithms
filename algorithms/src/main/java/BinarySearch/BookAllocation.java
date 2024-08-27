package BinarySearch;

import java.util.Scanner;

public class BookAllocation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the number of books
        System.out.print("Enter the number of books (N): ");
        int N = sc.nextInt();

        // Input the array of pages in each book
        int[] A = new int[N];
        System.out.println("Enter the pages of each book:");
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        // Input the number of students
        System.out.print("Enter the number of students (B): ");
        int B = sc.nextInt();

        // Calling the function to get the minimum possible number of maximum pages allocated
        int result = books(A, B);

        // Output the result
        System.out.println("The minimum possible number of maximum pages allocated is: " + result);

        sc.close();
    }

    public static int books(int[] A, int B) {
        int n = A.length;

        if (n < B) {
            return -1; // Not enough books for each student to get at least one
        }

        int low = 0, high = 0;

        // Finding the low and high values for binary search
        for (int pages : A) {
            low = Math.max(low, pages);
            high += pages;
        }

        int result = high;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (isFeasible(A, B, mid)) {
                result = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return result;
    }

    private static boolean isFeasible(int[] A, int B, int maxPages) {
        int studentsRequired = 1;
        int currentSum = 0;

        for (int pages : A) {
            if (currentSum + pages > maxPages) {
                studentsRequired++;
                currentSum = pages;

                if (studentsRequired > B) {
                    return false;
                }
            } else {
                currentSum += pages;
            }
        }

        return true;
    }
}
