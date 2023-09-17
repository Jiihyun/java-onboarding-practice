package onboarding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem5 {
    public static void main(String[] args) {
        List<Integer> solution = solution(50237);
        System.out.println(solution);

    }
    public static List<Integer> solution(int money) {
        List<Integer> answer = new ArrayList<>();
        List<Integer> unitOfMoney = List.of(50000, 10000, 5000, 1000, 500, 100, 50, 10, 1);

        for (Integer unit : unitOfMoney) {
            answer.add(money / unit);
            money %= unit;
        }

        return answer;
    }
}
