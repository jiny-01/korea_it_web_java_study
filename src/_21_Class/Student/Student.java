package _21_Class.Student;

public class Student {

    //클래스 속성 = 이름, 나이, 이메일, 주소
    String stu_name;
    int stu_age;
    String stu_email;
    String stu_address;


    //클래스 메소드 - showInfo() 정보출력
    public void showInfo() {
        System.out.println("이름: " + stu_name);
        System.out.println("나이: " + stu_age);
        System.out.println("이메일: " + stu_email);
        System.out.println("주소: " + stu_address);
    }
}

