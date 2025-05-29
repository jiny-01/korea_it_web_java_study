package _21_Class.Dog;

//Dog 클래스-> 설계도면
public class Dog {
    //클래스의 필드 => 속성
    String name;
    int age;

    //클래스의 메소드 => 기능
    public void bark(){
        System.out.println("왈왈");
    }

    public void sleep() {
        System.out.println("잠자기");
    }
}
