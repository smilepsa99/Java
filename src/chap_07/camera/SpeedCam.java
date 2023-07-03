package chap_07.camera;

// SpeedCam is a Camera. (IS-A 관계에 있다고 말할 수 있음 (= 상속 관계))
public class SpeedCam extends Camera { // 자식 클래스

    // alt + insert (상단메뉴 Code - Generate - Constructor) : 원하는 생성자를 선택해 자동으로 작성 (기본 생성자는 Select None)
    public SpeedCam() {
        // this.name = "과속단속 카메라";
        super("과속단속 카메라"); // 부모 클래스의 생성자 호출
    }

    public void takePicture() {
        super.takePicture();
        checkSpeed();
        recognizeLicensePlate();
    }
    public void checkSpeed() {
        // 속도 체크
        System.out.println("속도를 측정합니다.");
    }

    // @Override // 부모클래스에 없는 메소드를 오버라이딩 한다는 의미 ⇒ 오류 발생
    public void recognizeLicensePlate() {
        // 번호 인식
        System.out.println("차량 번호를 인식합니다.");
    }
    @Override // annotation : 컴파일러에게, 이 메소드가 부모 클래스의 메소드를 오버라이딩 하고있음을 알려줌
              // compile(컴파일) : 작성한 소스코드를 컴퓨터가 알아볼 수 있는 형태로 바꾸는 것 (*compile : 편집하다)
              // compiler(컴파일러) : 컴파일의 역할을 해주는 것
              // [참고] @ Annotation 이란? https://velog.io/@ruinak_4127/Annotation%EC%9D%B4%EB%9E%80
    public void showMainFeature() { // 메소드 오버라이딩
        System.out.println(this.name + "의 주요 기능 : 속도 측정, 번호 인식");
    }
}
