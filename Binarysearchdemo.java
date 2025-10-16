import java.util.*;

public class Binarysearchdemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter size of array");
        int size = input.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter " + size + "Elements");
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }

        System.out.println("Enter element to Search ");
        int element = input.nextInt();
        int start = 0;
        int end = arr.length - 1;
        boolean found = false;

        while (start <= end) {
            int mid = start + ((end - start) / 2);

            if (arr[mid] == element) {
                System.out.println("Element Found at index " + mid);
                found = true;
                break;
            } else if (arr[mid] < element) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
        if (!found) {
            System.out.println("Element is Not Found! try other");
        }

        input.close();

    }
}
