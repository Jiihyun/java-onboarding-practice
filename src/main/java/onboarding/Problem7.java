package onboarding;

import java.util.*;
import java.util.stream.Collectors;

public class Problem7 {
    public static void main(String[] args) {
        List<List<String>> friends = List.of(
                List.of("donut", "andole"),
                List.of("donut", "jun"),
                List.of("donut", "mrko"),
                List.of("shakevan", "andole"),
                List.of("shakevan", "jun"),
                List.of("shakevan", "mrko")
        );
        List<String> visitors = List.of("bedi", "bedi", "donut", "bedi", "shakevan");

        solution("mrko", friends, visitors);
    }

    public static List<String> solution(String user, List<List<String>> friends, List<String> visitors) {
        Map<String, Integer> hashMap = new HashMap<>();
        List<String> answer = new ArrayList<>();

        for (String visitor : visitors) {
            int count = 0;
            if (!hashMap.containsKey(visitor)) {
                hashMap.put(visitor, count);
            }

            int preCount = hashMap.get(visitor);
            int nextCount = ++preCount;
            hashMap.put(visitor, nextCount);
        }

        for (int i = 0; i < friends.size(); i++) {
            int count = 1;
            String recommendFriend = friends.get(i).get(1);
            if (!recommendFriend.equals(user)) {
                if (hashMap.containsKey(recommendFriend)) {
                    count++;
                }
                hashMap.put(recommendFriend, count * 10);
            }
        }

        List<Map.Entry<String, Integer>> recommendList = hashMap.entrySet().stream().sorted(((o1, o2) -> {
            if (o2.getValue().equals(o1.getValue())) {
                return o1.getKey().compareTo(o2.getKey());
            }
            return o2.getValue() - o1.getValue();
        })).collect(Collectors.toList());


        for (Map.Entry<String, Integer> recommendedName : recommendList) {
            if (answer.size() < 3) {

                answer.add(recommendedName.getKey());
            }
        }

        System.out.println("answer = " + answer);
        return answer;
    }
}
