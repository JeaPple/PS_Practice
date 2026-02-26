package 입출력;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B4_2439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        sb2.append("*");

        for (int i = N; i > 0; i--) {
            for (int j = 0; j < (i - 1); j++) {
                sb1.append(" ");
            }
            sb1.append(sb2).append("\n");
            sb2.append("*");
        }

        System.out.println(sb1);

    }
}
