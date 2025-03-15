package Week_11_BinarySearch.ClassWork;

class Koko {
    public static int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        long low = 1;
        long high = 0;
        
        for (int i = 0; i < n; i++) {
            high = Math.max(high, piles[i]);
        }
        
        long ans = 0;
        
        while (low <= high) {
            long hours = 0;
            long mid = low + (high - low) / 2;
            
            for (int i = 0; i < n; i++) {
                if (piles[i] % mid == 0) {
                    hours += piles[i] / mid;
                } else {
                    hours += piles[i] / mid + 1;
                }
            }
            
            if (hours <= h) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return (int) ans;
    }
    
    public static void main(String[] args) {
        int[] piles = {3, 6, 7, 11};
        int h = 8;
        System.out.println("Minimum eating speed: " + minEatingSpeed(piles, h));
    }
}