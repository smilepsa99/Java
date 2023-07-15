package chap_12;

import chap_12.clean.Room;

public class _05_Synchronization {
    public static void main(String[] args) {
        // 동기화(Synchronization)
        // : 어떤 쓰레드가 어떤 메소드에 들어와 작업을 하고 있다면, 다른 쓰레드는 이 메소드에 진입할 수 없게 막는 것

        Room room = new Room();
        Runnable cleaner1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("-- 직원1 청소 시작 --");
                for (int i = 1; i <= 5 ; i++) {
                    room.clean("직원1");

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                    // (+) 여러 쓰레드가 작업할 때, 한 쓰레드에서 에러가 발생해도,
                    // 다른 쓰레드에는 영향이 가지 않음 (정상 작동함)
                    if (i == 2) {
                        throw new RuntimeException("못해먹겠다!!");
                    }
                }
                System.out.println("-- 직원1 청소 끝 --");
            }
        };

        Runnable cleaner2 = () -> {
            System.out.println("-- 직원2 청소 시작 --");
            for (int i = 1; i <= 5 ; i++) {
                room.clean("직원2");

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("-- 직원2 청소 끝 --");
        };

        Thread cleanerThread1 = new Thread(cleaner1);
        Thread cleanerThread2 = new Thread(cleaner2);

        cleanerThread1.start();
        cleanerThread2.start();
    }
}
