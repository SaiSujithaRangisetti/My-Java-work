package Collections.Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
//add and offer to enter elements
//peek is to search the 1st element
//poll and remove are used to remove elements
public class Prog1 {
    public static void main(String[] args) {
        Queue<String> q1=new ArrayBlockingQueue<>(100);
        q1.add("Chalapathi");
        q1.offer("CIET");
        q1.add("Welcomee");
        System.out.println(q1.offer("Lam"));
        System.out.println(q1.peek());
        System.out.println(q1.poll());
        System.out.println(q1.remove());
        System.out.println(q1);
    }
}
