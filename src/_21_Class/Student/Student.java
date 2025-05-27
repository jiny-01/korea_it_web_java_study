package _21_Class.Student;

public class Student {

    //클래스 속성 = 이름, 나이, 이메일, 주소
    String stu_name;
    int stu_age;
    String stu_email;
    String stu_address;

    //생성자로 만들기
    Student(String stu_name) {
        System.out.println("stu_name 이란 속성 값이 부여된 학생");
        System.out.println("stu1 =>Required ArgsConstructor");
        this.stu_name = stu_name;
    }

    Student(String stu_name, int stu_age, String stu_email, String stu_address) {
        System.out.println("모든 속성 값이 부여된 학생");
        System.out.println("=>AllArgsConstructor");
        this.stu_name = stu_name;
        this.stu_age = stu_age;
        this.stu_email = stu_email;
        this.stu_address = stu_address;
    }


    //클래스 메소드 - showInfo() 정보출력
    public void showInfo() {
        System.out.println("이름: " + stu_name);
        System.out.println("나이: " + stu_age);
        System.out.println("이메일: " + stu_email);
        System.out.println("주소: " + stu_address);
    }

}







