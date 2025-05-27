package _24_Interface;

//채널업 버튼 - Button 상속
public class ChannelUpButton extends Button{

    //press- 한칸씩
    @Override
    public void onPressed() {
        System.out.println("채널을 한 칸 올립니다.");
    }

    //onUP- 쭉
    @Override
    public void onUp() {
        super.onUp();
        System.out.println("채널을 계속 올립니다.");
    }
}
