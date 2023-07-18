package chap_13;

import java.io.File;

public class _07_DeleteFile {
    public static void main(String[] args) {
        // 파일 삭제 : 파일.delete()
        File file = new File("goodjob.txt");
        if (file.exists()){
            if (file.delete()) {
                System.out.println("파일 삭제 성공 : " + file.getName());
            } else {
                System.out.println("파일 삭제 실패 : " + file.getName());
            }
        }

        // 폴더 삭제 (단일 폴더만 삭제) : 폴더.delete()
        File folder = new File("A");
        if (folder.exists()) {
            if (folder.delete()) { // folder 에 하위 폴더나 파일이 있으면 삭제 실패함
                System.out.println("폴더 삭제 성공 : " + folder.getAbsolutePath());
            } else {
                System.out.println("폴더 삭제 실패 : " + folder.getAbsolutePath());
            }
        }

        // 폴더 삭제 (하위 폴더나 파일 모두 삭제) : 별도의 메소드(deleteFolder) 만들어서 사용
        if (deleteFolder(folder)) {
            System.out.println("*폴더 삭제 성공 : " + folder.getAbsolutePath());
        } else {
            System.out.println("*폴더 삭제 실패 : " + folder.getAbsolutePath());
        }
    }

    public static boolean deleteFolder(File folder) {
        if (folder.isDirectory()) {
            for (File file : folder.listFiles()) {
                deleteFolder(file); // 재귀용법
            }
        }
        System.out.println("삭제 대상 : " + folder.getAbsolutePath());
        return folder.delete();
    }

    // +) deleteFolder 메소드 작동 순서
    // deleteFolder(A)
    //      deleteFolder(B)
    //             deleteFolder(C)
    //             C.delete()
    //      B.delete()
    // A.delete()
}
