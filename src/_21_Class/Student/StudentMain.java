package _21_Class.Student;

public class StudentMain {
    public static void main(String[] args) {
        //이름이 student 인 클래스 정의
        Student student = new Student();

        //객체생성
        student.stu_name = "김지니";
        student.stu_age = 25;
        student.stu_email = "allie7019@naver.com";
        student.stu_address = "해운대";

        System.out.println(student.stu_name);
        System.out.println(student.stu_age);
        System.out.println(student.stu_email);
        System.out.println(student.stu_address);

        //메소드 호출
        student.showInfo();

    }
}
