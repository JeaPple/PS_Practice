package programmers.구현;

import java.util.*;

public class 개인정보_수집_유효기간 {
    public static void main(String[] args) {
        String today = "2022.05.19";
        String[] terms = {"A 6", "B 12", "C 3"};
        String[] privacies = {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};

        /// ----------- start
        // 0. today값 변환
        String[] splitArr = today.split("\\.");
        int todayDay = (Integer.parseInt(splitArr[0]) * 12 * 28)
                + (Integer.parseInt(splitArr[1]) * 28)
                + Integer.parseInt(splitArr[2]);
//        System.out.println(todayDay);


        // 1. terms의 값들을 hashmap에 옮긴뒤 day값으로 변환
        Map<String, Integer> termsMap = new HashMap<>();
        for (String s : terms) {
            String[] arr = s.split(" ");
            termsMap.put(arr[0], Integer.parseInt(arr[1]) * 28);
        }


        // 2. privacies의 값들을 for문을 돌면서 유효기간이 지난 after값들을 구한 뒤 배열에 넣기.
        int[] afterPrivacy = new int[privacies.length];
        for (int i = 0; i < afterPrivacy.length; i++) {
            String[] arr1 = privacies[i].split(" ");
            String day = arr1[0];
            String limit = arr1[1];

            String[] arr2 = day.split("\\.");
            int privacyDay = (Integer.parseInt(arr2[0]) * 12 * 28)
                    + (Integer.parseInt(arr2[1]) * 28)
                    + Integer.parseInt(arr2[2]);

            // 유효기간 더한 값 배열에 추가
            int limitDay = termsMap.get(limit);
            afterPrivacy[i] = privacyDay + limitDay;
        }
//        System.out.println(Arrays.toString(afterPrivacy));

        // 3. privacies의 for문(i값)을 돌면서 today와 비교하여 answer값 추출
        List<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < afterPrivacy.length; i++) {
            if (afterPrivacy[i] <= todayDay) {
                resultList.add(i + 1);
            }
        }

        int[] answer = resultList.stream().mapToInt(i -> i).toArray();
        /// ----------- end
        System.out.println("answer = " + Arrays.toString(answer));


    }

}
