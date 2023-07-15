package chap_12;

import chap_12.clean.CleanRunnable;

public class _03_Join {
    // .join() : 쓰레드 종료까지 대기 / (시간정보 있을시) 쓰레드 시작 후 지정한 시간동안 대기
    // .sleep() : (시간정보 있을시) 지정한 시간동안, 쓰레드 진행 일시중단
    public static void main(String[] args) {
        CleanRunnable cleanRunnable = new CleanRunnable();
        Thread thread = new Thread(cleanRunnable);
        thread.start();

        try {
            thread.join(2500); // 이 쓰레드가 종료될때까지 기다렸다가, 끝나고나면 다음줄로 넘어감
                                    // (시간정보 있을시) 쓰레드 시작 후 2.5 초 기다렸다가, 다음줄로 넘어감
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        cleanByBoss();
    }

    public static void cleanByBoss() { // 사장 청소
        System.out.println("-- 사장 청소 시작 --");
        for (int i = 1; i <= 10 ; i += 2) {
            System.out.println("(사장) " + i + "번방 청소 중");

            try {
                Thread.sleep(1000); // 위 줄까지 동작한 후에, 지정한 시간동안 쓰레드 작업 멈춤
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
        System.out.println("-- 사장 청소 끝 --");
    }
}
