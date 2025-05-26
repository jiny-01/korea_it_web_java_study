package _23_Abstraction;

//추상클래스 (가이드라인)
//abstract => 추상적인, 형태만 있는
//틀은 있지만 내용은 없는 클래스
//이 기능은 꼭 있어야해! 근데 이 기능 구현은 자식클래스에서 해!
//객체를 만들 수는 없음.  - 추상클래스로 만들어진 슈퍼클래스(틀만 제공)는 객체 생성 불가
//but 잠깐 만들고 없앨 수는 있음 (이름 없는 자식클래스 = 익명 자식클래스)
//왜 써야하는가?
//설계 일관성과 확장성 확보 => 공통된 구조를 가진 자식 클래스들을 설계
//오류방지 / 강제 구현 => 추상 메서드를 구현하지 않으면 에러가 발생(필수 기능 구현 누락 방지)
//코드 재사용성 => 공통 메소드나 필드를 추상클래스에 미리 작성 가능
//추상 클래스 => 추상 메소드가 하나라도 있으면 추상클래스

public abstract class Factory {         //abstract class : 추상클래스 명시

    //필수적 필드(멤버변수) 정의
    private String name;


    //객체 생성됨과 동시에 생성자 받도록 - PhoneFactory 에서 super(name)으로 호출하기 위함
    public Factory(String name) {
        this.name = name;
    }

    //추상클래스의 추상 메서드 정의 abstract void- 공장 설명(이름), 설명(생산)
    public abstract void produce(String model);      //produce 메소드가 있음을 명시만 함

    public abstract void manage();
    //-> 추상 메소드 produce, manage 메소드는 반드시 자식클래스에서 오버라이딩해야함

    //getter
    public String getName() {
        return name;
    }

    //setter
    public void setName(String name) {
        this.name = name;
    }

    //추상메소드말고 일반 메소드도 가능
    public void displayInfo() {
        System.out.println("공장 정보를 출력합니다. 공장이름: " + name);
    }



}
