package Wildcard.UpperBoundedWildcard;

public class ExtendsWildcard {
    //<? extends Animal>  -Animal 상속
    //Dog, Cat, Animal 등 Animal 을 포함한 모든 타입을 받을 수 있다.
    //상한 경계 와일드카드 (상위 클래스 제한)
    //읽기만 됨, 쓰기는 안됨
    //반환타입은 Animal 로 취급

    //Animal 또는 Animal 을 상속한 타입만 받겠다 (Animal 부터 아래만 받는단 의미)
    public static void makeSound(Box<? extends Animal> box) {
        Animal animal = box.getItem();          //animal, dog, cat 의 getItem 은 다 Animal 로 업캐스팅해서 받겠다
        animal.sound();

//        box.setItem(new Dog());         //쓰기는 불가능
        //이유: Box<? extends Animal>은 정확한 타입이 뭔지 몰라서 쓰기를 제한

    }

}
