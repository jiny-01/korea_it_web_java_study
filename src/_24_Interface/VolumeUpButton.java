package _24_Interface;

//볼륨업 버튼 - Button 상속
public class VolumeUpButton extends Button {

    @Override
    public void onPressed() {
        System.out.println("볼륨을 한 칸씩 올립니다.");
    }

    @Override
    public void onUp() {
        super.onUp();
        System.out.println("볼륨을 계속 올립니다.");
    }


}
