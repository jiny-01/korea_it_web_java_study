package _24_Interface;

//채널 다운 버튼 - Button 상속
public class ChannelDownButton extends Button{

    @Override
    public void onPressed() {
        System.out.println("채널을 한 칸 올립니다.");
    }

    @Override
    public void onDown() {
        super.onDown();
        System.out.println("채널을 계속 내립니다.");
    }
}
