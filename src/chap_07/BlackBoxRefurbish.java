package chap_07;

// 접근 제어자
// 클래스, 메소드, 변수 앞에 붙여서 접근 가능 범위를 정할 수 있음
// public 클래스일 경우, 클래스명과 자바 파일명이 같아야 함
public class BlackBoxRefurbish {
    public String modelName; // 모델명
    String resolution; // 해상도
    private int price; // 가격
    protected String color; // 색상

    // Getter, Setter 자동 생성하는 법
    // 상단메뉴에서 Code - Generate 에 들어가서 선택하면 됨
    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getResolution() {
        if (resolution == null || resolution.isEmpty()) { // 값이 설정되지 않았거나(null), 공백이거나("")
            return "판매자에게 문의하세요";
        }
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price < 100000) {
            this.price = 100000;
        } else {
            this.price = price;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
