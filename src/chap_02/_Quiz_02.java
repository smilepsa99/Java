package chap_02;

public class _Quiz_02 {
    public static void main(String[] args) {
        // 나의 답
        int x = 115;
        x = 121;
        String cm = (x >= 120) ? ("키가 " + x + "cm 이므로 탑승 가능합니다.") : ("키가 " + x + "cm 이므로 탑승 불가능합니다.");
        System.out.println(cm);

        // 선생님 답
        int height = 121;
        String result = (height >= 120) ? "탑승 가능합니다" : "탑승 불가능합니다";
        System.out.println("키가 " + height + "cm 이므로 " + result);
    }
}
