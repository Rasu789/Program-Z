import java.util.Scanner;
import java.util.Arrays;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = sc.nextInt();

        if (hasTwoElementsWithSum(arr, sum)) {
            System.out.println("Array has two elements with given sum " + sum);
        } else {
            System.out.println("Array doesn't have two elements with given sum " + sum);
        }
    }
  
    static boolean hasTwoElementsWithSum(int[] arr, int sum) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == sum) {
                    return true;
                }
            }
        }
        return false;
    }
}
