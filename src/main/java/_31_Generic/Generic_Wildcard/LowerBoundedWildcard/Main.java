package _31_Generic.Generic_Wildcard.LowerBoundedWildcard;

public class Main {
    public static void main(String[] args) {
        Box<Animal> animalBox = new Box<>();

        SuperWildcard.putDog(animalBox);    //OK 가능함 - animal 은 Dog 보다 상위타입이기 때문

//        Box<Maltese> malteseBox = new Box<>();
//        SuperWildcard.putDog(malteseBox);           //불가능 Dog 이상만 가능

        Box<Dog> dogBox = new Box<>();
        SuperWildcard.putDog(dogBox);
    }
}
