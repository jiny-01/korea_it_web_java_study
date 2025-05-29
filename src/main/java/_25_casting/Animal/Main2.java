package _25_casting.Animal;

public class Main2 {
    public static void main(String[] args) {
        //instance of : 해당 객체가 클래스의 인스턴스냐?

        Dog dog1 = new Dog();
//        Animal animal1 = new Animal();
        Animal animal1 = new Dog();   //업캐스팅했으니 animal1 에는 Dog 객체 있는 것과 같음


        //instanceof => 결과값 항상 boolean
        // 객체 instanceof 클래스이름
        boolean result1 = animal1 instanceof Animal;
        System.out.println(result1);     //결과 : true
        boolean result2 = animal1 instanceof Dog;
        System.out.println(result2);     //결과 : true
        //확인하고자 하는 객체가 해당 클래스의 인스턴스이거나
        //자식클래스의 인스턴스일 때 = true

        boolean result3 = dog1 instanceof Dog;  //결과 : true
        System.out.println(result3);
        boolean result4 = dog1 instanceof Animal;  //결과 : true -> animal 입장에서 dog1 은 자식클래스의 인스턴스
        System.out.println(result4);

        // => 잘못된 형변환으로 인해 ClassCastException 예외를 방지할 수 있다.
        Animal animal2 = new Dog();   //업캐스팅
        System.out.println("animal2 를 검증");
        if (animal2 instanceof Dog) {      //animal2 는 결국 Dog 의 객체
            Dog dog2 = (Dog) animal2;      //animal2를 Dog 로 다운캐스팅

            dog2.speak();
            dog2.wagTail();
        }


        Animal animal3 = new Animal();
        System.out.println("animal3 검증");
        if (animal3 instanceof Dog) {      //animal3는 Dog의 상위이므로(업캐스팅 X)-instance 아님 -> 결과 false
            Dog dog3 = (Dog) animal3;      //다운캐스팅 실행안될 것

            dog3.speak();
            dog3.wagTail();
        } else {
            System.out.println("animal3 는 Dog 클래스의 인스턴스가 아님");
        }


    }
}
