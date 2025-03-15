package Week_11_BinarySearch.ClassWork;

public class ForbiddenIsland {
    public static int findPeakElement(int[] elevations) {
        int left = 0;
        int right = elevations.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (elevations[mid - 1] < elevations[mid] & elevations[mid] < elevations[mid + 1]) {
                left = mid + 1;
            } else if (elevations[mid - 1] > elevations[mid] & elevations[mid] > elevations[mid + 1]){
                right = mid - 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] elevations1 = {1, 2, 3, 1};
        int[] elevations2 = {1, 2, 1, 3, 5, 6, 4};

        System.out.println(findPeakElement(elevations1));
        System.out.println(findPeakElement(elevations2));
    }
}