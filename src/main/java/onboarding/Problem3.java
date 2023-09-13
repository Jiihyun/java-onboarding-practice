package onboarding;

import java.util.ArrayList;
import java.util.Arrays;

public class Problem3 {
    public static void main(String[] args) {
        int solution = solution(33);
        System.out.println("solution = " + solution);
    }

    public static int solution(int number) {
        int count = 1;
        int answer = 0;

        StringBuilder sb = new StringBuilder();

        while (count <= number) {
            String s = String.valueOf(count);
            sb.append(s);
            count++;
        }

        String string = sb.toString();
        String[] split = string.split(""); //or char로도 할 수 있음
        for (String s : split) {
            if (s.equals("3") || s.equals("6") || s.equals("9")) {
                answer++;
            }
        }
//        int answer = (int) Arrays.stream(split).filter(n -> n.contains("3")).count();
//        answer += (int) Arrays.stream(split).filter(n -> n.contains("6")).count();
//        answer += (int) Arrays.stream(split).filter(n -> n.contains("9")).count();
        return answer;
    }
}
