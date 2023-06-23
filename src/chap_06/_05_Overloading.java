package chap_06;

public class _05_Overloading {
    public static int getPower(int number) {
        int result = number * number;
        return result;
        // return number * number;
    }

    // public static double getPower(int number) {  // 메소드 오버로딩 불가능 (반환형이 다름)
    //     return 0.0;
    // }

    public static int getPower(String strNumber) {
        int number = Integer.parseInt(strNumber);
        int result = number * number;
        return result;
    }

    public static int getPower(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }
    public static void main(String[] args) {
        // 메소드 오버로딩 : 이름이 같은 메소드를 여러 개 만드는 것
        // => 같은 이름의 메소드를, 여러번 선언하는 것(중복 정의하는 것)
        // 1. 전달값의 타입이 다르거나 (36번째 줄)
        // 2. 전달값의 개수가 다르거나 (37번째 줄)
        // 1. 또는 2. 의 경우에 메소드 오버로딩 가능(똑같은 이름의 메소드로 호출 가능)
        // *주의 : 반환형이 다르면 메소드 오버로딩 불가능 (10번째줄)

        System.out.println(getPower(3)); // 9
        System.out.println(getPower("4")); // 16
        System.out.println(getPower(3,3)); // 27

        // [참고글] 오버로딩과 오버라이딩의 차이 https://88240.tistory.com/450
        // ㄴ 오버로딩: 메소드 확장 / 오버라이딩 : 메소드 재정의
    }
}
