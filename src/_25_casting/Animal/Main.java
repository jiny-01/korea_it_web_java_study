package _25_casting.Animal;

public class Main {
    public static void main(String[] args) {
        //업캐스팅
        //자식 클래스의 객체를 부모 클래스 타입으로 참조하는 것
        //즉, 자식 클래스의 인스턴스(=객체)를 부모 클래스 타입의 변수에 저장하는 것

        //Java 에서의 업캐스팅은 다형성을 구현하는 핵심 개념 -> 업캐스팅까지 되어야 완전한 다형성

        Dog d = new Dog();
        d.speak();
        d.wagTail();

        //업캐스팅 (자식 => 부모), 형변환 명시 안해도 됨
        //업캐스팅 방법1 A a = new B();
        //a는 Animal 타입이지만, 내부적으로는 Dog 의 객체가 들어있다.
        Animal a = new Dog();
        //Animal 객체를 a => new Dog()객체를 담는 것

        //동적 바인딩 - 호출할 때 자식 메소드 먼저
        a.speak();       //오버라이드된 자식 메소드(Dog) 호출
//        a.wagtail();   //이건 불가능, animal 참조하기 떄문

        //다운캐스팅 방법 1 (부모(Animal) => 자식(Dog)) 형변환 명시를 해야함
        ((Dog) a).wagTail();       //일시적 형변환   (a 는 일시적으로 Dog- 원래는 Animal 이었음),

        //업캐스팅 방법2
        Animal a2 = d;
        a2.speak();

        //다운캐스팅 방법2
        Dog d2 = (Dog) a2;   //Dog 클래스를 참조하는 새로운 변수 d2를 만들어서 (Dog) a2, 즉 다운캐스팅한 객체를 대입


        //다양한 자식들을 하나의 클래스 타입으로 처리할 수 있음
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();
        Dog[] dogs = {
                dog1,
                dog2,
                dog3,
        };

        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal bird = new Bird();

        //Animal 이라는 한 가지 타입(클래스)으로 여러 자식 클래스를 넣을 수 있음. -> 다형성
        Animal[] animals = {
                dog,
                cat,
                bird,
        };

        //향상된 for 문 이용 - 각 클래스의 메소드를 호출
        for(Animal animal : animals) {
            animal.speak();
        }

    }
}
