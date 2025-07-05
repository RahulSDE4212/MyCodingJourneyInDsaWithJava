package Week_26_Greedy.Leetcode;
import java.util.*;

//  https://leetcode.com/problems/boats-to-save-people/description/

class CountNumberOfBoatsToSavePeople {
    public int numRescueBoats(int[] people, int limit) {
        int n = people.length;
        
        Arrays.sort(people);
        
        int noOfBoat = 0;
        int start = 0, end = n - 1;
        while(start <= end){
            if(people[start] + people[end] <= limit){
                start++;
                end--;
            }
            else{
                end--;
            }
            noOfBoat++;
        }

        return noOfBoat;
    }
}