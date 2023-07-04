package chap_08.detactor;

public class SpeedDetector implements Detectable {
    @Override
    public void detect() {
        System.out.println("사고를 감지합니다.");
    }
}
