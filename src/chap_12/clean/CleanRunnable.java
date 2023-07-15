package chap_12.clean;

public class CleanRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("-- 직원 청소 시작 (Runnable) --");
        for (int i = 2; i <= 10 ; i += 2) {
            System.out.println("(직원) " + i + "번방 청소 중 (Runnable)");

            try {
                Thread.sleep(1000); // 위 줄까지 동작한 후에, 지정한 시간동안 작업 멈춤
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("-- 직원 청소 끝 (Runnable) --");
    }
}

// Runnable vs Thread
// Runnable : Runnable 인터페이스 구현 (다중 상속개념 가능 => 부모클래스를 여러개 가질 수 있음)
// Thread : Thread 클래스 상속 (단일 상속만 가능 => 부모클래스는 하나만 가질 수 있음)
// => 부모클래스가 여러개 필요할 때 : Runnable
//    부모클래스가 한개만 필요할 때 : Thread
