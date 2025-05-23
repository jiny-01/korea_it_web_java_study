package _21_Class.BankAccount;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();

        bankAccount.deposit(10000);
        bankAccount.deposit(-4000);

        bankAccount.withdraw(1000);
        bankAccount.withdraw(15000);

        System.out.println(bankAccount.getBalance());
    }

    //문제
    //WaterBottle 패키지 => WaterBottle 클래스, WaterBottleMain 클래스
    //currentWater 현재 물의 양
    //메소드
    //물 채우기(fill) => 최대용량인 1000을 넘을 수 없다.
    //물 마시기(drink) => 현재 물의 양보다 초과해서 마실 수 없다.
    //getter 를 통해 현재 물병의 물의 양에 접근할 수 있다.
}
