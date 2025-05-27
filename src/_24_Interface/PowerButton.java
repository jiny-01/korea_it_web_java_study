package _24_Interface;

public class PowerButton extends Button{

    private boolean status;    //현재 상태를 나타내기 위함

    //오버라이드(재정의) 하기 위해서 Button 의 오버라이드에 abstract 해주기->Button 도 abstract 클래스로 해주기

    @Override
    public void onPressed() {
        if(status) {
            status = false;
            System.out.println("전원을 끕니다.");
        } else {
            status = true;
            System.out.println("전원을 켭니다");
        }
    }


}
