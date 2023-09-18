package onboarding;

import java.util.ArrayList;
import java.util.List;

public class Problem6 {
    public static void main(String[] args) {
        List<List<String>> forms = List.of(
                    List.of("jm@email.com", "제이엠"),
                    List.of("jason@email.com", "제이슨"),
                    List.of("woniee@email.com", "워니"),
                    List.of("mj@email.com", "엠제이"),
                    List.of("nowm@email.com", "이제엠")
            );
        solution(forms);
    }
    public static List<String> solution(List<List<String>> forms) {
        ArrayList<String> names = new ArrayList<>();
        for (List<String> form : forms) {
            names.add(form.get(1));
        }
        List<String> answer = List.of("answer");
        return answer;
    }
}
