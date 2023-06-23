package chap_07;

public class _01_Class {
    public static void main(String[] args) {
        // 객체 지향 프로그래밍 (OOP : Object-Oriented Programing) (*oriented : ~을 지향하는)
        // [참고글] https://www.codestates.com/blog/content/%EA%B0%9D%EC%B2%B4-%EC%A7%80%ED%96%A5-%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%B0%8D-%ED%8A%B9%EC%A7%95
        // 코드의 유지·보수 용이
        // 높은 재사용성 (기존에 작성한 코드를 다른 프로그래밍에 재사용하기 좋음)

        // 차량용 블랙박스
        // 모델명, 해상도, 가격, 색상

        // 우리가 만든 첫번째 제품
        String modelName = "까망이";
        String resolution = "FHD";
        int price = 200000;
        String color = "블랙";

        // 새로운 제품을 개발
        String modelName2 = "하양이";
        String resolution2 = "UHD";
        int price2 = 300000;
        String color2 = "화이트";

        // 또 다른 제품을 개발?
        // 위와 같은 작업을 계속 반복하면, 프로그래밍 효율 ↓ ⇒ 클래스 사용
        BlackBox bbox = new BlackBox();
        // BlackBoc 클래스로부터 bbox 객체(Object)를 생성
        // bbox 객체는 BlackBox 클래스의 인스턴스(instance)

        BlackBox bbox2 = new BlackBox();
    }
}
