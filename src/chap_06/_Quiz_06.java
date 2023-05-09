package chap_06;

public class _Quiz_06 {
    public static String getHiddenData(String data, int startIndex) {
        String hiddenData = data.substring(0, startIndex);
        // 선생님 코드
        // for (int i = 0; i < data.length() - startIndex; i++) {  // 이게 제일 좋은 코드인 듯
        // for (int i = startIndex; i < data.length(); i++) {
        for (int i = 0; i < data.substring(startIndex).length(); i++) {
            hiddenData += "*";
        }
        return hiddenData;
    }
    public static void main(String[] args) {

        String name = "나코딩";
        String id = "990130-1234567";
        String phone = "010-1234-5678";

        System.out.println("이름 : " + getHiddenData(name, 1)); // 개인정보, 비공개 시작 위치
        System.out.println("주민등록번호 : "+ getHiddenData(id, 8));
        System.out.println("전화번호 : "+ getHiddenData(phone, 9));
    }
}
