package chap_07;

import chap_07.camera.Camera;
import chap_07.camera.FactoryCam;
import chap_07.camera.SpeedCam;

public class _14_Polymorphism {
    public static void main(String[] args) {
        // 다형성

        // class Person : 사람
        // class Student extends Person : 학생 (학생은 사람이다. Student is a person) ⇒ IS-A 관계
        // class Teacher extends Person : 선생님 (선생님은 사람이다. Teacher is a person) ⇒ IS-A 관계
                                        // 역은 성립하지 않음 (사람은 학생/선생님 이다.(x))

        Camera camera = new Camera();
        // 부모클래스 객체명 = new 자식클래스 (); (다형성을 이용해서, 부모클래스로 자식클래스 객체를 만들 수 있음)
        Camera factoryCam = new FactoryCam();
        Camera speedCam = new SpeedCam();

        camera.showMainFeature();
        factoryCam.showMainFeature();
        speedCam.showMainFeature();

        System.out.println("---------------");

        Camera[] cameras = new Camera[3];
        cameras[0] = new Camera();
        cameras[1] = new FactoryCam();
        cameras[2] = new SpeedCam();

        for (Camera cam : cameras) {
            cam.showMainFeature();
        }

        System.out.println("---------------");

        // 단, 부모클래스로 만든 자식클래스 객체에서, 자식클래스에만 있는 메소드는 바로 호출할 수 없음
        // factoryCam.detecFire();
        // speedCam.checkSpeed();
        // speedCam.recognizeLicensePlate();

        // 자식클래스에만 있는 메소드는 호출하려면, 해당 클래스로 형변환 후 호출해야 함

        // 객체명 instanceof 클래스명 : 해당 객체가, 해당 클래스로부터 만들어진 인스턴스인지 확인할 수 있음
        if (camera instanceof  Camera) {
            System.out.println("카메라입니다.");
        }

        if (factoryCam instanceof FactoryCam) {
            ((FactoryCam) factoryCam).detectFire();
            // (FactoryCam) factoryCam : 객체 factoryCam 을 FactoryCam 클래스로 형변환
        }

        if (speedCam instanceof SpeedCam) {
            ((SpeedCam) speedCam).checkSpeed();
            ((SpeedCam) speedCam).recognizeLicensePlate();
        }

        // +) 모든 자바 클래스는 Object 라는 클래스를 상속함 (따라서, Object 클래스로 어떤 객체든 관리할 수 있음)
        Object[] objs = new Object[3];
        objs[0] = new Camera();
        objs[1] = new FactoryCam();
        objs[2] = new SpeedCam();
    }
}