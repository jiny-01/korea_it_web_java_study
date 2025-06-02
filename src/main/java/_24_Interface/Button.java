package _24_Interface;

//extends => 단일 상속 (클래스, 추상클래스)
//implements => 다중 상속 (only 인터페이스)

//마찬가지로 오버라이드 해줘야 에러 안뜸
public abstract class Button implements Press, Up, Down{

    //오버라이드
    @Override
    public void onUp() {

    }

    @Override
    public abstract void onPressed();
    //전원, 채널, 볼륨 버튼에서 무조건 재정의 해준다. -> 필수 구현해야하는 공통적 기능 -> abstract 붙음
    //추상 메소드가 하나라도 있으면-> 추상클래스이므로 Button 은 추상클래스

    @Override
    public void onDown() {

    }



}
