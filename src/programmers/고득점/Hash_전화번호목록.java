package programmers.고득점;

import java.util.*;

public class Hash_전화번호목록 {
    public static void main(String[] args) {
        boolean answer = true;
        String[] phone_book = {"123", "13", "789", "121290837"};

        // start
        Arrays.sort(phone_book);
        for (int i = 0; i < phone_book.length - 1; i++) {
            if (phone_book[i + 1].startsWith(phone_book[i])) {
                answer = false;
                break;
            }
        }


        /**
         * 조금 더 직관적인 풀이
         *
        Set<String> phoneSet = new HashSet<>();
        for (String phone : phone_book) {
            phoneSet.add(phone);
        }

        for (String phoneNumeber : phone_book) {
            for (int i = 1; i < phoneNumeber.length() - 1; i++) {
                String substring = phoneNumeber.substring(0, i);

                if (phoneSet.contains(substring)) {
                    answer = false;
                    break;
                }
            }
        }
         */





        /**
         * 1차 시도, 시간복잡도: o(Nxk)
         *
        Set<Integer> lengthSet = new HashSet<>();
        Set<String> bucket = new HashSet<>();
        for (String s : phone_book) {
            lengthSet.add(s.length());
            bucket.add(s);
        }

        for (Integer ls : lengthSet) {
            for (String bucketStr : bucket) {
                if (ls > bucketStr.length()) {
                    continue;
                }
                String subString = bucketStr.substring(0, ls);

                if (bucket.contains(subString)) {
                    answer = false;
                    break;
                }

                System.out.println(subString);
            }
        }

        */
        // end

        System.out.println(answer);
    }
}
