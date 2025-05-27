package _23_Abstraction;

public class Main {
    public static void main(String[] args) {

        PhoneFactory phoneFactory = new PhoneFactory("애플");    //Factory-PhoneFactory클래스 객체 phoneFactory 생성
        phoneFactory.setName("삼성");

        //메소드 불러오기
        phoneFactory.produce("아이폰 16");
        phoneFactory.manage();
        phoneFactory.displayInfo();

//        Factory factory = new Factory();  //이건 불가능(추상클래스는 객체 생성 불가)


        Factory factory = new Factory("애플") {           //factory(객체 이름 애플)는 익명 클래스(자식클래스의 객체)
            //즉석에서 잠시 오버라이딩
            @Override
            public void produce(String model) {
                System.out.println("잠깐 만들어진 익명클래스가 무언가 생성합니다.");
            }

            @Override
            public void manage() {
                System.out.println("잠깐 만들어진 익명클래스가 공장을 관리합니다.");
            }
        };

        factory.manage();
        factory.produce("스마트폰");

        //익명 클래스 => 추상클래스의 객체처럼 보이지만 아님, 자식 클래스를 즉석(main) 에서 임시로 만들어서 객체를 생성한 것
        //재사용하지 않고 한 번만 쓰고 버릴 거라면 익명클래스 사용

        //즉 임시로 만들어진 이름없는 자식 클래스 == 익명클래스 = 자식 클래스의 객체
        //그러므로 추상클래스의 객체가 만들어진 것이 아니기 때문에 추상클래스의 개념(객체 생성 불가)에 위배되는 것은 아니다.


        TabletFactory ipad = new TabletFactory("apple");
        ipad.setName("아이패드6세대");

git
        //메소드 호출
        ipad.produce("아이패드 6세대");
        ipad.manage();

        ipad.upgrade("아이패드 7세대");




    }
}
