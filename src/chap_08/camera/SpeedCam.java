package chap_08.camera;

import chap_08.detactor.Detectable;
import chap_08.reporter.Reportable;

public class SpeedCam extends Camera implements Detectable, Reportable {
    // 인터페이스를 통해서, 인스턴스 변수 선언
    private Detectable detector;
    private Reportable reporter;

    // Setter 정의 (특정 detector/reporter 를 입력받아, 위 변수에 저장하는 메소드)
    public void setDetector(Detectable detector) {
        this.detector = detector;
    }

    public void setReporter(Reportable reporter) {
        this.reporter = reporter;
    }

    @Override
    public void showMainFeature() {
        System.out.println("속도 측정, 번호 인식");
    }


    // Setter 로 설정한 detector/reporter 의 메소드 호출
    @Override
    public void detect() {
        detector.detect();
    }

    @Override
    public void report() {
        reporter.report();
    }


    // public void detect() { System.out.println("사고를 감지합니다."); }
    // public void report() { System.out.println("사고 신고를 진행합니다."); }
}
