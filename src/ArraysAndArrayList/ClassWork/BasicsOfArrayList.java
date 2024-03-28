package ArraysAndArrayList.ClassWork;

import java.util.ArrayList;

public class BasicsOfArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(6);
        //arr[0] = 10; will give error as it is arraylist not an array.
        arr.add(0,10);
        arr.add(1,20);
        arr.add(2,30);
        arr.add(3,40);
        arr.add(4,50);
        arr.add(5,60);
        System.out.println(arr);
        System.out.println(arr.size());
        for(int i = 0;i<arr.size();i++){
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
        arr.set(2,200);
        System.out.println(arr);
        arr.add(70);
        System.out.println(arr.size());
        System.out.println(arr);




    }
}
