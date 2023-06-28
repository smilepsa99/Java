package chap_07;

public class _04_Method {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName = "까망이";

        // 메소드 (전달값 X, 반환값 X)
        // 자동 신고
        b1.autoReport(); // 개발 전
        BlackBox.canAutoReport = true;
        b1.autoReport(); // 개발 후

        // 메소드 (전달값 O, 반환값 X)
        // 메모리카드 삽입
        b1.insetMemoryCard(256);

        // 메소드 (전달값 O, 반환값 O)
        // 영상 개수 반환
        // ㄴ일반 영상 : 1 (type)
        // ㄴ이벤트 영상 (충돌 감지) : 2
        int fileCount = b1.getVideoFileCount(1);
        System.out.println("일반 영상 파일 수 : " + fileCount + "개");

        fileCount = b1.getVideoFileCount(2);
        System.out.println("이벤트 영상 파일 수 : " + fileCount + "개");

        fileCount = b1.getVideoFileCount(123);
        System.out.println("총 영상 파일 수 : " + fileCount + "개");
    }
}
