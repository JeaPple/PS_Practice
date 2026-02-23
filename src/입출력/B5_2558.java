package 입출력;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B5_2558 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[2];

        for (int i = 0; i < 2; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        System.out.println(arr[0] + arr[1]);


    }
}
