package _25_casting.Animal;

public class Cat extends Animal {

    @Override
    public void speak() {
        System.out.println("야옹");
    }

    //고유메소드
    public void grooming() {
        System.out.println("고양이가 그루밍을 한다.");
    }

}
