package chap_07;

import chap_07.camera.Camera;

public class _16_Reference {
    public static void main(String[] args) {
        // 참조 (Reference)

        // 기본 자료형 (Primitive Data Types) : int, float, double, long, boolean, ...
        // - 표기 : 소문자로 시작
        // - default 값 : 0 (값을 정하지 않았을 때의 기본값)
        // - 메소드를 가지지 않음

        int[] i = new int[3];
        System.out.println(i[0]); // 0

        double[] d = new double[3];
        System.out.println(d[0]);; // 0.0

        // 참조 자료형 (Non-Primitive, Reference Data Types) : String / (사용자정의 클래스) Camera, FactoryCam, SpeedCam, ...
        // - 표기 : 대문자로 시작
        // - default 값 : null (값을 정하지 않았을 때의 기본값)
        // - 메소드를 가질 수 있음

        String[] s = new String[3];
        System.out.println(s[0]); // null

        Camera[] c = new Camera[3];
        System.out.println(c[0] == null); // true

        //////////////////////////////////////////////////////////////////////////////////////////////////////
        // 기본 자료형인 두 객체를 '=' 할 경우 : 서로 영향 X
        System.out.println("--------------------------");
        int a = 10;
        int b = 20;
        b = a;                 // 기본 자료형이기 때문에, b 는 a 의 값을 복사함을 의미
        System.out.println(a); // 10
        System.out.println(b); // 10
        b = 30;                // 따라서 b 의 값이 바껴도, a 에 영향 없음
        System.out.println(a); // 10
        System.out.println(b); // 30

        // 참조 자료형인 두 객체를 '=' 할 경우 : 서로 영향 O (참조하는 내용이 같기 때문!)
        System.out.println("--------------------------");
        Camera c1 = new Camera();
        Camera c2 = new Camera();     // 객체 c1, c2 는 각각 (메모리 어딘가 만들어진) 객체 new Camera() 를 "참조" 함
        c1.name = "카메라1";
        c2.name = "카메라2";
        System.out.println(c1.name);  // 카메라1
        System.out.println(c2.name);  // 카메라2
        c2 = c1;                      // c1 이 참조하고 있는 new Camera() 를, c2 도 참조하게 됨을 의미
        System.out.println(c1.name);  // 카메라1
        System.out.println(c2.name);  // 카메라1
        c2.name = "고장난 카메라";      // c2 와 c1 이 참조하는 new Camera() 가 같기 때문에, c1 의 이름도 "고장난 카메라" 가 됨
        System.out.println(c1.name);  // 고장난 카메라
        System.out.println(c2.name);  // 고장난 카메라

        System.out.println("--------------------------");
        changeName(c2);               // c2 와 c1 이 참조하는 new Camera() 가 같기 때문에, 둘다 "잘못된 카메라" 가 됨
        System.out.println(c1.name);  // 잘못된 카메라
        System.out.println(c2.name);  // 잘못된 카메라

        c2 = null;                    // (+) c2 의 참조를 끊고 싶다면, null 을 넣어주면 됨
        // System.out.println(c2.name); // c2 가 빈 값이므로, 오류발생
    }

    public static void changeName(Camera camera) {
        camera.name = "잘못된 카메라";
    }
}
