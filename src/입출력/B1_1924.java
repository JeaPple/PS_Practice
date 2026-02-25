package 입출력;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1_1924 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        String str;
        String[] WEEK = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        int[] MONTH = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        st = new StringTokenizer(br.readLine());
        int month = Integer.parseInt(st.nextToken());
        int day = Integer.parseInt(st.nextToken());

        int sum = 0;

        for (int i = 0; i < month - 1; i++) {
            sum += MONTH[i];
        }

        sum += day;
        System.out.println(WEEK[sum % 7]);


    }
}
