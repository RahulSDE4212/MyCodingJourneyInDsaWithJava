package Week_11_BinarySearch.ClassWork;

class smallestDivisorKing {
    public static int smallestDivisor(int[] wheat, int threshold) {
        int left = 1, right = getMax(wheat);
        int ans = right;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (isValid(wheat, mid, threshold)) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }

    private static boolean isValid(int[] wheat, int divisor, int threshold) {
        int sum = 0;
        for (int num : wheat) {
            sum += (int) Math.ceil((double) num / divisor);
            if (sum > threshold) return false;
        }
        return sum <= threshold;
    }


    private static int getMax(int[] wheat) {
        int max = 0;
        for (int num : wheat) {
            max = Math.max(max, num);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] wheat1 = {1,2,5,9};
        int threshold = 6;
        System.out.println(smallestDivisor(wheat1, threshold));
    }
}