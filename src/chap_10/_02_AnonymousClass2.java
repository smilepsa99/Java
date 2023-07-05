package chap_10;
public class _02_AnonymousClass2 {
    public static void main(String[] args) {
        HomeMadeBurger momMadeBurger = getMomMadeBurger();
        momMadeBurger.cook();

        System.out.println("------------------------");

        HomeMadeBurger broMadeBurger = getBroMadeBurger();
        broMadeBurger.cook();
    }

    private static HomeMadeBurger getBroMadeBurger() {
        return new HomeMadeBurger() {
            @Override
            public void cook() {
                System.out.println("집에서 만드는 동생표 군대리아");
                System.out.println("재료 : 빵, 치킨패티, 양배추 샐러드, 딸기잼, 치즈, 삶은 계란");
            }
        };
    }

    public static HomeMadeBurger getMomMadeBurger() {
        return new HomeMadeBurger() {
            // HomeMadeBurger() 안에서 익명 클래스 정의
            // ㄴ HomeMadeBurger 라는 추상클래스를 상속해서 오버라이딩하는 것 같이 동작함
            // ㄴ 엄마표 버거(momMadeBurger) 는 전세계에서 우리집 밖에 없는 것이므로 (특별한/유일한 객체이므로),
            //    굳이 HomeMadeBurger 를 상속하는 클래스로 따로 만들지 않고, 익명 클래스로 만들어서 처리함
            @Override
            public void cook() {
                System.out.println("집에서 만드는 엄마표 수제 버거");
                System.out.println("재료 : 빵, 소고기패티, 해시브라운, 양상추, 마요네즈, 피클");
            }
        };
    }

}

abstract class HomeMadeBurger {
    public abstract void cook();
}
