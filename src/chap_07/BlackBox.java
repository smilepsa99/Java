package chap_07;

public class BlackBox {
    // 인스턴스 변수
    // [접근 방법] 객체명.인스턴스변수명
    String modelName; // 모델명
    String resolution; // 해상도
    int price; // 가격
    String color; // 색상

    // 클래스 변수 (static 자료형 변수명 = 값)
    // : 이 클래스로 만들어지는 모든 객체에 공통적으로 적용됨
    // [접근 방법] 클래스명.클래스변수명 (객체명.클래스변수명 도 가능하지만, 클래스변수 이므로 클래스명으로 접근하는 것을 권장)
    static boolean canAutoReport = false; // 자동 신고 기능
}
