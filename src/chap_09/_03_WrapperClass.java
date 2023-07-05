package chap_09;

public class _03_WrapperClass {
    public static void main(String[] args) {
        // 래퍼 (Wrapper) 클래스
        // 기본자료형(int, double, float, char 등)을 객체 형태로 만들어서 사용할 수 있도록 해줌

        Integer i = 123; // int i = 123;
        Double d = 1.0; // double d = 1.0;
        Character c = 'A'; // char c = 'A';

        System.out.println(i);
        System.out.println(d);
        System.out.println(c);

        System.out.println("---------------");
        // 래퍼 '클래스' 이기 때문에, 사용할 수 있는 기능(메소드)들이 있음

        // intValue(), charValue()
        System.out.println(i.intValue());
        System.out.println(d.intValue()); // double 데이터를 int 로 형변환 해줌
        System.out.println(c.charValue());

        // toString()
        System.out.println("---------------");
        String s = i.toString(); // int 데이터를 String 으로 형변환
        System.out.println(s);
    }
}
