package Week_50_CollegeWork;
import java.util.*;
public class TaxiBooking {

    public static int minimumTime(int N, int cur, int[] pos, int[] time) {
        int minTime = Integer.MAX_VALUE;

        for (int i = 0; i < N; i++) {
            int distance = Math.abs(pos[i] - cur);
            int totalTime = distance * time[i];
            minTime = Math.min(minTime, totalTime);
        }

        return minTime;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of taxi: ");
        int N = sc.nextInt();

        System.out.println("Enter your location: ");
        int cur = sc.nextInt();

        System.out.println("Enter the positions of all taxi: ");
        int[] pos = new int[N];
        for(int i = 0; i < N ; i++){
            pos[i] = sc.nextInt();
        }

        System.out.println("Enter time take to cover 1 unit distance: ");
        int[] time = new int[N];
        for(int i = 0; i < N ; i++){
            time[i] = sc.nextInt();
        }

        int answer = minimumTime(N, cur, pos, time);
        System.out.println(answer);
    }
}
