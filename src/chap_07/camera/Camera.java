package chap_07.camera;

public class Camera {
    public String name;

    // [팁] 상단메뉴 Code - Generate 에서 Constructor 를 클릭해 생성자를 만들 수 있음
    public Camera() {
        this.name = "카메라";
    }

    public void takePicture() {
        // 사진 촬영
        System.out.println("사진을 촬영합니다.");
    }

    public void recordVideo() {
        // 동영상 녹화
        System.out.println("동영상을 녹화합니다.");
    }

}
