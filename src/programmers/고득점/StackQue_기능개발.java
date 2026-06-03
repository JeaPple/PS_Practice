package programmers.고득점;

import java.util.*;

public class StackQue_기능개발 {
    public static void main(String[] args) {
        int[] answer;
        int[] progresses = {95, 90, 99, 99, 80, 99};
        int[] speeds = {1, 1, 1, 1, 1, 1};


        /// start
        Stack<Integer> answerStack = new Stack<>();
        int complete = 0;


        for (int i = 0; i < progresses.length; i++) {
            // 남은 작업 기간 계산
            int remainProgress = 100 - progresses[i];
            int completeDay = (int) Math.ceil(
                    ((double) remainProgress) / speeds[i]
            );


            // 대기 작업 분류
            if (complete >= completeDay) {
                answerStack.push(answerStack.pop() + 1);
            } else {
                answerStack.push(1);
                complete = completeDay;
            }

        }
        answer = answerStack.stream().mapToInt(a -> a).toArray();
        /// end

        System.out.println("answer = " + Arrays.toString(answer));


    }
}
