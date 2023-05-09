package chap_06;

public class _01_Method {
    // 메소드 : 어떤 기능들을 하는 코드들의 묶음

    // 메소드 정의
    public static void sayHello() {
        System.out.println("안녕하세요? 메소드입니다.");
    }

    public static void main(String[] args) {
        // 메소드 호출
        System.out.println("메소드 호출 전");
        sayHello(); // 위에서 정의된 메소드로 진입 → 메소드 내 코드 실행 → 다시 돌아와서 다음 코드 실행
        System.out.println("메소드 호출 후");
    }
}
