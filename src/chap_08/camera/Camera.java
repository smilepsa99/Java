package chap_08.camera;

public abstract class Camera { // 추상 클래스
    public void takePicture() {
        System.out.println("사진을 촬영합니다.");
    }

    public void recordVideo() {
        System.out.println("동영상을 녹화합니다.");
    }
    public abstract void showMainFeature();  // 추상 메소드 : 내용은 (이 클래스를 상속하는) 자식클래스에서 구현해야 함
}
