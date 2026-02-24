package 입출력;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B3_11718 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
//        StringTokenizer st;
        String str;

        while ((str = br.readLine()) != null) {
            sb.append(str).append("\n");
        }

        System.out.println(sb);
    }
}
