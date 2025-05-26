package Week_23_SlidingWindow.ClassWork;

import java.util.HashMap;

class _3_CountNumberOfAnagram {

    public static int search(String pat, String txt) {

        int n = txt.length();
        int m = pat.length();

        HashMap<Character, Integer> mapPat = new HashMap<>();// txt ka character store kara liya
        for(int i = 0; i < m; i++){
            mapPat.put(pat.charAt(i), mapPat.getOrDefault(pat.charAt(i), 0) + 1);
        }
        
        int count = 0;
        for(int i = 0; i < n - m + 1; i++){
            HashMap<Character, Integer> maptxt = new HashMap<>();
            for(int j = i; j < i + m; j++){
                maptxt.put(txt.charAt(j), maptxt.getOrDefault(txt.charAt(j), 0) + 1);
            }

            boolean bool = true;
            for(char ch : maptxt.keySet()){
                if(mapPat.containsKey(ch)) {
                    if(mapPat.get(ch) != maptxt.get(ch)){
                        bool = false;
                        break;
                    }
                }
                else bool = false;
            }

            if(bool) count++;
        }

        return count;
    }


    public static void main(String[] args) {
        String txt = "forxxorfxdofr";
        String pat = "for";

        int answer = search(pat, txt);
        System.out.println(answer);
    }
}