package Collections.Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorQueue {
    public static void main(String[] args) {
        Queue<Integer> q1=new PriorityQueue<>();
        q1.add(20);
        q1.add(10);
        q1.add(50);
        q1.add(30);
        q1.add(40);
        q1.add(5);
        System.out.println(q1);
    }
}
