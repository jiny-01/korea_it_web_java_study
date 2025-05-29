package _21_Class.Car;

public class Car {
    //클래스의 필드 => 속성
    //필드 --- 속성 --- 멤버변수

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
//    Car(String carNm) {  //String carName 가능 -> 일반적으로 매개변수명이랑 일치
//        System.out.println("carName 의 속성 값이 부여된 자동차");
//        System.out.println("=>Required ArgsConstructor");
//        this.carName = carNm;    //this : 자기 자신, 클래스의 객체에 넣은 속성   //여기도 carNm 대신 carName
//        carName = carNm;  //이렇게 객체와 매개변수의 이름이 다르면 this 생략 가능
//    }


    Car(String carName) {
        System.out.println("carName 의 속성 값이 부여된 자동차");
        System.out.println("=>Required ArgsConstructor");
        this.carName = carName;                                //이게 된다는 것? -> this 생략 가능

    }

//위에 String carNm 에 carNm 대신 carName 된다 했는데
// 그러면 this 줄에 carName 과 위에 String CarName 은 같은지, 다른지?

    //this 해당 클래스로 만들어진 객체를 의미
    //this 를 왜 써야하는가? => 속성의 이름과 매개변수의 이름이 같을 때 명확히 하기 위해서
    //그렇다면 이름이 다르다면 this 는 생략 가능
    //만약, carName = carName; 이라면 속성에 자기 자신을 대입하는 거라 의미가 없다
    //하지만 this.carName 이라고 명시를 해두면 속성에 매개변수 값 대입이라는 뜻



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
