package Week_50_CollegeWork;

import java.io.*;
import java.util.*;

public class SubarrayDivisibility {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        long[] array = new long[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            array[i] = Long.parseLong(st.nextToken());
        }

        HashMap<Long, Long> map = new HashMap<>();
        map.put(0L, 1L);
        long sum = 0;
        long count = 0;
        for (int i = 0; i < n; i++) {
            sum += array[i];
            long newTarget = ((sum % n )+ n) % n;
            if (map.containsKey(newTarget)) {
                count += map.get(newTarget);
            }
            map.put(newTarget, map.getOrDefault(newTarget, 0L) + 1);
        }

        System.out.println(count);
    }
}
