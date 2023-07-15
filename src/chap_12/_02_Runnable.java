package chap_12;

import chap_12.clean.CleanRunnable;

public class _02_Runnable {
    public static void main(String[] args) {
        // Runnable : Thread 와 같은 기능을 하지만, Runnable 라는 인터페이스를 구현함

        // Runnable 사용법
        // 1) Runnable 인터페이스를 구현하는 클래스 생성
        // 2) 위 클래스 객체 생성
        // 3) Thread 클래스 객체도 생성하는데,
        // 4) new Thread() 괄호 사이에 위 객체를 넣음
        // 5) Thread 객체의 start() 함수로 실행 (객체명.start())

        CleanRunnable cleanRunnable = new CleanRunnable();
        Thread thread = new Thread(cleanRunnable);
        thread.start(); // 직원 청소

        cleanByBoss(); // 사장 청소
    }

    public static void cleanByBoss() { // 사장 청소
        System.out.println("-- 사장 청소 시작 --");
        for (int i = 1; i <= 10 ; i += 2) {
            System.out.println("(사장) " + i + "번방 청소 중");
        }
        System.out.println("-- 사장 청소 끝 --");
    }
}
