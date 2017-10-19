package zadanie_3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class NumberSet {
    public static void main(String[] args) {

        String fileName = "numbers.txt";
        Set<Integer> set = new TreeSet<>();
        ArrayList<Integer> list = new ArrayList<>();

        try (
                FileReader fileReader = new FileReader(fileName);
                BufferedReader reader = new BufferedReader(fileReader);) {
            String nextLine = null;

            while ((nextLine = reader.readLine()) != null) {
                Integer num = Integer.parseInt(nextLine);
                list.add(num);
                set.add(num);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (Integer s : set) {
            int count = 0;
            for (Integer l : list) {
                if (s.equals(l)) {
                    count++;
                }
            }
            System.out.println(s + "- wystepuje: " + count);

        }

    }
}

