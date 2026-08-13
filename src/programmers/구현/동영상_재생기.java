package programmers.구현;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class 동영상_재생기 {
    public static void main(String[] args) {
        String video_len = "34:33";
        String pos = "13:12";
        String op_start = "00:55";
        String op_end = "02:55";
        String[] commands = {"next", "prev", "prev"};
        String answer = "";

        /// ------------------- start -------------------

        // 초단위 정수자료형으로 변경
        String[] arr1 = video_len.split(":");
        int videoLenSec = (Integer.parseInt(arr1[0]) * 60) + Integer.parseInt(arr1[1]);
        String[] arr2 = pos.split(":");
        int posSec = (Integer.parseInt(arr2[0]) * 60) + Integer.parseInt(arr2[1]);
        String[] arr3 = op_start.split(":");
        int opStartSec = (Integer.parseInt(arr3[0]) * 60) + Integer.parseInt(arr3[1]);
        String[] arr4 = op_end.split(":");
        int opEndSec = (Integer.parseInt(arr4[0]) * 60) + Integer.parseInt(arr4[1]);

        for (String command : commands) {
            // 시작 시 오프닝 구간인지 확인
            if (posSec >= opStartSec && posSec <= opEndSec){
                posSec = opEndSec;
            }

            if (command.equals("next")) {
                posSec += 10;
                if (posSec > videoLenSec) {
                    posSec = videoLenSec;
                }
            } else {
                posSec -= 10;
                if (posSec < 0) {
                    posSec = 0;
                }
            }
        }

        // 시작 시 오프닝 구간인지 확인
        if (posSec >= opStartSec && posSec <= opEndSec){
            posSec = opEndSec;
        }

        int min = posSec / 60;
        int sec = posSec % 60;

        answer += (min > 10) ? min : "0" + min;
        answer += ":";
        answer += (sec > 10) ? sec : "0" + sec;



        /// ------------------- end -------------------



        /* 이전 풀이

        /// ------------------- start -------------------
        LocalTime zeroTime = LocalTime.of(0, 0, 0);

        // 시간 자료형으로 변경
        LocalTime videoLenTime = LocalTime.parse("00:" + video_len);
        LocalTime posTime = LocalTime.parse("00:" + pos);
        LocalTime opStartTime = LocalTime.parse("00:" + op_start);
        LocalTime opEndTime = LocalTime.parse("00:" + op_end);

        // command 배열 순차적으로 돌면서 확인
        for (String command : commands) {

            // 시작 시 오프닝 구간인지 확인
            if ((posTime.isAfter(opStartTime) || posTime.equals(opStartTime)) &&
                    (posTime.isBefore(opEndTime) || posTime.equals(opEndTime))) {
                posTime = LocalTime.parse("00:" + op_end);
            }

            if (command.equals("next")) {
                posTime = posTime.plusSeconds(10);
                if (posTime.isAfter(videoLenTime)) {
                    posTime = videoLenTime;
                }
            } else {
                if (posTime.isBefore(LocalTime.of(0, 0, 10))) {
                    posTime = zeroTime;
                } else{
                    posTime = posTime.minusSeconds(10);
                }
            }
        }

        // 시작 시 오프닝 구간인지 확인
        if ((posTime.isAfter(opStartTime) || posTime.equals(opStartTime)) &&
                (posTime.isBefore(opEndTime) || posTime.equals(opEndTime))) {
            posTime = LocalTime.parse("00:" + op_end);
        }


        answer = posTime.format(DateTimeFormatter.ofPattern("mm:ss"));
        /// ------------------- end -------------------
         */
        System.out.println(answer);

    }
}
