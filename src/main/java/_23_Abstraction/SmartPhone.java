package _23_Abstraction;

public class SmartPhone extends Factory {

    private String model;  // 필드로 선언

    public SmartPhone(String name, String price) {
        super(name, price);   //Factory 의 name, price 생성자 호출
    }

    @Override
    public void produce(String model) {
        this.model = model;
        System.out.println(getName()  + " 공장에서 " + model + " 스마트폰을 생산합니다. 가격: " + getPrice() + "원");
    }

    @Override
    public void manage() {
        System.out.println(getName() + " 공장에서 스마트폰 품질을 관리합니다.");
    }

    //고유메소드 정의 - call, send, takePhoto
    public void call(String number) {
        System.out.println(model + " 스마트폰이 " + number + " 번으로 전화를 겁니다.");
    }

    public void send(String message) {
        System.out.println(model + "이" + message + "라고 문자를 전송합니다.");
    }

    public void takePhoto(String thing) {
        System.out.println(model + "이" + thing + "을 촬영합니다.");
    }


}
