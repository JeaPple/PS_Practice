package programmers.고득점;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sort_가장큰수 {
    public static void main(String[] args) {
        String answer = "";
        int[] numbers = {0, 0};

        // start
        List<String> stringList = new ArrayList<>();
        for (int number : numbers) {
            String s = String.valueOf(number);
            stringList.add(s);
        }

        stringList.sort((a, b) ->
            (b + a).compareTo(a + a)
        );

        StringBuilder sb = new StringBuilder();
        if (stringList.get(0).equals("0")) {
            sb.append("0");
        } else {
            for (String string : stringList) {
                sb.append(string);
            }
        }

        answer = sb.toString();

        // end
        System.out.println("answer = " + answer);
    }
}
