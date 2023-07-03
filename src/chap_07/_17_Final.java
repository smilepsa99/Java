package chap_07;

import chap_07.camera.ActionCam;
import chap_07.camera.SlowActionCam;

public class _17_Final {
    public static void main(String[] args) {
        // Final
        // final 로 변수를 선언하면, 선언과 동시에 값을 초기화하고, 이후로는 값을 사용할 순 있지만 값을 변경하는 건 불가능함
        // ㄴ chap1 의 06 Constants(상수) 참고

        // public (final) class ...
        // public (final) void ...
        // 어떤 클래스나, 메소드나, 변수 앞에 final 을 붙이면,
        // 상속이나, 오버라이딩이나, 값 변경이 안되게 막을 수 있음
        // (+ public > abstract > static > final > ... 순으로 작성함)

        ActionCam actionCam = new ActionCam();
        // actionCam.lens = "표준렌즈";
        actionCam.recordVideo();
        actionCam.makeVideo();

        System.out.println("----------------------");

        SlowActionCam slowActionCam = new SlowActionCam();
        slowActionCam.makeVideo();

    }
}
