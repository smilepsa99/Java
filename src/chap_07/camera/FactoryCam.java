package chap_07.camera;

// FactoryCam is a Camera. (IS-A 관계에 있다고 말할 수 있음 (= 상속 관계))
public class FactoryCam extends Camera {
    public FactoryCam() {
        // this.name = "공장 카메라";
        super("공장 카메라"); // 부모 클래스의 생성자 호출
    }

    public void recordVideo() {
        super.recordVideo(); // super.메소드명 : 부모클래스의 메소드 호출
        detectFire();
    }

    public void detectFire() {
        // 화재 감지
        System.out.println("화재를 감지합니다.");
    }

    public void showMainFeature() { // 메소드 오버라이딩
        System.out.println(this.name + "의 주요 기능 : 화재 감지");
    }
}
