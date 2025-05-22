package _21_Class.Car;

public class Car {
    String carName;
    int carYearModel;
    String carColor;

    //생성자
    Car() { // 빈 상태 - 기본생성자
        System.out.println("필드가 아무것도 정해지지 않은 껍데기 자동차");
        System.out.println("=>NoArgsConstructor");
        //**No Argument Constructor - 현재 필드에 값이 아무것도 들어가있지 않은 껍데기
    }

    //CarName 을 받는 생성자 -> 오버로딩과도 같음
    Car(String carNm) {  //String carName 가능 -> 일반적으로 매개변수명이랑 일치
        System.out.println("carName 의 속성 값이 부여된 자동차");
        System.out.println("=>Required ArgsConstructor");
        this.carName = carNm;    //this : 자기 자신, 즉 속성   //여기도 carNm 대신 carName
    }

    //위에 String carNm 에 carNm 대신 carName 된다 했는데
    // 그러면 this 줄에 carName 과 위에 String CarName 은 같은지, 다른지?
    Car(String carName) {
        System.out.println("carName 의 속성 값이 부여된 자동차");
        System.out.println("=>Required ArgsConstructor");
        this.carName = carName;                                //이게 된다는 것?
    }

    Car(String carName, int carYearModel, String carColor) {
        System.out.println("모든 속성 값이 부여된 자동차");
        System.out.println("=>AllArgsConstructor");
        this.carName = carName;
        this.carYearModel = carYearModel;
        this.carColor = carColor;
    }

    //메소드 정의 - 시동, 전진, 정지
    public void startCar() {
        System.out.println(carName + "이 시동을 겁니다");
    }

    public void drive() {
        System.out.println(carName + "이 전진합니다.");
    }

    public void stop() {
        System.out.println(carName + "이 정지합니다.");
    }
}
