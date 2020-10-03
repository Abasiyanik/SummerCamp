package day60_collection;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Queue;

public class QueueInterface {
    public static void main(String[] args) {
        Queue<Integer> q1= new ArrayDeque<>();
        q1.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));// queue accept duplication
        q1.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        System.out.println("q1 = " + q1);
        System.out.println(q1.size());

        int firstobj=q1.poll();// remove from first FIFO
        System.out.println("q1 = " + q1);
        System.out.println(q1.size());

        int firstobj2=q1.poll();
        System.out.println("q1 = " + q1);
        System.out.println(q1.size());
        //queue does not have index number


    }
}
