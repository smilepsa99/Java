package chap_09;

import java.util.ArrayList;
import java.util.Iterator;

public class _Quiz_09 {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("유재석", "Python"));
        students.add(new Student("박명수", "Java"));
        students.add(new Student("김종국", "Java"));
        students.add(new Student("조세호", "C"));
        students.add(new Student("서장훈", "Python"));

        System.out.println("자바 자격증을 보유한 학생");
        System.out.println("--------------------");
        for (Student student : students) {
            if (student.lang.equals("Java")) { // 자바에서 문자열 비교는 equals() ( == 썼다가 수정함 )
                System.out.println(student.name);
            }
        }

        System.out.println("--------------------");

        // +) iterator 를 사용할 경우
        Iterator<Student> it = students.iterator();
        while (it.hasNext()) {
            Student student = it.next();
            if (student.lang.equals("Java")) {
                System.out.println(student.name);
            }
        }
    }
}

class Student {
    public String name;
    public String lang;

    public Student(String name, String lang) {
        this.name = name;
        this.lang = lang;
    }
}

