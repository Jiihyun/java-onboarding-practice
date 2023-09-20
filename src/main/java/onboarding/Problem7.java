package onboarding;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Problem7 {
    public static List<String> solution(String user, List<List<String>> friends, List<String> visitors) {
        Map<String, Integer> hashMap = new HashMap<>();

        int count = 1;
        for (String visitor : visitors) {
            if (hashMap.containsKey(visitor)) {
                count++;
            }
            hashMap.put(visitor, count);
        }

        List<String> answer = Collections.emptyList();
        return answer;
    }
}
