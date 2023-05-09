package chap_06;

public class _06_WhenToUse {
    public static int getPower(int number) {
        // int result = number * number;
        // return result;
        return getPower(number, 2); // 메소드 내에서 다른 메소드 호출 가능
    }

    public static int getPower(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }
    public static void main(String[] args) {
        // 메소드가 필요한 이유

        // 2의 2승을 구하기
        int result = 1;
        for (int i = 0; i < 2; i++) {
            result *= 2;
        }
        System.out.println(result); // 4

        // 3의 3승을 구하기
        result = 1;
        for (int i = 0; i < 3; i++) {
            result *= 3;
        }
        System.out.println(result); // 27

        // 4의 2승을 구하기
        result = 1;
        for (int i = 0; i < 2; i++) {
            result *= 4;
        }
        System.out.println(result); // 16

        // 위 처럼, 같은 동작을 실행하는데 활용되는 값만 일부 다른 경우,
        // 메소드를 활용하면 불필요한 코드 반복을 줄일 수 있고, 코드 수정(유지•보수)에도 용이함

        // 2의 2승을 구하기
        System.out.println(getPower(2, 2)); // 4

        // 3의 3승을 구하기
        System.out.println(getPower(3, 3)); // 27

        // 4의 2승을 구하기
        System.out.println(getPower(4, 2)); // 16

    }
}
