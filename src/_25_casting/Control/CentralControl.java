package _25_casting.Control;

public class CentralControl {

    private Power[] deviceArray;       //기기들은 모두 Power 상속받으므로 배열 타입 Power


    public CentralControl(Power[] deviceArray) {
        this.deviceArray = deviceArray;
    }


    public void addDevice(Power device) {

        int emptyIndex = checkEmpty();

        if(emptyIndex == -1) {
            System.out.println("더 이상 장치를 추가할 수 없습니다.");
            return;
        }

        deviceArray[emptyIndex] = device;  // **이 부분 추가**
        System.out.println(device.getClass().getSimpleName() +"장치가 연결되었습니다.");
        //device. => 메모리주소가 같이 나올 것
        //device.getClass() => 메모리주소 제외 클래스가 있는 패키지명, 클래스 나옴
        //device.getClass().getSimpleName() => 클래스명만 나옴
    }



    public int checkEmpty() {
        //for 반복문 이용
        //조건 array[i] == null 이면 return
        for (int i = 0; i < deviceArray.length; i++) {
            if (deviceArray[i] == null) {
//                System.out.println("해당 배열은 비어있음");
                return i;          //빈자리 찾았을 때
            }
        }
        return -1;         //다 차있을 때
    }



        //향상된 for 문 이용
        public void powerOn() {
            for(Power device : deviceArray) {
                if(device == null) {
                    System.out.println("장치가 등록 되어있지 않은 슬롯입니다.");
                    continue;
                }
                device.on();
            }
        }

        //Power를 모두 상속하기 때문에 device 자동적으로 업캐스팅
        //continue 없으면 device.on 했을 때 null 이므로 null포인트 에러 발생할 것


        //일반 for 문 이용
        public void powerOff(){
            for (int i = 0; i < deviceArray.length; i++) {
                if (deviceArray[i] == null) {
                    System.out.println("디바이스가 없습니다.");
                    continue;
                }

                deviceArray[i].off();

            }
        }


        public void performSpecificMethod() {
            for (Power device : deviceArray) {
                if(device instanceof Computer) {
                    Computer computer = (Computer) device;     //computer 가 아닐 경우 ClassCastException->instance of
                    computer.darkMode();
                } else if (device instanceof Tv) {
                    Tv tv = (Tv) device;
                    tv.channelChange();
                } else if (device instanceof Mouse) {
                    Mouse mouse = (Mouse) device;
                    mouse.rClick();
                } else if (device instanceof Speaker) {
                    Speaker speaker = (Speaker) device;
                    speaker.control();
                } else if (device instanceof LEDLight) {
                    LEDLight ledLight = (LEDLight) device;
                    ledLight.downLight();
                } else if (device instanceof SmartPhone) {
                    SmartPhone smartPhone = (SmartPhone) device;
                    smartPhone.call();
                }
            }

        }

    }

