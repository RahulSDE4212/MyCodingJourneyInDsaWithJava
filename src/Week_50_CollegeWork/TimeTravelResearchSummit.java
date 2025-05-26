package Week_50_CollegeWork;

import java.util.*;

public class TimeTravelResearchSummit {
    public static  int minRooms(int[] start, int[] end) {
        int n = start.length;
        List<int[]> durations = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            durations.add(new int[]{start[i], end[i]});
        }

        durations.sort(Comparator.comparingInt(a -> a[1]));

        int rooms = 1;
        int currentEndTime = -1;

        for (int[] duration : durations) {
            if (duration[0] < currentEndTime) {
                rooms++;
            } else {
                currentEndTime = duration[1];
            }
        }

        return rooms;
    }

    public static void main(String[] args) {
        int[] start1 = {1, 10, 7};
        int[] end1 = {4, 15, 10};
        System.out.println(minRooms(start1, end1));

        int[] start2 = {2, 9, 6};
        int[] end2 = {4, 12, 10};
        System.out.println(minRooms(start2, end2));
    }
}
