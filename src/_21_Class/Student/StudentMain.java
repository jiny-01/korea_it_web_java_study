package _21_Class.Student;

import _21_Class.Car.Car;

public class StudentMain {
    public static void main(String[] args) {
        //이름이 student 인 클래스 정의
        Student student = new Student("김지니", 25, "allie7019@naver.com", "부산");
             student.setName("홍길동");   //setter 로 값 수정 가능


        // 기본 생성자


        //객체생성
//        student.name = "김지니";
//        student.age = 25;
//        student.email = "allie7019@naver.com";
//        student.address = "부산 해운대";

        //값 변경
        System.out.println(student.getEmail());



//        System.out.println(student.name);
//        System.out.println(student.age);
//        System.out.println(student.email);
//        System.out.println(student.address);

//        Student(String name, int age, String email, String address) {
//            System.out.println("모든 속성 값이 부여된 학생");
//            System.out.println("=>AllArgsConstructor");
//
//        }

        Student stu3 = new Student("김지니", 25, "allie7019@", "부산");

        //메소드 호출
        student.showInfo();

    }
}
