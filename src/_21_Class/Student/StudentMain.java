package _21_Class.Student;

import _21_Class.Car.Car;

public class StudentMain {
    public static void main(String[] args) {
        //이름이 student 인 클래스 정의
        Student student = new Student();

        // 기본 생성자


        //객체생성
        student.stu_name = "김지니";
        student.stu_age = 25;
        student.stu_email = "allie7019@naver.com";
        student.stu_address = "부산 해운대";

//        System.out.println(student.stu_name);
//        System.out.println(student.stu_age);
//        System.out.println(student.stu_email);
//        System.out.println(student.stu_address);

        Student stu3 = new Student("김지니", 25, "allie7019@", "부산");

        //메소드 호출
        student.showInfo();

    }
}
