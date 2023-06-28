package chap_07;

public class _06_ClassMethod {
    public static void main(String[] args) {
//        BlackBox b1 = new BlackBox();
//        b1.callServiceCenter();
//
//        BlackBox b2 = new BlackBox();
//        b2.callServiceCenter();

        // 클래스 메소드 : 객체 없이, 클래스에서 바로 접근 가능
        BlackBox.callServiceCenter();

        // 클래스 메소드 예시 : String 의 valueOf
        // ctrl 누르고 valueOf 클릭하면, static 이 붙은 클래스 메소드로 정의된 것을 확인 가능
        String s = String.valueOf(3);
    }
}
