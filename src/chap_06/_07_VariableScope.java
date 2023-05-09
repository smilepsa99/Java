package chap_06;

public class _07_VariableScope {
    public static void methodA(int number) {
        System.out.println(number);
        // System.out.println(result);
    }

    public static void methodB() {
        int result = 1; // 지역 변수 : 선언된 {영역} 내에서만 사용 가능한 변수
    }
    public static void main(String[] args) {
        int number = 3;
        methodA(number); // 지역변수를 다른 메소드에서 사용하려면, 전달값으로 전하면 됨
        // System.out.println(result);


        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        // System.out.println(i);

        {
            int j = 0;
            System.out.println(j);
            System.out.println(number);
        }
        // System.out.println(j);
    }
}
