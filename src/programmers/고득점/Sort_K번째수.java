package programmers.고득점;

import java.util.Arrays;

public class Sort_K번째수 {
    public static void main(String[] args) {

        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        int[] answer = new int[commands.length];


        // start
        for (int i = 0; i < commands.length; i++) {
            int[] bucket = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
            Arrays.sort(bucket);
            answer[i] = bucket[commands[i][2] - 1];
        }

        // end
        System.out.println(Arrays.toString(answer));

    }
}
