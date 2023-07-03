package chap_07;

import chap_07.camera.FactoryCam;
import chap_07.camera.SpeedCam;

public class _15_Super {
    public static void main(String[] args) {
        // Super : 자식클래스에서, 부모클래스에 접근할 때 사용 (super.변수명, super.메소드명, super())
        FactoryCam factoryCam = new FactoryCam();
        SpeedCam speedCam = new SpeedCam();

        factoryCam.recordVideo();
        System.out.println("----------------");
        speedCam.takePicture();
    }
}
