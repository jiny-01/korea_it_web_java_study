package _23_Abstraction;

//Factory 추상 클래스 상속받기
//재정의 다해주기
//고유 메소드 upgrade(String model) => "아이패드 7세대로 업그레이드 되었습니다.
//메인에서 produce("아이패드 6세대")
//upgrade("아이패드 7세대")

public class TabletFactory extends Factory {


    public TabletFactory(String name) {
        super(name);
    }

    //추상클래스의 메소드 재정의

    @Override
    public void produce(String model) {
        System.out.println("[" + model + "] 태블릿을 생산합니다.");
    }

    @Override
    public void manage() {
        System.out.println(getName() + " 공장을 관리합니다.");
    }

    //고유메소드 정의
    public void upgrade() {
        System.out.println("아이패드 7세대로 업그레이드 되었습니다.");
    }


}
