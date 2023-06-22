package chap_03;

public class _02_String2 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";

        // 문자열 변환
        System.out.println(s.replace(" and", ",")); // " and" 를 "," 로 변환
        System.out.println(s.substring(7)); // 인덱스 7번째부터 시작
                                                      // (이전 내용은 잘라냄, but 변수 s에 변환 결과가 반영되는 건 아님)
        System.out.println(s.substring(s.indexOf("Java"))); // Java 의 위치값에서부터 끝까지
        System.out.println(s.substring(s.indexOf("Java"), s.indexOf("."))); // 시작 위치부터 끝위치 "미만"까지
                                                              // "Java" 의 위치값에서부터 "." 의 위치값 미만까지

        System.out.println(s.substring(s.indexOf("and"))); // and Python and C. (첫번째 and 부터 시작)
        System.out.println(s.substring(s.lastIndexOf("and"))); // and C. (마지막 and 부터 시작)

        // 공백 제거
        s = "       I love Java.      ";
        System.out.println(s);
        System.out.println(s.trim()); // 앞뒤 공백 제거 (*trim : 다듬다, 손질하다)

        // 문자열 결합
        String s1 = "Java";
        String s2 = "Python";
        System.out.println(s1 + s2); // JavaPython
        System.out.println(s1 + "," + s2); // Java,Python
        System.out.println(s1.concat(",").concat(s2)); // Java,Python (*concat : concatenate(연결하다))
    }
}
