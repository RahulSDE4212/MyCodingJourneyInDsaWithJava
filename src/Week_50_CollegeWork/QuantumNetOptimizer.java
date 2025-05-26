package Week_50_CollegeWork;

import java.util.Arrays;

public class QuantumNetOptimizer {
    public static int maxMinMagneticForce(int[] position, int m) {
        Arrays.sort(position);
        int left = 1, right = position[position.length - 1] - position[0], result = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (canPlaceMNodes(position, m, mid)) {
                result = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }

    private static boolean canPlaceMNodes(int[] position, int m, int minForce) {
        int count = 1, lastPlaced = position[0];

        for (int i = 1; i < position.length; i++) {
            if (position[i] - lastPlaced >= minForce) {
                count++;
                lastPlaced = position[i];

                if (count == m) return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] position1 = {1, 2, 3, 4, 7};
        int m1 = 3;
        System.out.println(maxMinMagneticForce(position1, m1));

        int[] position2 = {5, 4, 3, 2, 1, 1000000000};
        int m2 = 2;
        System.out.println(maxMinMagneticForce(position2, m2));
    }
}