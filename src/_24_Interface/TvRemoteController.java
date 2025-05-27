package _24_Interface;

//Tv 리모컨 구현하기
public class TvRemoteController {

    //Tv 리모컨 (클래스) 의 멤버변수 정의 - 버튼 5개
    private PowerButton powerButton;
    private ChannelUpButton channelUpButton;
    private ChannelDownButton channelDownButton;
    private VolumeUpButton volumeUpButton;
    private VolumeDownButton volumeDownButton;

    //객체 생성과 동시에 생성자 넣기
    public TvRemoteController(PowerButton powerButton, ChannelUpButton channelUpButton,
                              ChannelDownButton channelDownButton,
                              VolumeUpButton volumeUpButton, VolumeDownButton volumeDownButton) {
        this.powerButton = powerButton;
        this.channelUpButton = channelUpButton;
        this.channelDownButton = channelDownButton;
        this.volumeUpButton = volumeUpButton;
        this.volumeDownButton = volumeDownButton;
    }

    //메소드 구현하기
    public void onPressedPowerButton() {
        System.out.print("TV 의 ");
        powerButton.onPressed();   //메소드 안에서 메소드 호출 - private 이므로 바로 접근 불가
                                    //powerButton 안에 정의한 onPressed 메소드 불러오기
    }

    public void onPressedChannelUpButton() {
        System.out.print("TV의 ");
        channelUpButton.onPressed();
    }

    public void onUpChannelUpButton() {
        System.out.print("TV의 ");
        channelUpButton.onUp();
    }

    public void onPressedChannelDownButton() {
        System.out.print("TV의 ");
        channelDownButton.onPressed();
    }

    public void onDownChannelDownButton() {
        System.out.print("TV의 ");
        channelDownButton.onDown();
    }

    public void onPressedVolumeUpButton() {
        System.out.print("TV의 ");
        volumeUpButton.onPressed();
    }

    public void onUpVolumeUpButton() {
        System.out.print("TV의 ");
        volumeUpButton.onUp();
    }

    public void onPressedVolumeDownButton() {
        System.out.print("TV의 ");
        volumeDownButton.onPressed();
    }

    public void onDownVolumeDownButton() {
        System.out.print("TV의 ");
        volumeDownButton.onDown();
    }
}
