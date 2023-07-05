package chap_10.converter;

@FunctionalInterface // 함수형 인터페이스 annotation (이 인터페이스가 함수형 인터페이스임을 컴파일러에게 알림)
                     // ㄴ 이게 없다면, 이 인터페이스만 봤을 때 함수형 인터페이스로 쓴 건지, 그냥 인터페이스로 쓴건지,
                     //    알 수 없기 때문에 개발상의 실수가 나기 쉬움 ⇒ 이러한 실수를 annotation 을 통해 방지함
                     // ㄴ 추상 메소드를 1개보다 더 추가하면, 에러를 표시해 주는 역할도 함
public interface Convertible { // ( *convert : 전환하다, 변환하다 )
    public abstract void convert(int USD);
}

// [참고] Java 키워드 정렬 순서 https://johngrib.github.io/wiki/java-modifier-order-with-jls-suggestion/
// ㄴ 변수 순서   : public(접근제어자) > |            static > final | > 자료형 > 이름;
// ㄴ 메소드 순서 : public(접근제어자) > |  abstract > static > final | > void(반환형) > 이름() {내용}
// ㄴ 클래스 순서 : public(접근제어자) > |  abstract > static > final | > class > 이름 {내용}
//               ( > extends > 상속클래스명 > implements > 인터페이스1, 인터페이스2, ... )
