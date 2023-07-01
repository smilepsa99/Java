package chap_07.camera;

public class SpeedCam {
    public String name;

    // alt + insert (상단메뉴 Code - Generate - Constructor) : 원하는 생성자를 선택해 자동으로 작성 (기본 생성자는 Select None)
    public SpeedCam() {
        this.name = "과속단속 카메라";
    }

    public void takePicture() {
        // 사진 촬영
        System.out.println("사진을 촬영합니다.");
    }

    public void recordVideo() {
        // 동영상 녹화
        System.out.println("동영상을 녹화합니다.");
    }

    public void checkSpeed() {
        // 속도 체크
        System.out.println("속도를 측정합니다.");
    }

    public void recognizeLicensePlate() {
        // 번호 인식
        System.out.println("차량 번호를 인식합니다.");
    }
}
