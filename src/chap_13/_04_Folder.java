package chap_13;

import java.io.File;

public class _04_Folder {
    public static void main(String[] args) {
        String folderName = "A";
        File folder = new File(folderName);
        folder.mkdir(); // 폴더 생성 (* mkdir : make directory)
        if (folder.exists()) {
            System.out.println("폴더가 존재합니다 : " + folder.getAbsolutePath());
        }

        System.out.println("--------------------------");

        // 하위 폴더 생성
        folderName = "A/B/C";
        // 윈도우랑 맥은 경로를 구분하는 단위가 다르지만, 둘다 위처럼 "/" 로 구분해줘도 문제 없음
        // 그래도 구분해서 쓰고 싶다면, 아래처럼 작성
        // ㄴ "A" + File.separator + "B" + File.separator + "C"
        // ㄴ 윈도우 : \\(특수문자) (C:\\Users\\Nadocoding\\Desktop)
        //    맥 : / (/Users/Nadocoding/Desktop)
        folder = new File(folderName);
        // folder.mkdir(); // 단일 폴더 생성 (상위 폴더가 있어야 함)
        folder.mkdirs(); // 하위 구조로 여러개의 폴더 생성
        if (folder.exists()) {
            System.out.println("폴더가 존재합니다 : " + folder.getAbsolutePath());
        } else {
            System.out.println("폴더 생성 실패 (mkdirs)");
        }
    }
}
