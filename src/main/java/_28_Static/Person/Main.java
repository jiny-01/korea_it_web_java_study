package _28_Static.Person;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("홍길동");
        Person person2 = new Person("김춘향");

        person1.sayHello();   //인스턴스 수준의 메소드
        person2.sayHello();

        Person.showPopulation();  //클래스 수준의 메소드 - Person(클래스) 수준

    }
}
