package chap_03;

public class _01_String1 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";
        System.out.println(s);

        // 문자열의 길이
        System.out.println(s.length()); // 29

        // 대소문자 변환
        System.out.println(s.toUpperCase()); // 대문자로 변경
        System.out.println(s.toLowerCase()); // 소문자로 변경

        // 포함 관계
        System.out.println(s.contains("Java")); // true (포함된다면 true, 포함되지 않으면 false)
        System.out.println(s.contains("C#")); // false
        System.out.println(s.indexOf("Java")); // 7 (위치 정보)
        System.out.println(s.indexOf("C#")); // -1 (포함되지 않은 것의 위치정보는 -1 로 반환)
        System.out.println(s.indexOf("and")); // 12 (처음 일치하는 위치정보)
        System.out.println(s.lastIndexOf("and")); // 23 (마지막으로 일치하는 위치 정보)
        System.out.println(s.startsWith("I like")); // true (이 문자열로 시작하면 true, 아니면 false)
        System.out.println(s.endsWith(".")); // true (이 문자열로 끝나면 true, 아니면 false)
    }
}
