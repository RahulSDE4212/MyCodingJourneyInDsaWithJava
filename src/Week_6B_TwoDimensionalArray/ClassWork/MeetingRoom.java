package Week_6B_TwoDimensionalArray.ClassWork;
import java.util.*;
public class MeetingRoom {
        public static void main(String[] args) {
            int[][] meeting = {{0, 2}, {4, 6}, {1, 3}, {3, 6},{8, 9}, {7, 9}};
            int ans = findRoom(meeting);
            System.out.println(ans);
        }

        private static int findRoom(int[][] meeting) {
            Arrays.sort(meeting, (a, b) -> Integer.compare(a[0], b[0]));
            PriorityQueue<Integer> minHeap = new PriorityQueue<>();
            
            for (int[] m : meeting) {
                if (!minHeap.isEmpty() && minHeap.peek() <= m[0]) {
                    minHeap.poll();
                }

                minHeap.add(m[1]);
            }

            return minHeap.size();
        }
}
