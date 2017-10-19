package zadanie_1;

import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;

public class RandomNumbers {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        Random rand = new Random(1000);
        double sum = 0;

        for (int i = 0; i <= 50; i++) {
            int randomInt = rand.nextInt(1000);
            set.add(randomInt);
        }

        //średnia
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            sum += iterator.next();
        }
        double avg= sum/set.size();
        System.out.println("średnia: " + avg);


        //liczby większe od średniej
        System.out.println("Liczby większe od średniej:");
        for (Integer s : set) {
            if (s > avg){
                System.out.println(s);
            }
        }


        System.out.println("Najmniejsza z liczb to " + set.first());
        System.out.println("Największa z liczb to " + set.last());
    }

}