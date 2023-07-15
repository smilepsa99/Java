package chap_12.clean;

public class CleanThread extends Thread { // 직원 청소
    public void run() {
        System.out.println("-- 직원 청소 시작 (Thread) --");
        for (int i = 2; i <= 10 ; i += 2) {
            System.out.println("(직원) " + i + "번방 청소 중 (Thread)");
        }
        System.out.println("-- 직원 청소 끝 (Thread) --");
    }
}

// 쓰레드 사용법 (동시에 여러작업 진행할 때 사용)
// 1) Thread 클래스를 상속받는 별도의 클래스 생성
// 2) 클래스 내에 run() 함수 정의
// 3) 이 클래스의 객체를 메인 쓰레드에서 만들고,
// 4) 객체명.start() 실행
// => 위 쓰레드와 메인 쓰레드의 작업이 동시에 진행됨
