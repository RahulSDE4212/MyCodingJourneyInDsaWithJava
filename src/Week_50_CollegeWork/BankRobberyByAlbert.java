package Week_50_CollegeWork;

import java.util.*;

public class BankRobberyByAlbert {

    public static class Pair{
        long weight;
        long profit;
        double ratio;

        Pair(long weight, long profit) {
            this.weight = weight;
            this.profit = profit;
            this.ratio = (double) profit / weight;
        }

    }

    public static boolean isPerfectSquare(long x) {
        long sqrt = (long)Math.sqrt(x);
        return sqrt * sqrt == x;
    }

    public static double maximumProfit(int N, long C, long[] w, long[] p) {
        ArrayList<Pair> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            if (!isPerfectSquare(w[i])) {
                list.add(new Pair(w[i], p[i]));
            }
        }

        list.sort((a, b) -> Double.compare(b.ratio, a.ratio));

        double maxProfit = 0.0;

        for (Pair pair : list) {
            if (C == 0) break;

            long takeWeight = Math.min(C, pair.weight);
            maxProfit += takeWeight * pair.ratio;
            C -= takeWeight;
        }

        return Math.round(maxProfit * 1000.0) / 1000.0;
    }

    public static void main(String[] args) {
        int N = 3;
        long C = 10;
        long[] w = {4, 5, 7};
        long[] p = {8, 5, 4};

        System.out.println(maximumProfit(N, C, w, p));
    }
}
