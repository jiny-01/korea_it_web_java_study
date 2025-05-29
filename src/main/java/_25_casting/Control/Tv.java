package _25_casting.Control;

public class Tv implements Power{

    @Override
    public void on() {
        System.out.println("Tv의 전원을 켜다");
    }

    @Override
    public void off() {
        System.out.println("Tv의 전원을 끄다");
    }

    public void channelChange() {
        System.out.println("채널을 바꾸다");
    }

}
