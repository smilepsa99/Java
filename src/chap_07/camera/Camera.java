package chap_07.camera;

public class Camera { // 부모 클래스
    public String name;

    // [팁] 상단메뉴 Code - Generate 에서 Constructor 를 클릭해 생성자를 만들 수 있음
    public Camera() {
        // this.name = "카메라";
        this("카메라");
    }

    protected Camera(String name) {
        this.name = name;
    }

    public void takePicture() {
        // 사진 촬영
        System.out.println(this.name + " : 사진을 촬영합니다.");
    }

    public void recordVideo() {
        // 동영상 녹화
        System.out.println(this.name + " : 동영상을 녹화합니다.");
    }

    public void showMainFeature() { // 주요기능 보기
        System.out.println(this.name + "의 주요 기능 : 사진촬영, 동영상 녹화");
    }
}
