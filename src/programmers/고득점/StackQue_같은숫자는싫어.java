package programmers.고득점;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StackQue_같은숫자는싫어 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 3, 0, 1, 1};
        int[] answer = {};

        /// start
        List<Integer> arrList = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if ((i > 0) && (arr[i - 1] == arr[i])) {
                continue;
            }
            arrList.add(arr[i]);
        }

        answer = arrList.stream().mapToInt(i -> i).toArray();


        /// end

        System.out.println("answer = " + Arrays.toString(answer));

        String[] strArr = {"test", "banna", "abcd"};
        List<String> stringList = new ArrayList<>(List.of(strArr));

        String[] testArr2 = stringList.toArray(new String[0]);
        System.out.println("testArr2 = " + Arrays.toString(testArr2));
        String[] testArr = stringList.stream().map(a -> a + "hihi").toArray(a -> new String[a]);
        System.out.println("testArr = " + Arrays.toString(testArr));


    }
}
