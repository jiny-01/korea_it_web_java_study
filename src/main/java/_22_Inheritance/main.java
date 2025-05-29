package _22_Inheritance;

public class main {
    public static void main(String[] args) {


        //상속 - 기존 클래스(부모클래스) 의 속성, 기능(메소드)을 새로운 클래스(자식클래스)가 물려받는 것
        //왜 상속 해야하나?
        // => 코드의 재사용성, 계층 구조 설계를 가능하게 해주는 핵심 개념
        // => 유지보수 즉, 공통 기능이 한 곳(부모클래스)에 있으므로,
        //    수정할 일이 생기면 부모 클래스 하나만 고치면 자식클래스에도 반영
        // => 기존 클래스를 수정하지 않고도 새로운 기능을 가진 자식 클래스를 추가할 수 있다. - 개방폐쇄원칙(OCP)

        // *SOLID 원칙
        // 개방-폐쇄 원칙 : 확장에는 열려있고, 수정(변경)에는 닫혀있어야 한다.
        // *자바에서의 객체지향(OOP) 4원칙 -> 캡슐화, 추상화, 상속, 다형성
        // 객체 지향 4대 원칙은 무조건 지켜야하는 것 - 가이드라인 SOLID 원칙(5가지)\

        //자식클래스는 부모의 코드를 그대로 사용
        //자식클래스는 부모의 코드를 그대로 사용하거나, 필요한 기능을 또 추가하거나
        //부모의 코드(메소드) 변경 가능 => 오버라이딩

        //Animal 클래스 객체 생성
        Animal animal1 = new Animal();
        animal1.setAnimalName("고양이");
        animal1.setAnimalAge(3);
        animal1.move();
//        animal1.setstriped / animal1.hunt;    ->setstriped, hunt : 자식의 메소드이므로 부모클래스에선 불가

        //메소드 호출
        animal1.move();

        //호랑이 객체
        Tiger tiger1 = new Tiger();
        tiger1.setAnimalName("호랭이");
        System.out.println(tiger1.getAnimalName());
        tiger1.setAnimalAge(3);
        System.out.println(tiger1.getAnimalAge());
        tiger1.move();
        tiger1.hunt();
        tiger1.setStriped(true);

        Tiger tiger2 = new Tiger("백호", 3, false);
        //객체 생성과 동시에 속성도 함께 정의


        Human human1 = new Human("김지니", 25);


//        human1.setAnimalAge(25);
        System.out.println(human1.getAnimalAge());
//        human1.setAnimalName("김지니");
        System.out.println(human1.getAnimalName());

        //메소드 호출
        human1.move();
        human1.read("자바");
//        human1.printAge();




    }
}
