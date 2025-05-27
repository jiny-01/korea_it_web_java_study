package _21_Class.Person;

public class PersonMain {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.name);    //name public 이므로 접근 가능
        System.out.println(person.age);     //protected-Person 같은 패키지 내 사용가능
        System.out.println(person.address); //default - 같은 패키지내에서만 가능
//        System.out.println(person.id);      //private - Person(본인클래스) 안에서만 작동 ->PersonMain 에서도 불가능

    }
}
