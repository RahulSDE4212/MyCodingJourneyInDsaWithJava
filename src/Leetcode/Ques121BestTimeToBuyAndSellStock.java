package Leetcode;

public class Ques121BestTimeToBuyAndSellStock {
    public static int maxPrices(int[] prices){

        /* *********Brute force approach***********
        * *****   Time complexity: O(n^2)
        * *****   Space complexity: O(1)
        */

//        int maxProfit = Integer.MIN_VALUE;
//        for (int i = 0; i < prices.length-1; i++) { // buy
//            for (int j = prices.length-1; j > i ; j--) { // sell
//                if(prices[j] - prices[i] > maxProfit){
//                    maxProfit = prices[j] - prices[i];
//                }
//            }
//        }
//        if(maxProfit>0) return maxProfit;
//        else return 0;

        /* *********Second approach***********
         * *****   Time complexity: O(n)
         * *****   Space complexity: O(n)
         */

//        int n = prices.length;
//        int[] aux = new int[n];
//        int maximum = prices[n-1];
//        for(int i=n-1;i>=0;i--){
//            aux[i] = Math.max(maximum,prices[i]);
//            maximum = aux[i];
//        }
//        for(int ele: aux){
//            System.out.print(ele + " ");
//        }
//        System.out.println();
//        int maxProfit=0;
//        for(int i=0;i<n;i++){
//            int diff = aux[i] - prices[i];
//            maxProfit= Math.max(diff,maxProfit);
//        }
//        return Math.max(maxProfit, 0);

        /* *********Third approach***********
         * *****   Time complexity: O(n)
         * *****   Space complexity: O(1)
         */

        int minPrice = prices[0];
        int maxProfit = 0;
        for(int i=0;i<prices.length;i++){
            minPrice= Math.min(minPrice,prices[i]);
            int diff = prices[i] - minPrice;
            maxProfit = Math.max(diff,maxProfit);

        }
        return (Math.max(maxProfit,0));
    }


    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        int res = maxPrices(prices);
        System.out.println(res);
    }
}
