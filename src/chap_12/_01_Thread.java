package chap_12;

import chap_12.clean.CleanThread;

public class _01_Thread {
    public static void main(String[] args) {
        // 하나의 프로세스 (Process) : 별도의 쓰레드를 사용하지 않으면, 하나의 쓰레드만 가짐
        // 쓰레드 (Thread)

        // 프로그램 : 계산기나 그림판 같이, 실행 가능한 형태로 만들어진 것(.exe)
        // 프로세스 : 프로그램이 실행되어 돌아가고 있는 상태
        // 쓰레드 : 프로세스의 자원을 이용해서 실제로 작업을 수행하는 것 (동시에 여러 작업을 하기 위해 사용)
        // [참고] 쓰레드의 개념 http://www.tcpschool.com/java/java_thread_concept

        // ex) 호텔 청소 (1~10번 방)
        // 1 3 5 7  9 (사장 청소)
        // 2 4 6 8 10 (직원 청소)

        // cleanBySelf();
        CleanThread cleanThread = new CleanThread();
        // cleanThread.run(); // 직원 청소
        cleanThread.start();

        cleanByBoss(); // 사장 청소

    }

    public static void cleanBySelf() {
        System.out.println("-- 혼자 청소 시작 --");
        for (int i = 1; i <= 10 ; i++) {
            System.out.println("(혼자) " + i + "번방 청소 중");
        }
        System.out.println("-- 혼자 청소 끝 --");
    }

    public static void cleanByBoss() { // 사장 청소
        System.out.println("-- 사장 청소 시작 --");
        for (int i = 1; i <= 10 ; i += 2) {
            System.out.println("(사장) " + i + "번방 청소 중");
        }
        System.out.println("-- 사장 청소 끝 --");
    }
}
