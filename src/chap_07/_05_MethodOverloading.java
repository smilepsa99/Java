package chap_07;

public class _05_MethodOverloading {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName = "까망이";

        b1.record(false, false, 10);
        System.out.println("--------------------------");
        b1.record(true, false, 3);
        System.out.println("--------------------------");
        b1.record(true, true, 5);
        System.out.println();
        System.out.println("----------오버로딩----------");
        b1.record();

        // 오버로딩 예시 : String 의 indexOf
        // ctrl 누르고 indexOf 를 클릭하면 오버로딩된 메소드를 볼 수 있음
        String s = "BlackBox";
        System.out.println(s.indexOf("a"));
    }
}
