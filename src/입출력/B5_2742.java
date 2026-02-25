package 입출력;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B5_2742 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
//        StringTokenizer st;
        String str;

        int N = Integer.parseInt(br.readLine());

        for (int i = N; i > 0; i--) {
            System.out.println(i);
        }

    }
}
