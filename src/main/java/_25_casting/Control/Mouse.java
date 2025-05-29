package _25_casting.Control;

public class Mouse implements Power{

    @Override
    public void on() {
        System.out.println("마우스의 전원을 켜다");
    }

    @Override
    public void off() {
        System.out.println("마우스의 전원을 끄다");
    }

    public void rClick() {
        System.out.println("마우스 우클릭을 하다");
    }
}
