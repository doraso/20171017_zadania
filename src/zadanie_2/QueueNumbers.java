package zadanie_2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueNumbers {
    public static void main(String[] args) {
        Queue<Integer> numbersQueue = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        for (int i= 1; i<=10; i++){
            System.out.println("Podaj kolejną liczbę: ");
            int numbers = scanner.nextInt();
            numbersQueue.offer(numbers);
        }
        System.out.println(numbersQueue);


        int sum = 0;
        for (int n : numbersQueue) {
            sb.append(n);
            sb.append('+');
            sum += n;
        }
        sb.replace(sb.length() - 1, sb.length(), "=");
        sb.append(sum);
        System.out.println(sb.toString());


    }
}
