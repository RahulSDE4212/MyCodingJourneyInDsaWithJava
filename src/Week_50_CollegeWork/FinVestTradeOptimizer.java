package Week_50_CollegeWork;

public class FinVestTradeOptimizer {

    public static int minTradeLimit(int[] weights, int days) {
        int left = 0, right = 0;

        for (int w : weights) {
            left = Math.max(left, w);
            right += w;
        }

        int answer = right;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (canShip(weights, days, mid)) {
                answer = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return answer;
    }

    private static boolean canShip(int[] weights, int days, int capacity) {
        int currentLoad = 0;
        int requiredDays = 0;

        for (int w : weights) {
            if (currentLoad + w > capacity) {
                requiredDays++;
                currentLoad = 0;
            }
            currentLoad += w;
        }

        if(currentLoad <= capacity) requiredDays++;

        return requiredDays <= days;
    }


    public static void main(String[] args) {
        int[] weights1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int days1 = 5;
        System.out.println(minTradeLimit(weights1, days1)); // Output: 15

        int[] weights2 = {3, 2, 2, 4, 1, 4};
        int days2 = 3;
        System.out.println(minTradeLimit(weights2, days2)); // Output: 6

        int[] weights3 = {1, 2, 3, 1, 1};
        int days3 = 4;
        System.out.println(minTradeLimit(weights3, days3)); // Output: 3
    }
}