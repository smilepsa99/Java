package chap_08;

import chap_08.camera.Camera;
import chap_08.camera.FactoryCam;
import chap_08.camera.SpeedCam;

public class _01_AbstractClass {
    public static void main(String[] args) {
        // 데이터 추상화 (Data Abstraction) : (드러낼 필요없는) 디테일한 정보는 숨기고, 꼭 필요한 정보만 공개하도록 하는 것
        // abstract
        // 추상 클래스 (아직 완성되지 않은 클래스)
        // 추상 메소드 (추상 클래스 or 인터페이스 에서 사용가능한, 껍데기만 있는 메소드)

        // Camera camera =  new Camera(); // Camera 는 추상클래스이기 때문에, 객체를 만들 수 없음
        FactoryCam factoryCam = new FactoryCam();
        // Camera factoryCam = new FactoryCam(); // (정상작동) 다형성으로 인해, 부모클래스로 자식클래스 객체는 만들 수 있음
        factoryCam.showMainFeature();

        SpeedCam speedCam = new SpeedCam();
        // Camera speedCam = new SpeedCam(); // (정상작동) 다형성으로 인해, 부모클래스로 자식클래스 객체는 만들 수 있음
        speedCam.showMainFeature();
    }
}
