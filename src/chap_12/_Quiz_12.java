package chap_12;

public class _Quiz_12 {
    public static void main(String[] args) {
        Runnable readyA = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("A 상품 준비 " + i + "/5");
            }
            System.out.println(" -- A 상품 준비 완료 -- ");
        };

        Runnable readyB = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("B 상품 준비 " + i + "/5");
            }
            System.out.println(" -- B 상품 준비 완료 -- ");
        };

        Thread readyAThread = new Thread(readyA);
        Thread readyBThread = new Thread(readyB);

        readyAThread.start();
        readyBThread.start();

        // 쓰레드 작동이 끝날 때까지 대기

        // 방법 1
         try {
             readyAThread.join();
             readyBThread.join();
         } catch (InterruptedException e) {
             throw new RuntimeException(e);
         }

        // 방법 2
        // while (readyAThread.isAlive() || readyBThread.isAlive()) {};
        // ( ㄴ isAlive() : 쓰레드가 살아있는지 확인 (참/거짓) )

        packaging();
    }

    public static void packaging() {
        System.out.println(" == 세트 상품 포장 시작 == ");
        for (int i = 1; i <= 5; i++) {
            System.out.println("세트 상품 포장 " + i + "/5");
        }
        System.out.println(" == 세트 상품 포장 완료 == ");
    }
}
