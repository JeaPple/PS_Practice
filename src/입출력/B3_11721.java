package 입출력;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B3_11721 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str;

        /**
         * Math.min으로 푸는 방식
         * 끝 지점을 비교하여 찾는 방식
         */
        str = br.readLine();

        for (int i = 0; i < str.length(); i += 10) {
            int end = Math.min(i+10, str.length());
            sb.append(str.substring(i, end)).append("\n");
        }
        System.out.println(sb);


        /**
         * 내가 풀었던 방식
        str = br.readLine();
        int mok = str.length() / 10;
        int num = 0;

        for (int i = 0; i <= mok; i++){
            String substring;

            if (i == mok) {
                substring = str.substring(num);
                sb.append(substring);
                break;
            }

            substring = str.substring(num, num + 10);
            sb.append(substring).append("\n");
            num += 10;

        }

        System.out.println(sb);
        */

    }
}
