package chap_07;

public class _Quiz_07 {
    public static void main(String[] args) {
        HamBurger[] hamBurgers = new HamBurger[3];
        hamBurgers[0] = new HamBurger();
        hamBurgers[1] = new CheeseBurger();
        hamBurgers[2] = new ShrimpBurger();

        System.out.println("주문하신 메뉴를 만듭니다.");
        System.out.println("-------------");
        for (HamBurger hamBurger : hamBurgers) {
            hamBurger.cook();
            System.out.println("-------------");
        }
        System.out.println("메뉴 준비가 완료되었습니다.");
    }
}

// 클래스 : 햄버거
class HamBurger {
    public String name;

    public HamBurger() {
        this("햄버거");
    }

    public HamBurger(String name) {
        this.name = name;
    }

    public void cook() {
        System.out.println(this.name + "를 만듭니다.");
        System.out.println("빵 사이에 들어가는 재료는?");
        System.out.println("> 양상추");
        System.out.println("+ 패티");
        System.out.println("+ 피클");
    }
}

// 클래스 : 치즈버거
class CheeseBurger extends HamBurger {
    public CheeseBurger() {
        super("치즈버거");
    }

    public void cook() {
        super.cook();
        System.out.println("+ 치즈");
    }
}

// 클래스 : 새우버거
class ShrimpBurger extends HamBurger {
    public ShrimpBurger() {
        super("새우버거");
    }

    public void cook() {
        super.cook();
        System.out.println("+ 새우");
    }
}

// [자바 클래스 요약]
// 클래스 : (접근범위) class 클래스명 {}
// ㄴ 1) 변수
//    ㄴ 멤버 변수 (메소드 밖의 변수)                :  this.변수명 [메소드 안에서 접근할 때]
//    - 인스턴스 변수                              : (접근범위) 자료형 변수명;             / [호출] 객체.변수명
//    - 클래스 변수                                : (접근범위) static 자료형 변수명;      / [호출] 클래스.변수명
//    ㄴ 지역변수 (메소드 안의 변수)
// ㄴ 2) 메소드
//    - 생성자 (객체가 만들어질 때 자동호출되는 메소드)  : (접근범위) 클래스명() {}
//    - 인스턴스 메소드                             : (접근범위) void 메소드명() {}        / [호출] 객체.메소드명
//    - 클래스 메소드                               : (접근범위) static void 메소드명() {} / [호출] 클래스.메소드명

// [참고] 자바 클래스와 객체 및 키워드 https://juntcom.tistory.com/122
// [참고] Java 클래스의 멤버 변수 https://www.devkuma.com/docs/java/member-variable/
// [참고] 클래스 - 멤버 변수 https://ji-gwang.tistory.com/123
// [참고] 자바의 변수 (클래스 변수, 인스턴스 변수, 지역 변수) https://itmining.tistory.com/20