package programmers.구현;

import java.util.*;

public class 신고_결과_받기 {
    public static void main(String[] args) {
        String[] id_list = {"con", "ryan"};
        String[] report = {"ryan con", "ryan con", "ryan con", "ryan con"};
        int k = 3;

        /// ------------------- start -------------------

        // 1. 신고 추합하기
        Map<String, Set<String>> attackMap = new HashMap<>();
        for (String str : report) {
            String[] listId = str.split(" ");

            Set<String> attackedSet = attackMap.get(listId[0]);

            if (attackedSet == null) {
                attackedSet = new HashSet<>();
                attackedSet.add(listId[1]);
            } else{
                attackedSet.add(listId[1]);
            }
            attackMap.put(listId[0], attackedSet);
        }


        // 2. 누적 신고 유저 추합하기
        Map<String, Integer> reportUserMap = new HashMap<>();

        for (Set<String> s : attackMap.values()) {
            for (String attackUser : s) {
                reportUserMap.put(attackUser, reportUserMap.getOrDefault(attackUser, 0) + 1);
            }
        }

        // 3. 메일 보내기
        int[] answer = new int[id_list.length];

        for (int i = 0; i < id_list.length; i++) {
            String s = id_list[i];
            if (attackMap.get(s) != null) {
                for (String attack : attackMap.get(s)) {
                    if (reportUserMap.get(attack) >= k) {
                        answer[i] += 1;
                    }
                }

            }
        }

        /// ------------------- end -------------------

        System.out.println(Arrays.toString(answer));

    }
}
