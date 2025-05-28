package _25_casting.Control;

public class SmartPhone implements Power{
    @Override
    public void on() {
        System.out.println("스마트폰의 전원을 켜다");
    }

    @Override
    public void off() {
        System.out.println("스마트폰의 전원을 끄다");
    }

    public void call() {
        System.out.println("스마트폰으로 전화를 걸다");
    }

}
