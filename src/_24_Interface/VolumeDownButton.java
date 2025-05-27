package _24_Interface;

//볼륨다운 버튼 - Button 상속
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
