package _21_Class.BankAccount;

public class BankAccount {
    private int balance;    //잔액
//    private Integer balance;
    //int balance -> 0  /  Integer balance -> null
    //Integer: 클래스 이므로 null 을 포함한 정수 - Integer balance 하면 null 로 나올 것
    //balance 변수 만듦과 동시에 초기화 해줘야함, or 검증해줘야함

    BankAccount() {
        System.out.println("계좌가 개설되었습니다. 현재 잔액: " + balance + "원");
    }


    //getter 이용해서 값 가져오기 -> private 로 했기 때문
    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("계좌에" + amount + "원 입금되었습니다. 현재 잔액은: " + balance + "원");
        } else {
            System.out.println("0원 이상만 입금 가능합니다");
        }
    }

    //멤버변수(balance) 와 매개변수(amount)다르기 때문에 this 생략 가능한 것




    public void withdraw(int amount) {
            if(amount >= 0 && amount <= balance) {
                balance -= amount;
                System.out.println(amount + "원 출금되었습니다. 현재 잔액은: " + balance + "원");
            } else {
                System.out.println("잔액이 부족합니다. 현재 잔액은: " + balance + "원");
            }

            //출금액 >=0 , <balance 보단 작음

    //그럼 입금과 출금을 담당하는 메소드들은 setter 와 같다고 할 수 있는가?
    //속성값을 변경한다는 관점으로 보면 그렇다 라고 할 수 있다.
    //다만 setter 와 이러한 메소드들의 차이를 이해해야한다.
        //1. setter 는 속성값을 직접적으로 변경하고 있다.
        //2. 입금, 출금 메소드는 메소드 명에서 드러나듯이( 계산, 즉 행위가 이루어짐)
        //행위에 중점을 둔다 -> 값을 직접적으로 변경하고 있는게 아니라 값을 계산해서 변경

    //setter 는 검증 단계를 보통은 포함하지 않는다.
    //하지만 메소드는 보통은 검증 단계(조건문)를 포함할 수 있다. (필수는 아님)


        }
    }

