package programmers.고득점;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Hash_완주하지못선수 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        String answer = "";

        String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion = {"josipa", "filipa", "marina", "nikola"};

        // start

        Arrays.sort(participant);
        Arrays.sort(completion);


        for (int i = 0; i < participant.length; i++) {
            if ( (i == participant.length -1) || !participant[i].equals(completion[i])) {
                answer = participant[i];
                break;
            }
        }

        // end
        System.out.println(answer);
    }
}
