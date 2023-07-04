package chap_08.detactor;

public interface Detectable {
    public static final String name = "감지자";
    // 변수를 정의하면, 자동으로 public static final 형태가 됨 (작성 생략가능)
    public abstract void detect(); // 감지
    // 메소드를 정의하면, 자동으로 public abstract 형태가 됨 (작성 생략가능)
}
