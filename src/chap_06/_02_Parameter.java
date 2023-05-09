package chap_06;

public class _02_Parameter {
    // 전달갑이 1개 있는 메소드
    public static void power(int number) { // (24번째 줄의) 2 라는 값이 number 에 저장됨,
        int result = number * number;      // 이 때 number 는 Parameter, 매개변수(전달값)
        System.out.println(number + " 의 2승은 " + result);
    }

    // 전달갑이 2개 있는 메소드
    public static void powerByExp (int number, int exponent) { // exponent : 지수
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        System.out.println(number + " 의 " + exponent + "승은 " + result);
    }
    public static void main(String[] args) {
        // 전달값, Parameter
        // 2 -> 2 * 2 = 4
        // 3 -> 3 * 3 = 9

        // 인수, Argument = 2
        power(2); // 2 의 2승은 4
        power(3); // 3 의 2승은 9

        // [참고글] 매개변수와 인수의 차이점 https://7942yongdae.tistory.com/155

        powerByExp(2, 3); // 2 의 3승은 8
        powerByExp(3, 3); // 3 의 3승은 27
        powerByExp(10, 0); // 10 의 0승은 1
    }
}
