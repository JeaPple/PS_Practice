package 입출력;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B5_10950 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int inputN = Integer.parseInt(br.readLine());

        int[] intArr = new int[inputN];
        for (int i = 0; i < inputN; i++) {
            String[] arr = br.readLine().split(" ");
            sb.append(Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]) + "\n");
        }

        System.out.println(sb);



    }
}
