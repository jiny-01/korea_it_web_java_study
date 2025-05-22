package _21_Class.Car;

public class CarMain {
    public static void main(String[] args) {
        Car car1 = new Car();  //car1 객체는 carName 속성으로 "아반떼" 를 받는 것
        System.out.println(car1.carName);

        Car car2 = new Car("아반떼"); //this.carName 에 carName 으로 "아반떼"를 받음
                                            //이 때 this => car2 => 객체

        Car car3 = new Car("싼타페", 2025, "white");
    }
}
