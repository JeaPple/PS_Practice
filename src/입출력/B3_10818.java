package 입출력;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B3_10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int max = arr[0];
        int min = max;
        for (int i = 1; i < N; i++) {
            if (arr[i] > max) {
                max = arr[i];
            } else if (arr[i] < min){
                min = arr[i];
            }
        }

        System.out.println(min + " " + max);

    }
}
