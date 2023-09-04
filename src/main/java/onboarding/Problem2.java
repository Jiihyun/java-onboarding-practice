package onboarding;

import java.util.*;
import java.util.stream.Collectors;

public class Problem2 {
    public static String solution(String cryptogram) {
        String[] stringArr = cryptogram.split("");
        Stack<String> stack = new Stack<>();
        for (String str : stringArr) {
            if (!stack.empty() && stack.lastElement().equals(str)) {
                stack.pop();
            } else {
                stack.push(str);
            }
        }
        return String.join("", stack);
    }
}
