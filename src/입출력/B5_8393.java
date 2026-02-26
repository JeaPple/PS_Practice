package 입출력;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B5_8393 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int sum = 0;

        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i <= N; i++) {
            sum += i;
        }

        System.out.println(sum);
    }
}
