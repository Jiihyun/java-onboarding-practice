package onboarding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Problem1 {
    static final int LIST_MAX_COUNT = 2;
    List<Integer> resultOfCalculation = new ArrayList<>();

    public static void main(String[] args) {
        ArrayList<Integer> pobi = new ArrayList<>();
        pobi.add(97);
        pobi.add(98);
        ArrayList<Integer> crong = new ArrayList<>();
        crong.add(197);
        crong.add(198);
        Problem1.result(pobi, crong);
    }

    public static int solution(List<Integer> pobi, List<Integer> crong) {

        return Problem1.result(pobi, crong);
    }

    public static int result(List<Integer> pobi, List<Integer> crong) {
        List<Integer> calculatedPobiNums = new ArrayList<>();
        List<Integer> calculatedCrongNums = new ArrayList<>();

        for (int i = 0; i < pobi.size(); i++) {
            int[] pobiSingleNums = Arrays.stream(pobi.get(i).toString().split("")).mapToInt(Integer::parseInt).toArray();
            int sum = 0;
            int mul = 1;
            for (int j = 0; j < pobiSingleNums.length; j++) {
                sum += pobiSingleNums[j];
                mul *= pobiSingleNums[j];
            }
            calculatedPobiNums.add(sum);
            calculatedPobiNums.add(mul);
        }
        for (int i = 0; i < crong.size(); i++) {
            int[] crongSingleNums = Arrays.stream(crong.get(i).toString().split("")).mapToInt(Integer::parseInt).toArray();
            int sum = 0;
            int mul = 1;
            for (int j = 0; j < crongSingleNums.length; j++) {
                sum += crongSingleNums[j];
                mul *= crongSingleNums[j];
            }
            calculatedCrongNums.add(sum);
            calculatedCrongNums.add(mul);
        }
        calculatedCrongNums = calculatedCrongNums.stream().sorted().collect(Collectors.toList());
        calculatedCrongNums = calculatedCrongNums.stream().sorted().collect(Collectors.toList());

        if (calculatedPobiNums.get(3) == calculatedCrongNums.get(3)) {
            return 0;
        }

        if (calculatedPobiNums.get(3) > calculatedCrongNums.get(3)) {
            return 1;
        }
        if (calculatedPobiNums.get(3) < calculatedCrongNums.get(3)) {
            return 2;
        }
        return -1;
    }

    public static int isException(List<Integer> pobi, List<Integer> crong) {

        if (pobi.size() != LIST_MAX_COUNT || crong.size() != LIST_MAX_COUNT) {
            return -1;
        }

        if (pobi.get(1) - pobi.get(0) != 1 || crong.get(1) - crong.get(0) != 1) {
            return -1;
        }

        if (pobi.get(0) % 2 == 0 || pobi.get(1) % 2 != 0 || crong.get(0) % 2 == 0 || crong.get(1) % 2 != 0) {
            return -1;
        }
        return 5;
    }
}