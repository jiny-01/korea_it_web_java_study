package _21_Class.Student;

public class Student {

    //클래스 속성 = 이름, 나이, 이메일, 주소
    private String name;
    private int age;
    private String email;
    private String address;

    //private 일 때 값을 넣는 방법
    //1. 생성자
    //2. setter

//1. 생성자 이용
    //Alt + Insert 누르면 생성자 자동 생성 -> 생성자 만듦과 동시에 속성 넣기
    public Student(String name, int age, String email, String address) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.address = address;
    }

    // public Student 로 생성되는 이유
    // => Student 라는 클래스 자체가 public 이므로 생성자도 자동적으로 public

//2. setter - 값 넣기, 수정 둘 다 가능  -> Alt + Insert 해서 setter 사용
    //setter 라는 메소드 통해서 값에 접근

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    //3. getter -> private 값 가져옴
    //setter 라는 메소드 통해서 값에 접근

    public String getName() {
        return name;            //this.name (name 속성에 접근) 생략된 것
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    //
    //클래스 메소드 - showInfo() 정보출력
    public void showInfo() {
        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
        System.out.println("이메일: " + email);
        System.out.println("주소: " + address);
    }
}

