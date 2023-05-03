package chap_03;

public class _03_StringCompare {
    public static void main(String[] args) {
        // 문자열 비교
        String s1 = "Java";
        String s2 = "Python";

        System.out.println(s1.equals(s2)); // false (문자열 내용이 같으면 true, 다르면 false)
        System.out.println(s1.equals("Java")); // true
        System.out.println(s2.equals("python")); // false
        System.out.println(s2.equalsIgnoreCase("python")); // true
                                   // 대소문자 구분없이 문자열 내용이 같은지 여부 체크

        // 문자열 비교 심화 (문자열 내용 비교 : equals())
        // [참고글] equals() 와 == 의 차이 https://sudo-minz.tistory.com/93
        s1 = "1234"; // 벽에 붙은 메모지의 비밀번호 정보 (참조)
        s2 = "1234";
        System.out.println(s1.equals(s2)); // ture (내용 비교)
        System.out.println(s1 == s2); // true (참조하는 곳 비교)

        s1 = new String("1234");
        s2 = new String("1234"); // s1 과 s2 의 데이터가 서로 다른 곳에 저장됨
        System.out.println(s1.equals(s2)); // ture (문자열 내용이 같으므로 true)
        System.out.println(s1 == s2); // false (참조한 내용은 다르므로 false)
    }
}
