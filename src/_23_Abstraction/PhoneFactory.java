package _23_Abstraction;

public class PhoneFactory extends Factory {

    //추상클래스를 상속받으면 반드시!! 재정의(오버라이드) 해줘야함
    //구현해야 하는 추상 메소드

//객체 생성과 동시에 생성자(name) 받도록 - super(name) 호출하기 위해서 부모클래스에도 생성자 정의해줘야함
    public PhoneFactory(String name) {
        super(name);                         //super(name) 으로 Factory 의 name 받아옴
    }


    @Override
    public void produce(String model) {
        System.out.println("[" + model + "] 스마트폰을 생산합니다.");
    }

    @Override
    public void manage() {
        System.out.println(getName() + " 공장을 관리합니다.");
    }

}
