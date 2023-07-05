package chap_10.복습._04_FunctionalInterface;
public class TestMain {
    public static void main(String[] args) {
        // TestInterface 는 함수형 인터페이스 ( 추상메소드는 print() )
        // TestClass 는 TestInterface 를 구현함 (TestClass implements TestInterface)

        // 1. 함수형 인터페이스를 구현한 TestClass 를 활용해, TestInterface 타입의 객체를 생성
        // ㄴ 함수형 인터페이스의 추상 메소드를 '별도의 클래스로 구현한 후에' 객체 생성
        TestInterface test2 = new TestClass();
        testPrint(test2, "인자 : TestClass 로 만든 객체");

        // 2. 함수형 인터페이스를 람다식으로 구현하여, TestInterface 타입의 객체를 생성
        // ㄴ 함수형 인터페이스의 추상 메소드를 '람다식으로 구현함과 동시에' 객체 생성
        TestInterface test = () -> System.out.println("함수형 인터페이스로 출력");
        testPrint(test, "인자 : TestInterface 를 람다식으로 구현해서 만든 객체");

        // 람다식을 사용하면 TestInterface 인터페이스를 구현하는 별도의 클래스를 (1번처럼) 생성할 필요 없이,
        // 인터페이스의 추상 메서드(print())를 간편하게 구현할 수 있음
    }

    public static void testPrint(TestInterface test, String s) {
        test.print();
        System.out.println("(" + s + ")");
        System.out.println();
    }
}

// [참고] 해당 수업 질문 https://www.inflearn.com/questions/868692
// [참고] 익명 클래스와 람다식의 차이점 https://developer-talk.tistory.com/499