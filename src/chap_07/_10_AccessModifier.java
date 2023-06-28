package chap_07;

public class _10_AccessModifier {
    public static void main(String[] args) {
        // 캡슐화(Encapsulation) : 서로 연관된 것들끼리 하나의 캡슐에 담는 것을 의미
        // 정보 은닉(Information hiding)
        // [참고] 객체지향 프로그래밍 특징 https://www.codestates.com/blog/content/%EA%B0%9D%EC%B2%B4-%EC%A7%80%ED%96%A5-%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%B0%8D-%ED%8A%B9%EC%A7%95

        // 접근 제어자
        // private : 해당 클래스 내에서만 접근 가능
        // public : 모든 클래스에서 접근 가능 (어디서든 접근 가능)
        // default : (아무것도 적지 않았을 때) 같은 패키지 내에서만 접근 가능
        // protected : 같은 패키지 내에서, 다른 패키지인 경우 자식 클래스에서 접근 가능
        // → 클래스, 메소드, 변수 앞에 붙여서 접근 가능 범위를 정할 수 있음

        // 팁) 변수명에서 ctrl + c, ctrl + r 하면, 상단에서 변수명을 전부 수정할 수 있음
        BlackBoxRefurbish b1 = new BlackBoxRefurbish();
        b1.modelName = "까망이";
        b1.setPrice(200000);
        // b1.price = 200000; // private 로 설정된 price 에 접근 불가능
        b1.color = "블랙";

        // 할인 행사
        b1.setPrice(-5000);
        System.out.println("가격 : " + b1.getPrice() + "원");

        // 고객 문의
        System.out.println("해상도 : " + b1.resolution);

        System.out.println("---------------");

        BlackBoxRefurbish b2 = new BlackBoxRefurbish();
        b2.setModelName("하양이");
        b2.setPrice(-5000);
        b2.setColor("화이트");

        System.out.println("가격 : " + b2.getPrice() + "원");
        System.out.println("해상도 : " + b2.getResolution());
    }
}
