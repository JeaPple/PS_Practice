package programmers.고득점;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hash_의상 {
    public static void main(String[] args) {
        String[][] clothes = {{"yellow_hat", "headgear"},
                {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}, {"black_jeans", "pants"}};
        int answer = 1;

        // start

        // 카테고리 분류
        Map<String, Integer> clothesMap = new HashMap<>();
        for (String[] clothe : clothes) {
            clothesMap.put(clothe[1], clothesMap.getOrDefault(clothe[1], 0) + 1);
        }

        Set<String> keySet = clothesMap.keySet();
        for (String key : keySet) {
            answer *= (clothesMap.get(key) + 1);
        }






        // end

        System.out.println(answer - 1);


    }
}
