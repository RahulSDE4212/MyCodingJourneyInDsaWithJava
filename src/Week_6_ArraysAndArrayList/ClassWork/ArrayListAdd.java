package Week_6_ArraysAndArrayList.ClassWork;

import java.util.ArrayList;

public class ArrayListAdd {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(list + " " + list.size());
        list.add(20);
        System.out.println(list + " " + list.size());
        list.add(40);
        System.out.println(list + " " + list.size());
        list.add(70);
        System.out.println(list + " " + list.size());
        list.add(45);
        System.out.println(list + " " + list.size());
        list.add(56);
        System.out.println(list + " " + list.size());
        list.remove(1);
        System.out.println(list + " " + list.size());

    }
}
