package chap_12.clean;

// 동기화(Synchronization)
// - 어떤 쓰레드가 어떤 메소드에 들어와 작업을 하고 있다면, 다른 쓰레드는 이 메소드에 진입할 수 없게 막는 것
// - 사용법 : 메소드 맨앞에 synchronized 를 붙임
public class Room {
    public int number = 1;
    synchronized public void clean(String name) {
        // 직원 1 : 3번방 청소 완료
        System.out.println(name + " : " + number + "번방 청소 중");
        number++;
    }
}
