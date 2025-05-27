package _24_Interface;

public class VolumeDownButton extends Button{

    @Override
    public void onPressed() {
        System.out.println("볼륨을 한 칸씩 내립니다.");
    }

    @Override
    public void onDown() {
        super.onDown();
        System.out.println("볼륨을 쭉 내립니다.");
    }
}
