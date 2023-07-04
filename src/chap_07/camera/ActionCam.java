package chap_07.camera;

public final class ActionCam extends Camera { // 클래스에 final 을 붙이면, 이 클래스를 아예 상속할 수 없게 됨
    private String a = "private 테스트";
    public final String b = "final 테스트";
    public final String lens; // = "광각렌즈"; // lens 의 값을 정해진 값으로 고정시키고 싶을 때, final 을 사용하면 됨
    public ActionCam() {
        super("액션 카메라");
        lens = "광각렌즈"; // final 로 선언만 하고, 값의 초기화는 생성자 내에서 할 수도 있음
    }

    public final void makeVideo() { // 메소드에 final 을 붙이면, 이 메소드는 자식클래스에서 오버라이딩을 할 수 없게 됨
        System.out.println(this.name + " : " + this.lens + "로 촬영한 영상을 통해 멋진 비디오를 제작합니다.");
    }
}
