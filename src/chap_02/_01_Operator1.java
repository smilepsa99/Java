package chap_02;

public class _01_Operator1 {
    public static void main(String[] args) {
        // 산술 연산자

        // 일반 연산
        System.out.println(4 + 2); // 6
        System.out.println(4 - 2); // 2
        System.out.println(4 * 2); // 8
        System.out.println(4 / 2); // 2
        System.out.println(5 / 2); // 2 (정수끼리 연산하면 결과도 정수로 나옴 (소수점 버려짐))
        System.out.println(2 / 4); // 0
        System.out.println(4 % 2); // 0 (나머지 연산)
        System.out.println(5 % 2); // 1

        // 우선 순위 연산
        System.out.println(2 + 2 * 2); // 6
        System.out.println((2 + 2) * 2); // 8
        System.out.println(2 + (2 * 2)); // 6

        // 변수를 이용한 연산
        int a = 20;
        int b = 10;
        int c;

        c = a + b;
        System.out.println(c); // 30

        c = a - b;
        System.out.println(c); // 10

        c = a * b;
        System.out.println(c); // 200

        c = a / b;
        System.out.println(c); // 2

        c = a % b;
        System.out.println(c); // 0

        // 증감 연산 ++, --
        // 변수 = 변수 ± 1 을 간단히 하기 위한 연산자;
        // ++변수 : 변수에 1을 더한 후, 코드 실행
        // 변수++ : 코드 실행 후, 변수에 1을 더함
        // ( -- 도 마찬가지)

        int val;

        val = 10;
        System.out.println(val); // 10
        System.out.println(++val); // 11 (val 에 1을 더한 후, 코드 실행)
        System.out.println(val); // 11

        val = 10;
        System.out.println(val); // 10
        System.out.println(val++); // 10 (코드 실행 후, val 에 1을 더함)
        System.out.println(val); // 11

        val = 10;
        System.out.println(val); // 10
        System.out.println(--val); // 9
        System.out.println(val); // 9

        val = 10;
        System.out.println(val); // 10
        System.out.println(val--); // 10
        System.out.println(val); // 9

        // 은행 대기번호 표
        int waiting = 0;
        System.out.println("대기 인원 : " + waiting++); // 대기 인원 : 0 출력 후, waiting = waiting + 1
        System.out.println("대기 인원 : " + waiting++); // 대기 인원 : 1 출력 후, waiting = waiting + 1
        System.out.println("대기 인원 : " + waiting++); // 대기 인원 : 2 출력 후, waiting = waiting + 1
        System.out.println("총 대기 인원 : " + waiting); // 총 대기 인원 : 3
    }
}
