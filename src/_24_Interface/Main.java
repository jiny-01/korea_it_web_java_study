package _24_Interface;

public class Main {

    //객체 생성 시 생성자로 5개 넣어줌
    public static void main(String[] args) {
        TvRemoteController tvRemoteController = new TvRemoteController(
                new PowerButton(),
                new ChannelUpButton(),
                new ChannelDownButton(),
                new VolumeUpButton(),
                new VolumeDownButton()
        );

        tvRemoteController.onPressedPowerButton();
        tvRemoteController.onPressedChannelUpButton();
        tvRemoteController.onDownChannelDownButton();
    }






}
