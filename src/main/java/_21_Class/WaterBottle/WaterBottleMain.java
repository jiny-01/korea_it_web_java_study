package _21_Class.WaterBottle;

public class WaterBottleMain {
    public static void main(String[] args) {

        //객체 생성
        WaterBottle waterBottle = new WaterBottle();


        waterBottle.fill(500);
        waterBottle.drink(100);

        System.out.println(waterBottle.getCurrentWater());
    }
}
