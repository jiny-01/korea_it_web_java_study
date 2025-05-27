package _23_Abstraction;

//Factory 추상 클래스 상속받기
//재정의 다해주기
//고유 메소드 upgrade(String model) => "아이패드 7세대로 업그레이드 되었습니다.
//메인에서 produce("아이패드 6세대")
//upgrade("아이패드 7세대")

public class TabletFactory extends Factory {

    private String tabletName;             //멤버변수 추가

    //생성자 만들기
    public TabletFactory(String name) {
        super(name);       //super(name) 으로 Factory 의 name 호출
//        this.tabletName = model;
    }

//    public TabletFactory(String model) {
//        super(name);
//        this.tabletName = model;
//    }

    //추상클래스의 메소드 재정의
    @Override
    public void produce(String model) {
        System.out.println("[" + model + "] 태블릿을 생산합니다.");
        this.tabletName = model;   //this 생략 가능(tabletName 과 model 이 같지 않기 때문)
    }

    @Override
    public void manage() {
        System.out.println(getName() + " 만드는 공장을 관리합니다.");
    }

    //고유메소드 - upgrade 정의
    public void upgrade(String model) {
        System.out.println(model + "로 업그레이드 되었습니다.");
        System.out.println(tabletName +"에서" + model + "로 업그레이드 되었습니다.");
    }


}
