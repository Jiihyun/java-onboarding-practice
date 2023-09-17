package onboarding;

public class Problem4 {
    public static void main(String[] args) {
        String a = "AAaae";
        String solution = solution(a);
        System.out.println("solution = " + solution);
    }

    public static String solution(String word) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);
            if (Character.isLetter(currentChar)) {
                if (Character.isUpperCase(currentChar)) {
                    int i1 = 'Z' - currentChar + 'A';
                    sb.append((char) i1);
                }else if (Character.isLowerCase(currentChar)) { // 소문자인 경우
                    int shiftedValue = 'z' - currentChar + 'a';
                    sb.append((char) shiftedValue);
                }
            } else {
                sb.append(currentChar);
            }
        }
        return sb.toString();
    }
}
