package programmers.구현;

import java.util.*;

public class JadenCase_문자열_만들기 {
    public static void main(String[] args) {
        String s = "  3Peo  pl e unFollowed me";

        /// ---------------- start
        // 첫번째 문자열 확인
        StringBuilder sb = new StringBuilder();
        sb.append(Character.toUpperCase(s.charAt(0)));
        for (int i = 1; i < s.length(); i++) {
            // 공백 이후 문자열일 경우
            if (s.charAt(i - 1) == (' ')) {
                sb.append(Character.toUpperCase(s.charAt(i)));
            } else {
                sb.append(Character.toLowerCase(s.charAt(i)));
            }

        }


//        String[] splArr = s.split(" ");
//        StringBuilder sb = new StringBuilder();
//
//
//        for (int i = 1; i < splArr.length; i++) {
//            sb.append(" ").
//                    append(Character.toUpperCase(splArr[i].charAt(0))).
//                    append(splArr[i].substring(1).toLowerCase());
//
//        }
//
        String answer = sb.toString();
        /// ---------------- end

        System.out.println(answer);



    }
}
