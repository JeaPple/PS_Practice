package programmers.구현;

import java.util.*;

public class 주차_요금_계산기 {
    public static void main(String[] args) {

        int[] fees = {1, 461, 1, 10};
        String[] records = {"00:00 1234 IN"};


        /// --------------------- start
        Map<String, Integer> inMap = new HashMap<>();
        Map<String, Integer> parkTimeMap = new HashMap<>();


        for (String record : records) {
            String[] spl = record.split(" ");
            String[] timeSpl = spl[0].split(":"); // 시간 추출
            int time = (Integer.parseInt(timeSpl[0]) * 60) + (Integer.parseInt(timeSpl[1]));
            String number = spl[1];            // 번호 추출

            if (spl[2].equals("IN")) {
                inMap.put(number, time);
            } else{
                int inTime = inMap.get(number);
                int parkTime = time - inTime;
                parkTimeMap.put(number, parkTimeMap.getOrDefault(number, 0) + parkTime);
                inMap.remove(number);
            }
        }

        if (inMap != null) {
            inMap.forEach((number, inTime) ->
                    parkTimeMap.put(number, parkTimeMap.getOrDefault(number, 0) + (1439 - inTime))
            );
        }

        // 요금 계산하기
        parkTimeMap.forEach((number, parkTime) -> {

            if (parkTime <= fees[0]) {
                parkTimeMap.put(number, fees[1]);
            } else{
                int a = (int) Math.ceil((double)(parkTime - fees[0]) / fees[2]);
                parkTimeMap.put(number, (a * fees[3]) + fees[1]);
            }
        });

        // 차량번호 순으로 정렬하기
        List<String> arrayList = new ArrayList<>(parkTimeMap.keySet());
        Collections.sort(arrayList);
        int[] answer = new int[arrayList.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = parkTimeMap.get(arrayList.get(i));
        }

        /// --------------------- end

        System.out.println(Arrays.toString(answer));
    }
}
