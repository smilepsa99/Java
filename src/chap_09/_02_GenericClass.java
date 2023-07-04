package chap_09;

import chap_09.coffee.*;
import chap_09.user.User;
import chap_09.user.VIPUser;

public class _02_GenericClass {
    public static void main(String[] args) {
        // 제네릭 클래스

        CoffeeByNumber c1 = new CoffeeByNumber(33);
        c1.ready();

        CoffeeByNickname c2 = new CoffeeByNickname("유재석");
        c2.ready();

        System.out.println("-----------------------");
        // Object 로 입력받는 클래스(CoffeeByName)을 사용할 경우

        CoffeeByName c3 = new CoffeeByName(34);
        c3.ready();

        CoffeeByName c4 = new CoffeeByName("박명수");
        c4.ready();

        System.out.println("-----------------------");

        int c3Name = (int) c3.name; // 인스턴스 변수에 접근할 때 형변환을 해줘야 함
        System.out.println("주문 고객 번호 : " + c3Name);

        String c4Name = (String) c4.name;
        System.out.println("주문 고객 번호 : " + c4Name);

        // c4Name = (String) c3.name; // 매번 형변환을 해야해서, 작성 실수가 나기 쉬움

        System.out.println("-----------------------");
        // 제네릭 클래스(Coffee)를 사용하는 경우
        // [코드] 클래스명<자료형> 객체명 = new 클래스명<>();
        // (장점) 코드의 중복을 줄이고, 값을 가져올 때 형변환도 안하기 때문에 개발상의 실수도 줄일 수 있음

        Coffee<Integer> c5 = new Coffee<>(35);
        c5.ready();
        int c5Name = c5.name; // 인스턴스 변수에 접근할 때 따로 형변환할 필요 X (제네릭 클래스로 객체를 만들 때, 자료형을 정해줬기 때문)
        System.out.println("주문 고객 번호 : " + c5Name);

        Coffee<String> c6 = new Coffee<>("조세호");
        c6.ready();
        String c6Name = c6.name;
        System.out.println("주문 고객 이름 : " + c6Name);

        System.out.println("-----------------------");
        // 제네릭 클래스에서, 정해진 형태릐 클래스 객체만 받을 경우
        // (클래스 선언 시) class 클래스명 <T extends 클래스명> {}
        //  <T extends 클래스명> : 특정 클래스의 상속을 받는 객체만 입력 받도록 함

        CoffeeByUser<User> c7 = new CoffeeByUser<>(new User("강호동"));
        c7.ready();

        CoffeeByUser<User> c8 = new CoffeeByUser<>(new VIPUser("서장훈"));
        c8.ready();

        System.out.println("-----------------------");

        orderCoffee("김영철");
        orderCoffee(36);

        System.out.println("-----------------------");
        // 2개 이상의 전달값을 받을 경우 (메소드 orderCoffee)

        orderCoffee("김희철", "아메리카노");
        orderCoffee(37, "라떼");

        System.out.println("-----------------------");

        // 2개 이상의 전달값을 받을 경우 (클래스 Test)
        Test test1 = new Test("오영택", "카푸치노");
        test1.ready();
        Test test2 = new Test(38, "녹차");
        test2.ready();

    }

    public static <T> void orderCoffee(T name) {
        System.out.println("커피 준비 완료 : " + name);
    }

    // public static <T, V> void 메소드명(T 변수명, V 변수명) {}
    public static <T, V> void orderCoffee(T name, V coffee) {
        System.out.println(coffee + " 준비 완료 : " + name);
    }
}
