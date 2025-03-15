package Week_11_BinarySearch.ClassWork;

public class MountainVillage {
    public static int findPeakHouse(int[] heights) {
        int left = 0;
        int right = heights.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (heights[mid - 1] < heights[mid] && heights[mid] < heights[mid + 1]) {
                left = mid + 1;
            } else if (heights[mid - 1] > heights[mid] && heights[mid] > heights[mid + 1]) {
                right = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] heights1 = {0, 2, 4, 6, 5, 3, 1};
        int[] heights2 = {1, 3, 7, 8, 6, 4, 2};

        System.out.println(findPeakHouse(heights1));
        System.out.println(findPeakHouse(heights2));
    }
}