package chap_10.복습._04_FunctionalInterface;

public class TestClass implements TestInterface {
    @Override
    public void print() {
        System.out.println("별도의 클래스로 출력");
    }
}
