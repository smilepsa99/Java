package chap_01;

public class _07_TypeCasting {
    public static void main(String[] args) {
        // 형변환(TypeCasting)
        // 정수형에서 실수형으로, 또는 실수형에서 정수형으로 변환

        // int to float, double
        int score = 93;
        System.out.println(score); // 93
        System.out.println((float) score); // 93.0 (int → float)
        System.out.println((double) score); // 93.0 (int → double)

        // float, double to int
        float score_f = 93.3F;
        double score_d = 98.8;
        System.out.println((int)score_f); // 93 (소수점 이하 버림)
        System.out.println((int)score_d); // 98 (소수점 이하 버림)

        // 정수 + 실수 연산
        score = 93 + (int)98.8; // 93 + 98
        System.out.println(score); // 191

        score_d = (double)93 + 98.8; // 93.0 + 98.8 (여기서 정수를 실수형으로 변환하는 double 은 생략가능)
        System.out.println(score_d); // 191.8

        // 변수에 형변환된 데이터 집어넣기
        double convertedScoreDouble = score; // 191 → 191.0 (자동으로 형변환됨)
        int convertedScoreInt = (int)score_d; // 191.8 → 191 (수동으로 형변환함)
        // int ⊂ long ⊂ float ⊂ double 이기 때문

        // 숫자를 문자열로
        String s1 = String.valueOf(93);
        s1 = Integer.toString(93);
        System.out.println(s1); // 93

        String s2 = String.valueOf(98.8);
        s2 = Double.toString(98.8);
        System.out.println(s2); // 98.8

        // 문자열을 숫자로
        int i = Integer.parseInt("93");
        System.out.println(i); // 93 (정수 자료형)

        double d = Double.parseDouble("98.8");
        System.out.println(d); // 98.8 (실수 자료형)

        // int error = Integer.parseInt("자바"); 형변환할 때, 적절한 자료형을 넣었는지 주의
    }
}
