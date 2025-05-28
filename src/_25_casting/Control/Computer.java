package _25_casting.Control;

public class Computer implements Power{

    @Override
    public void on() {
        System.out.println("컴퓨터의 전원을 켜다");
    }

    @Override
    public void off() {
        System.out.println("컴퓨터의 전원을 끄다");
    }

    public void darkMode() {
        System.out.println("컴퓨터를 야간모드로 바꾸다");
    }


}
