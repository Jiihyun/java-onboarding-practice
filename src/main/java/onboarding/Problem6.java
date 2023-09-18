package onboarding;

import java.util.*;
import java.util.stream.Collectors;

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
//        System.out.println("forms = " + forms);
    }

    public static List<String> solution(List<List<String>> forms) {
        ArrayList<String> names = new ArrayList<>(); //names = [제이엠, 제이슨, 워니, 엠제이, 이제엠]

        for (List<String> form : forms) {
            names.add(form.get(1));
        }

        List<String[]> collect = names.stream().map(name -> name.split("")).collect(Collectors.toList());
        HashSet<String> hashSet = new HashSet<>(); //hashSet = [이제, 제이, 이엠, 워니, 엠제, 이슨, 제엠]

        for (String[] splitedName : collect) {
//            System.out.println("splitedName = " + splitedName);
            for (int i = 0; i < splitedName.length - 1; i++) {
                hashSet.add(splitedName[i] + splitedName[i + 1]);
            }
        }
//        System.out.println("hashSet = " + hashSet);

        List<String> answer = new ArrayList<>();
        for (String duplicatedWord : hashSet) {
            List<List<String>> collect1 = forms.stream().filter(nameList -> nameList.get(1).contains(duplicatedWord)).collect(Collectors.toList());
            if (collect1.size() >= 2) {

                for (List<String> strings : collect1) {
                    answer.add(strings.get(0));
                }
            }

        }
        answer.sort((o1, o2) -> o1.compareTo(o2));

//        System.out.println("anw = " + answer);
        return answer;
    }
}
