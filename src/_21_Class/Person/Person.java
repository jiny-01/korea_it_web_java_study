package _21_Class.Person;

public class Person {

    public String name;   //
    protected int age;
    String address;
    private String id; //주민등록번호

    //*접근제어자 -> 정보은닉 목적
    //- public - 어디서든 접근 가능
    //- default - 같은 패키지에서만 접근 가능 (아무것도 안 적으면 default- 명시 따로 하지 않음)
    //- protected - 같은 패키지 또는 자식 클래스에서만 접근 가능
    //- private - 해당 클래스 내부에서만 접근 가능 -> 클래스의 메인에선 불가능
}
