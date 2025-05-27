package _25_casting.Animal;

public class Bird extends Animal{

    @Override
    public void speak() {
        System.out.println("짹짹");
    }

    //고유 메소드
    public void fly() {
        System.out.println("새가 하늘을 난다.");
    }
}
