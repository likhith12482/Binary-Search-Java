//import java.util.*;

public class FirstOccurence {
    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);

        // int size = input.nextInt();

        int[] arr = { 1, 2, 2, 2, 4, 5 };

        // for (int i = 0; i < size; i++) {
        // arr[i] = input.nextInt();
        // }

        int start = 0;
        int end = arr.length - 1;
        // System.out.println("Enter element to search");
        int element = 2;
        int res = -1;

        while (start <= end) {
            int mid = start + ((end - start) / 2);

            if (arr[mid] == element) {
                res = mid;
                start = mid + 1;
            } else if (arr[mid] < element) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        if (res == -1) {
            System.out.println("Element appears only once");
        } else {
            System.out.println("Element  " + element + " found at index " + res);
        }
    }
}
