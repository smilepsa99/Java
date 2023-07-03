package chap_07;

import chap_07.camera.Camera;
import chap_07.camera.FactoryCam;
import chap_07.camera.SpeedCam;

public class _13_MethodOverriding {
    public static void main(String[] args) {
        // 메소드 오버라이딩 : 자식 클래스에서, 부모 클래스의 메소드를 덮어쓰기 (재정의)
        // cf. 메소드 오버로딩 : 같은 클래스 내에서, 파라미터의 타입이나 개수를 다르게 하여 똑같은 이름의 메소드를 여러 개 만들기 (중복 정의)

        Camera camera = new Camera();
        FactoryCam factoryCam = new FactoryCam();
        SpeedCam speedCam = new SpeedCam();

        camera.showMainFeature();
        factoryCam.showMainFeature();
        speedCam.showMainFeature();
    }
}
