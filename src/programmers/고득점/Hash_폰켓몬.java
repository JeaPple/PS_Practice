package programmers.고득점;

import java.util.HashSet;
import java.util.Set;

public class Hash_폰켓몬 {
    public static void main(String[] args) {
        int answer = 0;
        int[] nums = {1,2,3,4,5,6,1,1};

        // start
        Set<Integer> numSet = new HashSet<>();

        for (int number : nums) {
            numSet.add(number);
        }

        int benchMark = nums.length / 2;

//        if (numSet.size() >= benchMark) {
//            answer = benchMark;
//        } else {
//            answer = numSet.size();
//        }

        answer = Math.min(numSet.size(), benchMark);

        // end

        System.out.println(answer);

    }
}
