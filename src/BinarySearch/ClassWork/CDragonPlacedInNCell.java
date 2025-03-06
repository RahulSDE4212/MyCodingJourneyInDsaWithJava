package BinarySearch.ClassWork;

import java.util.*;

class CDragonPlacedInNCell {
    public static int maxMinDistance(int n, int k, int[] nests) {
        Arrays.sort(nests);
        
        int left = 1;
        int right = nests[n - 1] - nests[0];
        int result = 0;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (canPlaceDragons(nests, n, k, mid)) {
                result = mid; 
                left = mid + 1;
            } else {
                right = mid - 1; 
            }
        }
        
        return result;
    }
    
    private static boolean canPlaceDragons(int[] nests, int n, int k, int minDist) {
        int count = 1;
        int lastPlaced = nests[0];

        for (int i = 1; i < n; i++) {
            if (nests[i] - lastPlaced >= minDist) {
                count++;
                lastPlaced = nests[i];
                
                if (count == k) return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] nests = new int[n];
        
        for (int i = 0; i < n; i++) {
            nests[i] = sc.nextInt();
        }
        
        System.out.println(maxMinDistance(n, k, nests));
    }
}