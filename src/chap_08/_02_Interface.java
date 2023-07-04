package chap_08;

import chap_08.camera.*;
import chap_08.detactor.*;
import chap_08.reporter.*;

public class _02_Interface {
    public static void main(String[] args) {
        // 인터페이스 : 뼈대만 제공하는 구조
        // NormalReporter normalReporter = new NormalReporter();
        Reportable normalReporter = new NormalReporter(); // 인터페이스명으로 객체를 만들 수 있음
        normalReporter.report();

        // VideoReporter videoReporter = new VideoReporter();
        Reportable videoReporter = new VideoReporter();
        videoReporter.report();

        System.out.println("-------------------------------");

        Detectable fireDetector = new FireDetector();
        fireDetector.detect();

        Detectable advancedFireDetector = new AdvancedFireDetector();
        advancedFireDetector.detect();

        System.out.println("-------------------------------");

        FactoryCam factoryCam = new FactoryCam();
        factoryCam.setDetector(advancedFireDetector);
        factoryCam.setReporter(videoReporter);

        factoryCam.detect();
        factoryCam.report();

        System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

        Detectable speedDetector = new SpeedDetector();
        speedDetector.detect();

        Reportable accidentReporter = new AccidentReporter();
        accidentReporter.report();

        System.out.println("-------------------------------");

        SpeedCam speedCam = new SpeedCam();
        speedCam.setDetector(speedDetector);
        speedCam.setReporter(accidentReporter);

        speedCam.detect();
        speedCam.report();

        // [참고] 추상 클래스와 인터페이스의 차이 https://brunch.co.kr/@kd4/6
        // [참고] 자바 추상 클래스와 인터페이스의 차이점 이해하기 https://wildeveloperetrain.tistory.com/112
        // [참고] 추상클래스 VS 인터페이스 왜 사용할까?  https://myjamong.tistory.com/150
        //       ㄴ 추상클래스(미완성 설계도) / 인터페이스(기본 설계도)
    }
}