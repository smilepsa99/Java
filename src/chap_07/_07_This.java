package chap_07;

public class _07_This {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName = "까망이"; // 까망이(최신형)
        b1.appendModelName("(최신형)");
        System.out.println(b1.modelName);
    }

    // 팁) 오류 코드에서 alt + enter : 코드수정 제안받을 수 있음
    // 팁) 메소드명에서 ctrl + 클릭 : 해당 메소드 페이지로 이동
    // 팁) 메소드명에서 ctrl + shift + i : 해당 메소드를 미니창으로 볼 수 있음
}
