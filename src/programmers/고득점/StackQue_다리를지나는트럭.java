package programmers.고득점;

import java.util.*;

public class StackQue_다리를지나는트럭 {
    public static void main(String[] args) {
        int bridge_length = 100;
        int weight = 100;
        int[] truck_weights = {10,10,10,10,10,10,10,10,10,10};
        int answer = 0;

        /// start
        int crossingWeight = 0;
        int time = 0;
        int truckArrInt = 0;
        Queue<Integer> crossingTruck = new ArrayDeque<>();
        Queue<Integer> crossingTime = new ArrayDeque<>();

        List<Integer> testList = new ArrayList<>();


        while (!crossingTruck.isEmpty() || truck_weights.length - 1 >= truckArrInt) {
            time++;
            System.out.println();
            System.out.println("time = " + time);


            for (int i = 0; i < crossingTime.size(); i++) {
                crossingTime.offer(crossingTime.poll() + 1);
            }

            // 다 지나간 트럭 빼기
            if (!crossingTime.isEmpty() && bridge_length < crossingTime.peek()) {
                crossingTime.poll();
                Integer poll = crossingTruck.poll();
                testList.add(poll);
                crossingWeight -= poll;
                System.out.println("testList = " + testList);
            }

            if (truckArrInt < truck_weights.length && weight >= crossingWeight + truck_weights[truckArrInt]) {
                // 다리 건너는 트럭
                crossingTruck.offer(truck_weights[truckArrInt]);
                crossingWeight += truck_weights[truckArrInt];
                crossingTime.offer(1);
                truckArrInt++;
                System.out.println("truckArrInt = " + truckArrInt);
            }



            System.out.println("crossingTruck = " + crossingTruck);
            System.out.println("crossingTime = " + crossingTime);
        }

        answer = time;

        /// end

        System.out.println("answer = " + answer);

    }
}
