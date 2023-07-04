package chap_08.camera;

import chap_08.detactor.Detectable;
import chap_08.reporter.Reportable;

public class FactoryCam extends Camera implements Detectable, Reportable {

    private Detectable detector;
    private Reportable reporter;

    public void setDetector(Detectable detector) {
        this.detector = detector;
    }

    public void setReporter(Reportable reporter) {
        this.reporter = reporter;
    }

    @Override
    public void showMainFeature() {
        System.out.println("화재 감지");
    }

    @Override
    public void detect() {
        this.detector.detect();
    }

    @Override
    public void report() {
        this.reporter.report();
    } // [참고] this. 를 붙이는 이유? https://inflearn.com/questions/925838

    // public void detect() { System.out.println("화재를 감지합니다."); }
    // public void report() { System.out.println("화재 신고를 진행합니다."); }
}
