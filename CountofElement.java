public class CountofElement {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 4, 4, 4, 6, 7 };

        int start = 0;
        int end = arr.length - 1;
        int element = 4;

        int first = FirstPlace(start, end, arr, element);
        int last = LastPlace(start, end, arr, element);

        System.out.println("the element " + element + " occurs " + (last - first + 1) + " times");
    }

    public static int FirstPlace(int start, int end, int[] arr, int element) {
        int result = 0;
        while (start <= end) {
            int mid = start + ((end - start) / 2);

            if (arr[mid] == element) {
                result = mid;
                end = mid - 1;
            } else if (arr[mid] < element) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
        return result;

    }

    public static int LastPlace(int start, int end, int[] arr, int element) {
        int result = 0;
        while (start <= end) {
            int mid = start + ((end - start) / 2);

            if (arr[mid] == element) {
                result = mid;
                start = mid + 1;
            } else if (arr[mid] < element) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
        return result;

    }
}
