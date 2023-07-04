package chap_08.reporter;

public class AccidentReporter implements Reportable {
    @Override
    public void report() {
        System.out.println("사고 신고를 진행합니다.");
    }
}
