package _25_casting.Control;

public class Speaker implements Power{

    @Override
    public void on() {
        System.out.println("스피커의 전원을 켜다");
    }

    @Override
    public void off() {
        System.out.println("스피커의 전원을 끄다");
    }

    public void control() {
        System.out.println("볼륨을 조절하다");
    }
}
