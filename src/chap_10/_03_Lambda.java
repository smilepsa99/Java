package chap_10;

public class _03_Lambda {
    public static void main(String[] args) {
        // 람다식 : 아주 간결한 형태의 코드 뭉치
        // (전달값1, 전달값2, ...) -> { 코드 }
    }

    // 일반 코드 (전달값 x)
    // public void print() {
    //     String s = "test";
    //     System.out.println(s);
    // }

    // 람다식 코드 (전달값 x)
    // () -> {
    //     String s = "test";
    //     System.out.println(s);
    // }


    // 일반 코드 (전달값 o)
    // public void print(String s) {
    //     System.out.println(s);
    // }

    // 람다식 코드 (전달값 o)
    // s -> System.out.println(s)


    // 일반 코드 (전달값 o, 반환값 o)
    // public int add(int x, int y) {
    //     return x + y;
    // }

    // 람다식 코드 (전달값 o, 반환값 o)
    // (x, y) -> x + y
    // +) 내용이 한 줄이어도, return 이 포함될 경우 {} 생략 불가능 : (x, y) -> { return x + y; };
}
