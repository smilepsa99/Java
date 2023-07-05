package chap_10.복습;

public class Review_02_ {
    public static void main(String[] args) {

        // 1. 별도의 클래스(IMade)를 만들 경우
        // ㄴ 부모 클래스를 상속받는 별도의 클래스로 구현 후, 객체 생성함 : new IMade()
        HomeMade byMe = getByME();
        byMe.test();               // '별도의 클래스에서' 오버라이딩한 메소드

        // 2. 익명 클래스를 만들 경우
        // ㄴ 부모 클래스의 객체를 생성하는 동시에, 메소드 오버라이딩 함 : new HomeMade() { 메소드 오버라이딩 }
        HomeMade byMom = getByMom();
        byMom.test();                // '객체 생성과 동시에' 오버라이딩한 메소드
        
        HomeMade byBro = getByBro();
        byBro.test();
    }

    public static HomeMade getByME() {
        return new IMade();
    }

    public static HomeMade getByMom() {
        return new HomeMade() {
            @Override
            public void test() {
                System.out.println("엄마표 음식");
            }
        };
    }

    public static HomeMade getByBro() {
        return new HomeMade() {
            @Override
            public void test() {
                System.out.println("오빠표 음식");
            }
        };
    }
}

abstract class HomeMade {
    public abstract void test();
}

class IMade extends HomeMade {
    @Override
    public void test() {
        System.out.println("내가 만든 음식");
    }
}

// 익명클래스 vs 람다식
// 1) 공통점 : 부모의 메소드를 구현함과 동시에, 부모 타입의 객체 생성 (별도의 클래스 생성을 생략하기 위함)
// 2) 차이점   ( 익명클래스 /    람다식     )
//   ㄴ 부모 : (추상)클래스 / 함수형 인터페이스
//   ㄴ 구현 : (추상)메소드 / 추상 메소드
//     (ㄴ오버라이딩)
//   ㄴ 코드 : 부모클래스 객체명 = new 부모클래스() { 메소드 오버라이딩 } /
//            함수형 인터페이스 객체명 = ( 전달값 ) -> { 추상 메소드 내용 }
