package 입출력;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B4_11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
//        StringTokenizer st;
        String str;

        int n = Integer.parseInt(br.readLine());
        str = br.readLine();
        int num = 0;

        for (int i = 0; i < n; i++) {
            num += str.charAt(i) - '0';
        }


        System.out.println(num);

    }
}
