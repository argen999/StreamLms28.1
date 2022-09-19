package main;

import java.util.*;



public class Main {
    static Random random = new Random();
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            arrayList.add(random.nextInt(1,100) );
            if (arrayList.get(i) % 2 == 0) {
                arrayList1.add(arrayList.get(i) * arrayList.get(i) );
            }
        }
        System.out.println("Эн чон квадрат\n"+arrayList1.stream().sorted().max(Integer::compareTo).get() );
    }
}