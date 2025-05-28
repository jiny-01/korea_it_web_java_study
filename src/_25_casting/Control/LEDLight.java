package _25_casting.Control;

public class LEDLight implements Power{

    @Override
    public void on() {
        System.out.println("LED 의 전원을 켜다");
    }

    @Override
    public void off() {
        System.out.println("LED 의 전원을 끄다");
    }

    public void downLight() {
        System.out.println("밝기를 한 칸 낮추다");
    }
}
