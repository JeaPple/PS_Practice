package programmers.고득점;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class StackQue_프로세스 {
    public static void main(String[] args) {
        int answer = 0;
        int[] priorities = {2, 1, 3, 2};
        int location = 2;

        /**
         * 배열순회로 정리
         */
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int num : priorities) {
            pq.offer(num);
        }








        /**
         * 기존 풀이 1.
         * 단점: 자료구조의 갯수가 많다.

        Queue<Integer> intPriorities = new ArrayDeque<>();
        Queue<Integer> quePriorities = new ArrayDeque<>();
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
        Queue<Integer> returnQue = new ArrayDeque<>();


        for (int i = 0; i < priorities.length; i++) {
            intPriorities.offer(i);
            quePriorities.offer(priorities[i]);
            priorityQueue.offer(priorities[i]);
        }



        while (!quePriorities.isEmpty()) {
            if (quePriorities.peek() >= priorityQueue.peek()) {
                returnQue.offer(intPriorities.poll());
                quePriorities.poll();
                priorityQueue.poll();
            } else {
                intPriorities.offer(intPriorities.poll());
                quePriorities.offer(quePriorities.poll());
            }
        }

        System.out.println("returnQue!! = " + returnQue);


        for (int i = 0; i < priorities.length; i++) {
            if (location == returnQue.poll()) {
                answer = i + 1;
                break;
            }
        }

        */


        System.out.println("answer = " + answer);


    }
}
