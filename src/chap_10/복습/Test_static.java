package chap_10.복습;

public class Test_static {
    public static void main(String[] args) {
        sm();
        // m(); // static 메소드에서, 같은 클래스 내의 non-static 메소드는 사용할 수 X
    }

    public static void sm() {
        System.out.println("this is static method!");
    }

    public void m() {
        System.out.println("this is non-static method!");
    }
}

// [참고] 자바 에러 : non-static method cannot be referenced from a static context https://almost-native.tistory.com/368
// [참고] 자바 - 정적 메소드(static Method)는 언제 사용할까? https://dev-coco.tistory.com/175