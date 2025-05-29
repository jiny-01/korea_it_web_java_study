package _21_Class.WaterBottle;

public class WaterBottle {
    private int currentWater;

    WaterBottle() {
        System.out.println("현재 잔액: " + currentWater);
    }


    public int getCurrentWater() {
        return currentWater;
    }


    //메소드 정의
    public void fill(int amount) {
        if (amount > 0 && currentWater + amount <= 1000) {
            System.out.println(amount + "의 양만큼 물병에 물을 채웠습니다. 현재 물의 양: " + currentWater);

//            if (result > 1000) {
//                System.out.println("최대용량 1000을 넘을 수 없다");
//            } else {
//                System.out.println("현재 남은 물 : ");
//            }
        } else {
            System.out.println("값을 다시 입력하세요");
        }
    }

    public void drink(int amount) {
        if (amount > 0 && amount <= currentWater) {
            currentWater -= amount;
//            System.out.println(amount + "ml 마셨습니다. 현재 남은 물: " + currentWater + "ml");
            System.out.println(amount + "의 양만큼 물병에 물을 마셨습니다. 현재 물의 양: " + currentWater);
        } else {
            System.out.println("0이하의 물을 마시거나 물병의 양을 초과하여 마실 수 없습니다. 현재 물의 양: " + currentWater);
        }
    }
}
