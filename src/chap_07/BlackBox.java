package chap_07;

// 클래스 BlackBox
public class BlackBox {
    // 인스턴스 변수
    // [접근 방법] 객체명.인스턴스변수명
    String modelName; // 모델명
    String resolution; // 해상도
    int price; // 가격
    String color; // 색상

    int serialNumber; // 시리얼 번호
    static int counter = 0; // 시리얼 번호를 생성해주는 역할 (++ 연산을 통해서 값 증가)

    // 클래스 변수 (static 자료형 변수명 = 값)
    // : 이 클래스로 만들어지는 모든 객체에 공통적으로 적용됨
    // [접근 방법] 클래스명.클래스변수명 (객체명.클래스변수명 도 가능하지만, 클래스변수 이므로 클래스명으로 접근하는 것을 권장)
    static boolean canAutoReport = false; // 자동 신고 기능 (개발 여부)

    // 생성자(Constructor) : 객체가 만들어질 때, 자동으로 호출되는 메소드
    // 기본 생성자 (클래스명 () {} )
    BlackBox () {
//        System.out.println("기본 생성자 호출");
//        this.serialNumber = ++counter;
//        System.out.println("새로운 시리얼 넘버를 발급받았습니다 : " + this.serialNumber);
    }

    // 사용자 정의 생성자
    // - 객체를 생성함과 동시에, 전달값을 받아 인스턴스 변수의 값을 정해줄 수 있음 (초기화)
    // - 생성자 내에서 this 를 통해 다른 생성자를 호출할 수 있음
    BlackBox (String modelName, String resolution, int price, String color) {
//        this(); // 기본 생성자 호출
//
//        System.out.println("사용자 정의 생성자 호출");
//        this.modelName = modelName;
//        this. resolution = resolution;
//        this.price = price;
//        this.color = color;
    }

    // 메소드 (전달값 X, 반환값 X)
    void autoReport() {
        if (canAutoReport) {
            System.out.println("충돌이 감지되어 자동으로 신고합니다.");
        } else {
            System.out.println("자동 신고 기능이 지원되지 않습니다.");
        }
    }

    // 메소드 (전달값 O, 반환값 X)
    void insetMemoryCard(int capacity) {
            System.out.println("메모리 카드가 삽입되었습니다.");
            System.out.println("용량은 " + capacity + "GB 입니다.");
    }

    // 메소드 (전달값 O, 반환값 O)
    int getVideoFileCount(int type) {
        if (type == 1) { // 일반 영상
            return 9;
        } else if (type == 2) { // 이벤트 영상
            return 1;
        }
        return 10;
    }

    // showDateTime : 날짜정보 표시여부
    // showSpeed : 속도정보 표시여부
    // min : 영상 기록 단위(분)
    void record(boolean showDateTime, boolean showSpeed, int min) {
        System.out.println("녹화를 시작합니다.");
        if (showDateTime) {
            System.out.println("영상에 날짜정보가 표시됩니다.");
        }
        if (showSpeed) {
            System.out.println("영상에 속도정보가 표시됩니다.");
        }
        System.out.println("영상은 " + min + "분 단위로 기록됩니다.");
    }

    // record 메소드 오버로딩 : 매개변수(파라미터)의 타입이나 개수가 다르면 오버로딩 가능
    // 메소드 오버로딩 시, 기존의 메소드를 불러와서 정의할 수 있음
    void record() {
        record(true, true, 5);
    }

    // 클래스 메소드 (static 자료형 메소드명 () {} )
    static void callServiceCenter () {
        System.out.println("서비스 센터(1588-oooo) 로 연결합니다.");
        // 객체가 만들어져야 생기는 인스턴스 변수는, 클래스 메소드 내에서 접근 불가능
        // 예) modelName = "test"; → 오류발생
        // static 으로 선언한 클래스 변수는, 클래스 메소드 내에서 접근 가능
        // 예) canAutoReport = true; → 정상작동
    }

    // This
    // 메소드 내에서 사용하려는, 인스턴스 변수명과 매개변수명이 같으면, 인스턴스 변수 앞에 this. 를 붙여야 함
    void appendModelName(String modelName) {
        this.modelName += modelName;
    }

    // Getter & Setter
    // Getter : 값을 가져오는 메소드
    String getModelName() {
        return modelName;
    }
    // Setter : 값을 설정하는 메소드
    void setModelName(String modelName) {
        this.modelName = modelName;
    }

    String getResolution() {
        if (resolution == null || resolution.isEmpty()) { // 값이 설정되지 않았거나(null), 공백이거나("")
            return "판매자에게 문의하세요";
        }
        return resolution;
    }

    void setResolution (String resolution) {
        this.resolution = resolution;
    }

    int getPrice() {
        return price;
    }

    void setPrice(int price) {
        if (price < 100000) {
            this.price = 100000;
        } else {
            this.price = price;
        }
    }

    String getColor() {
        return color;
    }

    void setColor(String color) {
        this.color = color;
    }
}
