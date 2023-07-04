package chap_07;

public class _18_Enum {
    public static void main(String[] args) {
        // 열거형 (Enum) : 상수들의 묶음 (상수는 대문자로 작성)
        // [코드] enum 열거형이름 {상수들}
        // ㄴ 상수 예시
        //    ex) 달력 : JAN, FEB, MAR, ...
        //    ex) 옷 사이즈 : S, M, L, XL, ...
        //    ex) OS 종류 : WIN10, WIN11, MACOS, LINUX, ...
        //    ex) 해상도 : HD, FHD, QHD, UHD, ...

        Resolution resolution = Resolution.HD; // resolution 이라는 열거형은 HD 라는 값을 갖게 됨
        System.out.println(resolution);

        resolution = Resolution.FHD; // resolution 의 값을 FHD 로 변경
        System.out.println(resolution);

        System.out.print("동영상 녹화 품질 : "); // SwitchCase 문을 통해, resolution 의 값에 따라 작동을 달리할 수 있음
        switch (resolution) {
            case HD:
                System.out.println("일반화질");
                break;
            case FHD:
                System.out.println("고화질");
                break;
            case UHD:
                System.out.println("초고화질");
                break;
        }

        resolution = Resolution.valueOf("UHD"); // 열거형.valueOf(문자열) : 문자열을 상수로 변환해서 열거형에 넣음
        System.out.println(resolution);

        System.out.println("----------------------");

        for (Resolution myRes : Resolution.values()) { // 열거형.values() : 열거형에 있는 내용(상수들)
            System.out.println(myRes.name() + " : " + myRes.ordinal()); // 열거형상수.name() : 상수 이름
        }                                                               // 열거형상수.ordinal() : 상수가 정의된 순서

        System.out.println("----------------------");

        for (Resolution myRes : Resolution.values()) {
            System.out.println(myRes.name() + " : " + myRes.getWidth()); // 열거형 내 상수들의 실제값 출력
        }

        // (+) 위의 SwitchCase 문을 이렇게 작성할 수도 있음
        System.out.println("----------------------");

        resolution = Resolution.FHD;
        System.out.println("동영상 녹화 품질 : " + resolution.getKorean());
        System.out.println();

        for (Resolution myRes : Resolution.values()) {
            System.out.println("동영상 녹화 품질 : " + myRes.getKorean());
        }
    }
}

enum Resolution {
    HD(1280, "일반화질"), FHD(1920, "고화질"), UHD(3840, "초고화질");

    private final int width; // 상수의 실제값을 저장할 변수
    private final String korean;
    Resolution(int width, String korean) { // 열거형의 생성자를 통해, 상수가 의미하는 실제값을 정해줄 수 있음
        this.width = width;
        this.korean = korean;
    }

    public int getWidth() { // 상수의 실제값을 가져오는 메소드 (Getter)
        return width;
    }

    public String getKorean() {
        return korean;
    }
}
